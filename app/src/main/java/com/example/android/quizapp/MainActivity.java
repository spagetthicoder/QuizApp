package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quizPoints=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view){

        EditText nameTextView = (EditText) findViewById(R.id.name_view);
        String name = nameTextView.getText().toString();

        question1();
        question2();
        question3();
        question4();

        Toast.makeText(this, name + " Your score is: " + quizPoints + " out of 5.", Toast.LENGTH_SHORT).show();
    }

    public int question1(){

        RadioButton question1Checkbox = (RadioButton) findViewById(R.id.c_radio_button);
        boolean selected = question1Checkbox.isChecked();

        if (selected){
            quizPoints += 1;
        }
        return quizPoints;
    }

    public int question2(){
        RadioButton question2Checkbox = (RadioButton) findViewById(R.id.b2_radio_button);
        boolean selected2 = question2Checkbox.isChecked();

        if(selected2){
            quizPoints +=1;
        }
        return quizPoints;
    }

    public int question3(){
        RadioButton question3Checkbox = (RadioButton) findViewById(R.id.c3_radio_button);
        boolean selected3 = question3Checkbox.isChecked();

        if(selected3){
            quizPoints +=1;
        }
        return quizPoints;
    }

    public int question4(){
        CheckBox question4CheckBox1 = (CheckBox) findViewById(R.id.checkbox3);
        boolean selected4a = question4CheckBox1.isChecked();

        CheckBox question4Checkbox2 = (CheckBox) findViewById(R.id.checkbox4);
        boolean selected4b = question4Checkbox2.isChecked();

        if(selected4a){
            quizPoints +=1;
        }
        if(selected4b){
            quizPoints +=1;
        }
        return quizPoints;
    }

}
