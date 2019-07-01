package com.example.newfinal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;

public class Fragment2 extends Fragment {

    ArrayList<Integer> mImageIds = new ArrayList<>(Arrays.asList(
            R.mipmap.img1,R.mipmap.img2, R.mipmap.img3, R.mipmap.img4,
            R.mipmap.img5, R.mipmap.img6, R.mipmap.img7, R.mipmap.img8,
            R.mipmap.img9, R.mipmap.img10, R.mipmap.img11, R.mipmap.img12,
            R.mipmap.img13, R.mipmap.img14, R.mipmap.img15, R.mipmap.img16,
            R.mipmap.img17, R.mipmap.img18, R.mipmap.img19, R.mipmap.img20
    ));

    Context context;
    OnTabItemSelectedListener listener;

    GridView grid;
    ImageView click;

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

        /*click = rootView.findViewById(R.id.myGrid);

        ImageAdapter customAdapter = new ImageAdapter(mImageIds, mContext);
        click.setAdapter(customAdapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ImageAdapter.class);
                intent.putExtra("image", mImageIds);
                startActivity(intent);
            }
        });*/




    }



}
