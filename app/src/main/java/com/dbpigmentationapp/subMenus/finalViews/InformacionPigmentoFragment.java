package com.dbpigmentationapp.subMenus.finalViews;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dbpigmentationapp.R;

public class InformacionPigmentoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_informacion_pigmento, container, false);

//        title = view.findViewById(R.id.title);
//        content = view.findViewById(R.id.content);
//        content.setVisibility(View.GONE);
//
//        animationUp = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_up);
//        animationDown = AnimationUtils.loadAnimation(view.getContext(), R.anim.slide_down);
//
//        title.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(content.isShown()){
//                    content.setVisibility(View.GONE);
//                    content.startAnimation(animationUp);
//                }
//                else{
//                    content.setVisibility(View.VISIBLE);
//                    content.startAnimation(animationDown);
//                }
//            }
//        });

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
