package com.example.crofert;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

public class AboutCropActivity extends AppCompatActivity {


    RecyclerView listView;
    String[] fruit={"Mango","Banana","Watermelon","Grapes","Kiwi","Apple"};
    String[] desc={"This is Mango","This is Banana","This is Watermelon","This is Grapes","This is Kiwi","This is Apple"};
    int[] imgid={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_crop);


    }
}