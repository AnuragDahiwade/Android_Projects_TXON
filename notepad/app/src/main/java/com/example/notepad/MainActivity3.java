package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class MainActivity3 extends AppCompatActivity {

    EditText tittle,description;
    Button save ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        tittle=findViewById(R.id.titleedittext);
        description=findViewById(R.id.descriptionedittext);
        save = findViewById(R.id.savebutton);


        Realm.init(getApplicationContext());
        Realm realm=Realm.getDefaultInstance();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String title = tittle.getText().toString();
                String descriptn = description.getText().toString();
                long createdtime = System.currentTimeMillis();

                realm.beginTransaction();
                Note note = realm.createObject(Note.class);
                note.setTitle(title);
                note.setDescription(descriptn);
                note.getCreatedTime(createdtime);
                realm.commitTransaction();
                Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_LONG).show();
                finish();

            }
        });
    }
}