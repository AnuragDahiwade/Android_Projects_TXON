package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.JavaScriptException;
import  org.mozilla.javascript.Scriptable;



import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity  {

    TextView quetextview,resulttextview;
    MaterialButton cbutton,openbracketbbutton,closebarcketbutton;
    MaterialButton divvbutton,multibutton,plussbutton,minussbutton,eqlbutton;
    MaterialButton accbutton,dottbutton;
    MaterialButton onebtn,twobtn,threebtn,fourbtn,fivebtn,sixbtn,sevenbtn,eightbtn,ninebtn,zerobtn;
   boolean plus,minus,division,multiply;

   int result,result2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quetextview=findViewById(R.id.quetextvieww);
        resulttextview=findViewById(R.id.resulttextvieww);
        cbutton=findViewById(R.id.cbutton);
        openbracketbbutton=findViewById(R.id.obbutton);
        closebarcketbutton=findViewById(R.id.cbbutton);
        divvbutton=findViewById(R.id.divbutton);
        multibutton=findViewById(R.id.mulbutton);
        plussbutton=findViewById(R.id.plusbutton);
        minussbutton=findViewById(R.id.minusbutton);
        eqlbutton=findViewById(R.id.equalbutton);
        accbutton=findViewById(R.id.acbutton);
        dottbutton=findViewById(R.id.dotbbutton);
        onebtn=findViewById(R.id.onebutton);
        twobtn=findViewById(R.id.twobutton);
        threebtn=findViewById(R.id.threebutton);
        fourbtn=findViewById(R.id.fourbutton);
        fivebtn=findViewById(R.id.fivebutton);
        sixbtn=findViewById(R.id.sixbutton);
        sevenbtn=findViewById(R.id.sevenbutton);
        eightbtn=findViewById(R.id.eightbutton);
        ninebtn=findViewById(R.id.ninebutton);
        zerobtn=findViewById(R.id.zerobbutton);


        onebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+"1");
            }
        });

        twobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+"2");
            }
        });

        threebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+"3");
            }
        });

        fourbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+"4");
            }
        });

        fivebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+"5");
            }
        });

        sixbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+"6");
            }
        });

        sevenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+"7");
            }
        });

        eightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+"8");
            }
        });

        ninebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+"9");
            }
        });

        zerobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+"0");
            }
        });

        dottbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+".");
            }
        });

        openbracketbbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+"(");
            }
        });

        closebarcketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quetextview.setText(quetextview.getText()+")");
            }
        });

        plussbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(quetextview==null)
                {
                    quetextview.setText("");
                }
                else
                {
                     result=Integer.parseInt(quetextview.getText()+"");
                    plus =true;
                    quetextview.setText(null);
                }
            }
        });

        minussbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(quetextview==null)
                {
                    quetextview.setText("");
                }
                else
                {
                    result=Integer.parseInt(quetextview.getText()+"");
                    minus =true;
                    quetextview.setText(null);
                }
            }
        });

        multibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(quetextview==null)
                {
                    quetextview.setText("");
                }
                else
                {
                    result=Integer.parseInt(quetextview.getText()+"");
                    multiply =true;
                    quetextview.setText(null);
                }
            }
        });

        divvbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(quetextview==null)
                {
                    quetextview.setText("");
                }
                else
                {
                    result=Integer.parseInt(quetextview.getText()+"");
                    division =true;
                    quetextview.setText(null);
                }
            }
        });

        eqlbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result2 = Integer.parseInt(quetextview.getText()+"");

                if(plus==true)
                {
                    quetextview.setText(result +result2+"");
                    plus=false;
                }

                if(minus==true)
                {
                    quetextview.setText(result - result2+"");
                    minus=false;
                }

                if(division==true)
                {
                    quetextview.setText(result / result2+"");
                    division=false;
                }

                if(multiply==true)
                {
                    quetextview.setText(result * result2+"");
                    multiply =false;
                }
            }
        });

        cbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quetextview.setText("");
            }
        });



    }

    }