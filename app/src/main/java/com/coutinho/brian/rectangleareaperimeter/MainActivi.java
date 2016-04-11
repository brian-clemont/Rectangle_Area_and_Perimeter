package com.coutinho.brian.rectangleareaperimeter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivi extends AppCompatActivity implements View.OnClickListener {
private Button area_button , perimeter_button;
    private TextView result;
    private EditText input_width,input_height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        area_button =(Button)findViewById(R.id.button_area);
        area_button.setOnClickListener(this);
        perimeter_button =(Button)findViewById(R.id.button_perimeter);
        perimeter_button.setOnClickListener(this);

        input_width =(EditText)findViewById(R.id.enter_width);
        input_height=(EditText)findViewById(R.id.enter_height);

        result =(TextView)findViewById(R.id.result);
    }

    @Override
    public void onClick(View v) {
        String wid_ip = input_width.getText().toString();
        String height_ip = input_height.getText().toString();

        int w = Integer.parseInt(wid_ip);
        int h = Integer.parseInt(height_ip);
        float res;
        switch (v.getId()){
            case R.id.button_area:
                res = w*h;
                result.setText("The Area is "+res);
                break;
            case R.id.button_perimeter:
                  res = 2*(h+w);
                result.setText("The Perimeter is "+res);
                break;
          }
    }
}
