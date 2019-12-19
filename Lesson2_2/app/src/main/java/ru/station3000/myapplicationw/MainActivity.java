package ru.station3000.myapplicationw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private TextView textView;
    String[] city = new String[]{"Москва","Санкт-Петербург",
    "Мурманск","Архангельск","Псков","Гатчина",
    "Волгоград","Тюмень","Дудинка","Нижневартовск",
    };

    private LinearLayout load_layout;
    private LinearLayout working_layout;
    private LinearLayout city_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        ListView listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
        android.R.layout.simple_list_item_1, city);
        listView.setAdapter(adapter);

        working_layout = findViewById(R.id.working_layout);
        city_layout = findViewById(R.id.city_layout);
        load_layout = findViewById(R.id.load_layout);

        working_layout.setVisibility(View.GONE);
        city_layout.setVisibility(View.GONE);

        // Возврат к рабочей страничке
        //  Включаем видимость working_layout
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working_layout.setVisibility(View.VISIBLE);
                city_layout.setVisibility(View.GONE);
                load_layout.setVisibility(View.GONE);
            }
        });


        // Запуск погодного приложения
        //  Включаем видимость working_layout
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working_layout.setVisibility(View.VISIBLE);
                city_layout.setVisibility(View.GONE);
                load_layout.setVisibility(View.GONE);
            }
        });

        //  Включаем видимость working_layout
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                working_layout.setVisibility(View.GONE);
                city_layout.setVisibility(View.VISIBLE);
                load_layout.setVisibility(View.GONE);
            }
        });

    }

  //  public void buttonClick(View view){
  //      textView.setText("Ускорение загрузки");
  //  }

 //   @Override
 //   public void onClick(View v) {

 //   }

    // @Override
  //  public void onClick(View v) {
//
  //  }
}
