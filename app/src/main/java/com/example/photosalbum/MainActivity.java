package com.example.photosalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] names= {"This is ME", "MY MOM_Sushma Singh", "MY DAD_Sanjeev Singh", "My BROTHER Dakshit Singh", "My Dog BRUNO", "My Family", "My Family", "Me and My Friends at Cheerapunjee", "We Chilling at a waterfall"};
// start from 0
    ImageButton prev, next;
    ImageView pic;
    TextView text;


    int currentImage= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void prev(View v){
        text= findViewById(R.id.dis);
        String idx = "pic" + currentImage;
        int x= this.getResources().getIdentifier(idx,"id", getPackageName());
        pic= findViewById(x);
        pic.setAlpha(0f); //change ara..

        currentImage=(9+currentImage-1) %9 ;
        String idy = "pic" + currentImage;
        int y= this.getResources().getIdentifier(idy,"id", getPackageName());
        pic= findViewById(y);
        pic.setAlpha(1f); //change ara..

        text.setText(names[currentImage]);
    }


    public void next(View view){
        text= findViewById(R.id.dis);

        String idx = "pic" + currentImage;
        int x= this.getResources().getIdentifier(idx,"id", getPackageName());
        pic= findViewById(x);
        pic.setAlpha(0f); //change ara..

        currentImage=(currentImage+1) % 9;
        String idy = "pic" + currentImage;
        int y= this.getResources().getIdentifier(idy,"id", getPackageName());
        pic= findViewById(y);
        pic.setAlpha(1f); //change ara..
        text.setText(names[currentImage]);

    }

}