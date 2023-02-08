package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    TextView totalquestiontextview;
    TextView questiontextview;

    Button ansA, ansB, ansC, ansD;
    Button submitbtn;

    int score=0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        totalquestiontextview=findViewById(R.id.questionstotal);
        questiontextview=findViewById(R.id.question);
        ansA = findViewById(R.id.cardA);
        ansB = findViewById(R.id.cardB);
        ansC = findViewById(R.id.cardC);
        ansD = findViewById(R.id.cardD);
        submitbtn=findViewById(R.id.submit);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitbtn.setOnClickListener(this);

        totalquestiontextview.setText("Total question : "+totalQuestion);

        loadNewQuestion();



    }

    private void loadNewQuestion() {

        questiontextview.setText(QuestionAnswer.question[currentQuestionIndex]);
        ansA.setText(QuestionAnswer.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer.choices[currentQuestionIndex][2]);
        ansD.setText(QuestionAnswer.choices[currentQuestionIndex][3]);
    }

    @Override
    public void onClick(View view) {

    }
}