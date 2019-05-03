package com.example.nz.classthirteen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ZoomControls zoomControls;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView ) findViewById(R.id.image);
        zoomControls = (ZoomControls) findViewById(R.id.zoom);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x =  imageView.getScaleX();
                float y =  imageView.getScaleY();

                imageView.setScaleX((float)x+1);
                imageView.setScaleY((float)y+1);
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                if(x>1 && y>1){
                    imageView.setScaleY((float)x-1);
                    imageView.setScaleY((float)y-1);
                }
            }
        });



    }
}
