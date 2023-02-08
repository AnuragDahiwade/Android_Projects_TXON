package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    Button btn6;
    EditText edt1;
    TextView txtv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn6=findViewById(R.id.button6);
        edt1=findViewById(R.id.meter);
        txtv1=findViewById(R.id.tv2);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=edt1.getText().toString();
                double meterr=Integer.parseInt(s1);
                double km=meterr/1000;
                txtv1.setText("The kilometer value is: "+km+"km");
            }
        });


    }
}