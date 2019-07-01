package org.techtown.diary;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class Fragment3 extends Fragment {

    Context context;
    OnTabItemSelectedListener listener;
    ImageView imageViewFood;
    Button selectbutton;
    Random rng = new Random();

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment3, container, false);

        initUI(rootView);

        return rootView;
    }

    private void initUI(ViewGroup rootView) {
        imageViewFood = rootView.findViewById(R.id.image_food);
        selectbutton=rootView.findViewById(R.id.button_select);
        //imageViewFood.setOnClickListener(new View.OnClickListener(){
        selectbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                rollDice();
            }
        });
    }

    private void rollDice(){
        int randomNumber=rng.nextInt(6)+1;

        switch(randomNumber){
            case 1:
                Toast meat= Toast.makeText(context.getApplicationContext(),"Today is meat!",Toast.LENGTH_SHORT);
                display(meat);
                imageViewFood.setImageResource(R.drawable.meat);
                break;
            case 2:
                Toast pizza= Toast.makeText(context.getApplicationContext(),"Today is pizza!",Toast.LENGTH_SHORT);
                display(pizza);
                imageViewFood.setImageResource(R.drawable.pizza);
                break;
            case 3:
                Toast ramen= Toast.makeText(context.getApplicationContext(),"Today is ramen!",Toast.LENGTH_SHORT);
                display(ramen);
                imageViewFood.setImageResource(R.drawable.ramen);
                break;
            case 4:
                Toast rice= Toast.makeText(context.getApplicationContext(),"Today is rice!",Toast.LENGTH_SHORT);
                display(rice);
                imageViewFood.setImageResource(R.drawable.rice);
                break;
            case 5:
                Toast sushi= Toast.makeText(context.getApplicationContext(),"Today is sushi!",Toast.LENGTH_SHORT);
                display(sushi);
                imageViewFood.setImageResource(R.drawable.sushi);
                break;
            case 6:
                Toast hamburger= Toast.makeText(context.getApplicationContext(),"Today is hamburger!",Toast.LENGTH_SHORT);
                display(hamburger);
                imageViewFood.setImageResource(R.drawable.hamburger);
                break;
        }
    }
    private void display(Toast toast){
        toast.setGravity(Gravity.CENTER,0,100);
        ViewGroup view = (ViewGroup) toast.getView();
        view.setBackgroundColor(Color.rgb(255,16,0));
        TextView messageText = (TextView) view.getChildAt(0);
        messageText.setTextSize(35);
        toast.show();
    }
}