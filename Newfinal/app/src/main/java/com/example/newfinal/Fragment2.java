package com.example.newfinal;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;

public class Fragment2 extends Fragment {

    ArrayList<Integer> mImageIds = new ArrayList<>(Arrays.asList(
            R.drawable.img1,R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8,
            R.drawable.img9, R.drawable.img10, R.drawable.img11, R.drawable.img12,
            R.drawable.img13, R.drawable.img14, R.drawable.img15, R.drawable.img16,
            R.drawable.img17, R.drawable.img18, R.drawable.img19, R.drawable.img20
    ));

    Context context;
    OnTabItemSelectedListener listener;

    GridView grid;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        this.context = context;

        if (context instanceof OnTabItemSelectedListener) {
            listener = (OnTabItemSelectedListener) context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();

        if (context != null) {
            context = null;
            listener = null;
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment2, container, false);

        initUI(rootView);

        return rootView;
    }

    private void initUI(ViewGroup rootView) {

        Context mContext = getContext();
        grid = rootView.findViewById(R.id.myGrid);
        grid.setAdapter(new ImageAdapter(mImageIds, mContext));

    }



}
