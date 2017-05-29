package com.example.rafiulislamrafi.quizapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button submit_button;
    RadioGroup radioGroup, radioGroup2, radioGroup3, radioGroup4, radioGroup5, radioGroup6, radioGroup7, radioGroup8, radioGroup9, radioGroup10;

    RadioButton radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6, radioButton7, radioButton8, radioButton9, radioButton10,
            radioButton11, radioButton12, radioButton13, radioButton14, radioButton15, radioButton16, radioButton17, radioButton18, radioButton19,
            radioButton20, radioButton21, radioButton22, radioButton23, radioButton24, radioButton25, radioButton26, radioButton27, radioButton28,
            radioButton29, radioButton30;

    TextView textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCast();
        buttonClick();
    }

    public void objCast() {

        submit_button = (Button) findViewById(R.id.submit_button);

        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);

        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        radioButton5 = (RadioButton) findViewById(R.id.radioButton5);
        radioButton6 = (RadioButton) findViewById(R.id.radioButton6);

        radioButton7 = (RadioButton) findViewById(R.id.radioButton7);
        radioButton8 = (RadioButton) findViewById(R.id.radioButton8);
        radioButton9 = (RadioButton) findViewById(R.id.radioButton9);

        radioButton10 = (RadioButton) findViewById(R.id.radioButton10);
        radioButton11 = (RadioButton) findViewById(R.id.radioButton11);
        radioButton12 = (RadioButton) findViewById(R.id.radioButton12);

        radioButton13 = (RadioButton) findViewById(R.id.radioButton13);
        radioButton14 = (RadioButton) findViewById(R.id.radioButton14);
        radioButton15 = (RadioButton) findViewById(R.id.radioButton15);

        radioButton16 = (RadioButton) findViewById(R.id.radioButton16);
        radioButton17 = (RadioButton) findViewById(R.id.radioButton17);
        radioButton18 = (RadioButton) findViewById(R.id.radioButton18);

        radioButton19 = (RadioButton) findViewById(R.id.radioButton19);
        radioButton20 = (RadioButton) findViewById(R.id.radioButton20);
        radioButton21 = (RadioButton) findViewById(R.id.radioButton21);

        radioButton22 = (RadioButton) findViewById(R.id.radioButton22);
        radioButton23 = (RadioButton) findViewById(R.id.radioButton23);
        radioButton24 = (RadioButton) findViewById(R.id.radioButton24);

        radioButton25 = (RadioButton) findViewById(R.id.radioButton25);
        radioButton26 = (RadioButton) findViewById(R.id.radioButton26);
        radioButton27 = (RadioButton) findViewById(R.id.radioButton27);

        radioButton28 = (RadioButton) findViewById(R.id.radioButton28);
        radioButton29 = (RadioButton) findViewById(R.id.radioButton29);
        radioButton30 = (RadioButton) findViewById(R.id.radioButton30);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radioGroup4);
        radioGroup5 = (RadioGroup) findViewById(R.id.radioGroup5);
        radioGroup6 = (RadioGroup) findViewById(R.id.radioGroup6);
        radioGroup7 = (RadioGroup) findViewById(R.id.radioGroup7);
        radioGroup8 = (RadioGroup) findViewById(R.id.radioGroup8);
        radioGroup9 = (RadioGroup) findViewById(R.id.radioGroup9);
        radioGroup10 = (RadioGroup) findViewById(R.id.radioGroup10);

        textView = (TextView) findViewById(R.id.text);
        textView2 = (TextView) findViewById(R.id.text2);
        textView3 = (TextView) findViewById(R.id.text3);
        textView4 = (TextView) findViewById(R.id.text4);
        textView5 = (TextView) findViewById(R.id.text5);
        textView6 = (TextView) findViewById(R.id.text6);
        textView7 = (TextView) findViewById(R.id.text7);
        textView8 = (TextView) findViewById(R.id.text8);
        textView9 = (TextView) findViewById(R.id.text9);
        textView10 = (TextView) findViewById(R.id.text10);

    }

    public void question_one() {

        if (radioButton.isChecked()) {
            count = count + 1;
        }
        if (radioButton2.isChecked()) {
            count = count + 0;
        }
        if (radioButton3.isChecked()) {
            count = count + 0;
        }
    }

    public void question_Two() {
        if (radioButton4.isChecked()) {
            count = count + 0;
        }
        if (radioButton5.isChecked()) {
            count = count + 0;
        }
        if (radioButton6.isChecked()) {
            count = count + 1;

        }

    }

    public void question_Three() {

        if (radioButton7.isChecked()) {
            count = count + 0;

        }
        if (radioButton8.isChecked()) {
            count = count + 0;
        }
        if (radioButton9.isChecked()) {
            count = count + 1;

        }
    }

    public void question_Four() {

        if (radioButton10.isChecked()) {
            count = count + 1;

        }
        if (radioButton11.isChecked()) {
            count = count + 0;

        }
        if (radioButton12.isChecked()) {
            count = count + 0;

        }
    }

    public void question_Five() {

        if (radioButton13.isChecked()) {
            count = count + 0;

        }
        if (radioButton14.isChecked()) {
            count = count + 1;

        }
        if (radioButton15.isChecked()) {
            count = count + 0;

        }
    }

    public void question_Six() {

        if (radioButton16.isChecked()) {
            count = count + 0;

        }
        if (radioButton17.isChecked()) {
            count = count + 1;

        }
        if (radioButton18.isChecked()) {
            count = count + 0;

        }
    }

    public void question_Seven() {

        if (radioButton19.isChecked()) {
            count = count + 1;

        }
        if (radioButton20.isChecked()) {
            count = count + 0;

        }
        if (radioButton21.isChecked()) {
            count = count + 0;

        }
    }

    public void question_Eight() {

        if (radioButton22.isChecked()) {
            count = count + 0;

        }
        if (radioButton23.isChecked()) {
            count = count + 0;

        }
        if (radioButton24.isChecked()) {
            count = count + 3;

        }
    }

    public void question_Nine() {

        if (radioButton25.isChecked()) {
            count = count + 1;

        }
        if (radioButton26.isChecked()) {
            count = count + 0;

        }
        if (radioButton27.isChecked()) {
            count = count + 0;

        }
    }

    public void question_Ten() {

        if (radioButton28.isChecked()) {
            count = count + 1;

        }
        if (radioButton29.isChecked()) {
            count = count + 0;

        }
        if (radioButton30.isChecked()) {
            count = count + 0;

        }
    }

    public void buttonClick() {

        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                question_one();
                question_Two();
                question_Three();
                question_Four();
                question_Five();
                question_Six();
                question_Seven();
                question_Eight();
                question_Nine();
                question_Ten();

                textView.setText("Answer: Option A");
                textView2.setText("Answer: Option C");
                textView3.setText("Answer: Option C");
                textView4.setText("Answer: Option A");
                textView5.setText("Answer: Option B");
                textView6.setText("Answer: Option C");
                textView7.setText("Answer: Option A");
                textView8.setText("Answer: Option C");
                textView9.setText("Answer: Option A");
                textView10.setText("Answer: Option A");

                Toast.makeText(MainActivity.this, "Score : " + count + "/" + "10", Toast.LENGTH_LONG).show();
            }
        });
    }
}