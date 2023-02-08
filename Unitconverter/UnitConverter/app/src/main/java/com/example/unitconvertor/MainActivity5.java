package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    Button btn8;
    EditText edt3;
    TextView texts3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btn8=findViewById(R.id.button7);
        edt3=findViewById(R.id.ml);
        texts3 =findViewById(R.id.tv3);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  s3=edt3.getText().toString();
                double gramm=Integer.parseInt(s3);
                double kg=gramm/1000;
                texts3.setText("The Value of Kilogram is "+kg+" kg");
            }
        });
    }
}