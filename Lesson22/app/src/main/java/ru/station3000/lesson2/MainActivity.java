package ru.station3000.lesson2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
// ВРЕМЯ 1 Ч 38 МИН
    private TextView textView;
  //  private final View.OnClickListener OnClickListener = new View.OnClickListener() {
  //      @Override
   //     public void onClick(View v) {
    //       textView.setText("Button3");
   //     }
   // };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

       Button button = findViewById(R.id.button1); // создание объекта класаа
       button.setOnClickListener(this);
       Button button2 = findViewById(R.id.button2); // создание объекта класаа
       button.setOnClickListener(this);
       Button button3 = findViewById(R.id.button); // создание объекта класаа
       button.setOnClickListener(new Listener());


   //    button.setOnClickListener(new View.OnClickListener() {  // имплементируем в него метод View.OnClickListener
   //        @Override
    //        public void onClick(View v) {
   //             textView.setText("Button2 Click");
   //         }
   //     });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                textView.setText("button0 HI");
                break;

            case R.id.button2:
                textView.setText("button2 HI");
                break;

            case R.id.button1:
                textView.setText("button1 HI");
                break;

            case R.id.button3:
                textView.setText("button3 HI");
                break;

            default:
                textView.setText("Foo Bar");

        }

    }
}
