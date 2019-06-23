package com.dbpigmentationapp.subMenus.finalViews;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.dbpigmentationapp.R;

public class InformacionPigmentoFragment extends Fragment {

    private ImageView colorimetria;
    private TextView descColorimetria;
    private Animation animationUp;
    private Animation animationDown;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_informacion_pigmento, container, false);

        colorimetria = view.findViewById(R.id.imgColorimetria);
        descColorimetria = view.findViewById(R.id.descColorimetria);
        descColorimetria.setVisibility(View.GONE);

        animationUp = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_up);
        animationDown = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_down);

        colorimetria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(descColorimetria.isShown()){
                    descColorimetria.setVisibility(View.GONE);
                    descColorimetria.startAnimation(animationUp);
                }
                else{
                    descColorimetria.setVisibility(View.VISIBLE);
                    descColorimetria.startAnimation(animationDown);
                }
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
