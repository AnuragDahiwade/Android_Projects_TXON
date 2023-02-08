package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button btn;
    EditText edt;
    TextView txtv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn=findViewById(R.id.button6);
        edt=findViewById(R.id.gram);
        txtv=findViewById(R.id.tv1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=edt.getText().toString();
                int inchh=Integer.parseInt(s);
                double cm=2.54*inchh;
                txtv.setText("The CentiMeter Value is : "+cm);
            }
        });



    }
}