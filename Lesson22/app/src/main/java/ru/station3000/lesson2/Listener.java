package ru.station3000.lesson2;

import android.view.View;
import android.widget.Toast;

public class Listener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Separate class", Toast.LENGTH_SHORT).show();
    }
}
