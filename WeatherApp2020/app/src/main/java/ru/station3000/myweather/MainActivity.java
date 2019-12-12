package ru.station3000.myweather;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
    }

    private void setUI(){

        TextView tetextViewTime = findViewById(R.id.textViewTime);
        Resources resoursces = getResources();
        tetextViewTime.setText("11.11");
        tetextViewTime.setTextColor(resoursces.getColor(R.color.colorPrimary));


        TextView textViewTempO = findViewById(R.id.textViewTempO);
        Resources resoursces2 = getResources();
        textViewTempO.setText("o");
        tetextViewTime.setTextColor(resoursces.getColor(R.color.colorPrimaryDark));
    }
}
