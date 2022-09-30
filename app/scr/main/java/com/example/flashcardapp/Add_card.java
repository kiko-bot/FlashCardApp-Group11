package com.example.flashcardapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Add_Card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        findViewById(R.id.cancel_icon_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        findViewById(R.id.save_icon_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String save_question = ((EditText) findViewById(R.id.question_edit_text)).getText().toString();
                String save_answer = ((EditText) findViewById(R.id.answer_edit_text)).getText().toString();

                Intent data = new Intent(); // create a new Intent, this is where we will put our data
                data.putExtra("quiz_question", save_question); // puts one string into the Intent, with the key as 'string1'
                data.putExtra("quiz_answer", save_answer); // puts another string into the Intent, with the key as 'string2
                setResult(RESULT_OK, data); // set result code and bundle data for response
                finish();
            }
        });
    }
}
