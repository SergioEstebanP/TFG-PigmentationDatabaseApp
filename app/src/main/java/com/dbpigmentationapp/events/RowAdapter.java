package com.dbpigmentationapp.events;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.dbpigmentationapp.R;
import com.dbpigmentationapp.dataModel.CartaPigmentos;

import java.util.ArrayList;

public class RowAdapter extends ArrayAdapter<CartaPigmentos> implements View.OnClickListener {

    Context context;
    private ArrayList<CartaPigmentos> cartas;

    @Override
    public void onClick(View v) {
        int position = (Integer) v.getTag();
        System.out.println(position);
        Object object = getItem(position);
        CartaPigmentos carta = (CartaPigmentos) object;

        System.out.println(v.getId());
        switch (v.getId()) {
            case R.id.itemInfo:
                Snackbar.make(v, "Release date " + carta.getNombre(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();
                break;
        }
    }

    private int lastPosition = -1;

    private static class ViewHolder {
        TextView nombre;
        TextView descripcion;
        CardView color;
        TextView elemento;
    }

    public RowAdapter(Context context, ArrayList<CartaPigmentos> cartas) {
        super(context, R.layout.row, cartas);
        this.context = context;
        this.cartas = cartas;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        CartaPigmentos carta = getItem(position);

        ViewHolder viewH;
        final View finalView;

        if (view == null) {
            viewH = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.row, parent, false);
            viewH.nombre = view.findViewById(R.id.itemInfo);
            viewH.descripcion = view.findViewById(R.id.descripcion);
            viewH.color = view.findViewById(R.id.color);
            viewH.elemento = view.findViewById(R.id.elemento);
            finalView = view;
            view.setTag(viewH);
        } else {
            finalView = view;
            viewH = (ViewHolder) view.getTag();
        }

        Animation animation = AnimationUtils.loadAnimation(context, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        finalView.startAnimation(animation);
        lastPosition = position;

        viewH.nombre.setText(carta.getNombre());
        viewH.descripcion.setText(carta.getDescripcion());
        viewH.color.setCardBackgroundColor(Color.parseColor(carta.getColor()));
        viewH.elemento.setText(carta.getElemento());

        return view;
    }
}
