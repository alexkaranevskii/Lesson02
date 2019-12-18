package ru.station3000.myweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

    }

    private void setUI() {
        TextView tetextViewTime = findViewById(R.id.textViewTime);
        Resources resoursces = getResources();
        tetextViewTime.setText("11.11");
        tetextViewTime.setTextColor(resoursces.getColor(R.color.colorPrimary));


        TextView textViewTempO = findViewById(R.id.textViewTempO);
        textViewTempO.setText("o");
        tetextViewTime.setTextColor(resoursces.getColor(R.color.colorPrimaryDark));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case  R.id.button2:
                Intent intent = new Intent(this, Activity2.class);
            default:
                break;
        }
    }
}
