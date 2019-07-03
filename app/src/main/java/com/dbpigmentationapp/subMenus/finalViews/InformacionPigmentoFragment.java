package com.dbpigmentationapp.subMenus.finalViews;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.dbpigmentationapp.R;
import com.dbpigmentationapp.ServicesSupport.GlobalState;
import com.dbpigmentationapp.dataBase.DataCreation;
import com.dbpigmentationapp.dataBase.DbHandler;
import com.dbpigmentationapp.dataModel.Colorimetria;
import com.dbpigmentationapp.dataModel.Sinonimo;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.view.LineChartView;

public class InformacionPigmentoFragment extends Fragment {

    private DbHandler db;

    private TextView nombre;
    private CardView color;
    private TextView sinonimo;
    private TextView formula;
    private TextView elemento;
    private TextView coordenadasTricromicas;
    private TextView colorBase;


    // GRAFICAS

    private ImageView imgColorimetria;
    private CardView chartColorimetria;
    private LineChartView colorimetriaChart;

    private ImageView imgIr;
    private CardView chartIr;
    private LineChartView irChart;

    private ImageView imgRx;
    private CardView chartRx;
    private LineChartView rxChart;

    private ImageView imgRaman;
    private CardView chartRaman;
    private LineChartView ramanChart;

    private Animation animationUp;
    private Animation animationDown;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        db = new DbHandler(this.getContext());
        List<Sinonimo> sinonimos = db.todosSinonimosPigmento("id", GlobalState.PIGMENTO_SELECCIONADO.getIdPigmento());
        String sinonimoValue;
        if (sinonimos.size() > 1) {
            sinonimoValue = sinonimos.get(1).getValor();
        } else {
            sinonimoValue = sinonimos.get(0).getValor();
        }

        View view = inflater.inflate(R.layout.fragment_informacion_pigmento, container, false);

        // Rellenamos la informacion mas importante y basica del pigmento seleccionado
        nombre = view.findViewById(R.id.nombrePigmento);
        color = view.findViewById(R.id.colorPigmento);
        sinonimo = view.findViewById(R.id.valueSinonimo);
        formula = view.findViewById(R.id.valueFormula);
        elemento = view.findViewById(R.id.valueElemento);
        coordenadasTricromicas = view.findViewById(R.id.valueCoordenadas);
        colorBase = view.findViewById(R.id.valueColorBase);

        nombre.setText(GlobalState.PIGMENTO_SELECCIONADO.getNombre());

        Colorimetria aux = GlobalState.COLOR_SELECCIONADO;
        color.setCardBackgroundColor(ColorUtils.LABToColor(aux.getL(), aux.getA(), aux.getB()));
        sinonimo.setText(sinonimoValue);
        formula.setText(GlobalState.PIGMENTO_SELECCIONADO.getFormula());
        elemento.setText(GlobalState.PIGMENTO_SELECCIONADO.getElementoQuimico());
        coordenadasTricromicas.setText(GlobalState.COLOR_SELECCIONADO.getL() + "-" + GlobalState.COLOR_SELECCIONADO.getA() + "-" + GlobalState.COLOR_SELECCIONADO.getB());
        colorBase.setText(GlobalState.PIGMENTO_SELECCIONADO.getIdColor());

        animationUp = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_up);
        animationDown = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_down);

        // ***********************************
        // GENERACION DE LAS GRAFICAS        *
        // ***********************************

        // COLORIMETRIA
        chartColorimetria = view.findViewById(R.id.colorimetriaDesValue);
        chartColorimetria.setVisibility(View.GONE);
        imgColorimetria = view.findViewById(R.id.imgColorimetria);
//        colorimetriaChart = view.findViewById(R.id.colorimetriaChartView);

//        createChart(GlobalState.Y_IR_AXIS, GlobalState.X_IR_AXIS, colorimetriaChart);
        imgColorimetria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chartColorimetria.isShown()) {
                    chartColorimetria.setVisibility(View.GONE);
                    chartColorimetria.startAnimation(animationUp);
                } else {
                    chartColorimetria.setVisibility(View.VISIBLE);
                    chartColorimetria.startAnimation(animationDown);
                }
            }
        });

        // IR
        DataCreation.getDataIr(GlobalState.PIGMENTO_SELECCIONADO, this.getContext());
        chartIr = view.findViewById(R.id.ftiratrDesValue);
        chartIr.setVisibility(View.GONE);
        imgIr = view.findViewById(R.id.imgFtiratr);
        irChart = view.findViewById(R.id.irChartView);

        createChart(GlobalState.Y_IR_AXIS, GlobalState.X_IR_AXIS, irChart);
        imgIr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chartIr.isShown()) {
                    chartIr.setVisibility(View.GONE);
                    chartIr.startAnimation(animationUp);
                } else {
                    chartIr.setVisibility(View.VISIBLE);
                    chartIr.startAnimation(animationDown);
                }
            }
        });

        // DRX
        DataCreation.getDataRx(GlobalState.PIGMENTO_SELECCIONADO, this.getContext());
        chartRx = view.findViewById(R.id.drxDesValue);
        chartRx.setVisibility(View.GONE);
        imgRx = view.findViewById(R.id.imgDrx);
        rxChart = view.findViewById(R.id.rxChartView);

        createChart(GlobalState.Y_RX_AXIS, GlobalState.X_RX_AXIS, rxChart);
        imgRx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chartRx.isShown()) {
                    chartRx.setVisibility(View.GONE);
                    chartRx.startAnimation(animationUp);
                } else {
                    chartRx.setVisibility(View.VISIBLE);
                    chartRx.startAnimation(animationDown);
                }
            }
        });
        return view;
    }

    private void createChart(List yIrAxis, List xIrAxis, LineChartView chart) {
        final String BLACK_COLOR = "#000000";
        List yAxisValues = yIrAxis;
        Line line = new Line(yAxisValues);
        line.setHasPoints(false);
        line.setColor(Color.parseColor(BLACK_COLOR));
        List lines = new ArrayList();
        lines.add(line);
        LineChartData data = new LineChartData();
        Axis yAxis = new Axis();
        yAxis.setLineColor(Color.parseColor(BLACK_COLOR));
        yAxis.setTextColor(Color.parseColor(BLACK_COLOR));
        Axis xAxis = new Axis();
        xAxis.setLineColor(Color.parseColor(BLACK_COLOR));
        xAxis.setTextColor(Color.parseColor(BLACK_COLOR));
        data.setAxisYLeft(yAxis);
        data.setAxisXBottom(xAxis);
        data.setLines(lines);
        chart.setLineChartData(data);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
