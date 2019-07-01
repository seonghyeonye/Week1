package org.techtown.diary;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FullView extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag2_image_fullview);

        ImageView imageView = findViewById(R.id.img);
        int img_id = getIntent().getExtras().getInt("img_id");

        imageView.setImageResource(img_id);
    }



    public void setContentView(int frag2_image_fullview) {
    }
}
