package ru.station3000.weather_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           textView.setText("Button6");
        }
    };

    private LinearLayout load_layout;
    private LinearLayout working_layout;
    private LinearLayout city_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        working_layout = findViewById(R.id.working_layout);
        city_layout = findViewById(R.id.city_layout);
        load_layout = findViewById(R.id.load_layout);


        working_layout.setVisibility(View.GONE);
        city_layout.setVisibility(View.GONE);

        Button button = findViewById(R.id.button1);
        button.setOnClickListener(this);

        Button button1 = findViewById(R.id.button1);
        button.setOnClickListener(this);

        Button button2 = findViewById(R.id.button2);
        button.setOnClickListener(this);

        Button button3 = findViewById(R.id.button3);
        button.setOnClickListener(this);

        Button button6 = findViewById(R.id.button6);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                textView.setText("Button click");
            break;

        case R.id.button2:
            textView.setText("Button click");
            break;

        case R.id.button3:
                textView.setText("Button click");
                break;

        case R.id.button6:
            working_layout.setVisibility(View.VISIBLE);
            city_layout.setVisibility(View.GONE);
            load_layout.setVisibility(View.GONE);
                break;

                default:
                    textView.setText("Foo Bar");
        }

    }
}
