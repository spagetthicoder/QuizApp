package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quizPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //When the Submit button is pressed several things happen:
    //1. The name of the player is stored into the "name" string
    //2. all of the "questions" methods are called
    //3. if the player answers all questions correct he's told he got a "Perfect Score!"
    //4. the points are reset to zero on line 45
    public void submitAnswers(View view) {

        EditText nameTextView = (EditText) findViewById(R.id.name_view);
        String name = nameTextView.getText().toString();

        question1();
        question2();
        question3();
        question4();
        question5();
        question6();

        if (quizPoints == 8) {
            Toast.makeText(this, "Perfect Score! " + name + " you scored: " + quizPoints + " out of 8.", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, name + " you scored: " + quizPoints + " out of 8.", Toast.LENGTH_SHORT).show();
        }

        TextView link = (TextView) findViewById(R.id.link);
        link.setVisibility(View.VISIBLE);
        link.setMovementMethod(LinkMovementMethod.getInstance());

        quizPoints = 0;
    }

    //Method for Question 1
    public int question1() {

        RadioButton question1Checkbox = (RadioButton) findViewById(R.id.c_radio_button);
        boolean selected = question1Checkbox.isChecked();

        if (selected) {
            quizPoints += 1;
        }
        return quizPoints;
    }

    //Method for Question 2
    public int question2() {
        RadioButton question2Checkbox = (RadioButton) findViewById(R.id.b2_radio_button);
        boolean selected2 = question2Checkbox.isChecked();

        if (selected2) {
            quizPoints += 1;
        }
        return quizPoints;
    }

    //Method for Question 3
    public int question3() {
        RadioButton question3Checkbox = (RadioButton) findViewById(R.id.c3_radio_button);
        boolean selected3 = question3Checkbox.isChecked();

        if (selected3) {
            quizPoints += 1;
        }
        return quizPoints;
    }

    //Method for Question 4
    public int question4() {
        CheckBox question4CheckBox1 = (CheckBox) findViewById(R.id.checkbox3);
        boolean selected4a = question4CheckBox1.isChecked();

        CheckBox question4Checkbox2 = (CheckBox) findViewById(R.id.checkbox4);
        boolean selected4b = question4Checkbox2.isChecked();

        if (selected4a) {
            quizPoints += 1;
        }
        if (selected4b) {
            quizPoints += 1;
        }
        return quizPoints;
    }

    //Method for Question 5
    public int question5() {
        CheckBox question5CheckBox1 = (CheckBox) findViewById(R.id.checkbox2b);
        boolean selected5b = question5CheckBox1.isChecked();

        CheckBox question5Checkbox2 = (CheckBox) findViewById(R.id.checkbox4b);
        boolean selected5d = question5Checkbox2.isChecked();

        if (selected5b) {
            quizPoints += 1;
        }
        if (selected5d) {
            quizPoints += 1;
        }
        return quizPoints;
    }

    //Method for Question 6
    public int question6() {
        EditText question6 = (EditText) findViewById(R.id.question6_view);
        String checkAnswer = question6.getText().toString();

        String tls = "TLS";
        String tls2 = "tls";

        if (checkAnswer.equals(tls) || checkAnswer.equals(tls2)) {
            quizPoints += 1;
        }
        return quizPoints;
    }

}
