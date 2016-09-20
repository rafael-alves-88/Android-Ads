package com.example.rm40300.propaganda;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class FragmentPropaganda extends Fragment {

    TextView tvPropaganda;
    Animation animPropaganda;
    Button btnPropaganda;

    public FragmentPropaganda() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_propaganda, container, false);

        tvPropaganda = (TextView) view.findViewById(R.id.tvPropaganda);
        btnPropaganda = (Button) view.findViewById(R.id.btnPropaganda);

        animPropaganda = AnimationUtils.loadAnimation(getActivity(), R.anim.text_propaganda);
        tvPropaganda.startAnimation(animPropaganda);

        btnPropaganda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.fiap.com.br/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        return view;
    }
}
