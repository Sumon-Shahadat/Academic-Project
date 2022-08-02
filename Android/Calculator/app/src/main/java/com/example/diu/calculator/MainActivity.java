package com.example.diu.calculator;

import android.preference.TwoStatePreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.String;

import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity {


    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button eql;
    private Button clr;
    private TextView text;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICAITON = '*';
    private final char DIVISION = '/';
    private final char EQUAL = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIView();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(text.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(text.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(text.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(text.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(text.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(text.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(text.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(text.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(text.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text.setText(text.getText().toString()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + "+");
                text.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = SUBTRACTION;
                result.setText(String.valueOf(val1) + "-");
                text.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = MULTIPLICAITON;
                result.setText(String.valueOf(val1) + "*");
                text.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) + "/");
                text.setText(null);
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = EQUAL;
                result.setText(result.getText().toString() + String.valueOf(val2) + " = " + String.valueOf(val1));
                text.setText(null);
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text.getText().length() > 0){
                    CharSequence name = text.getText().toString();
                    text.setText(name.subSequence(0, name.length() - 1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;

                    text.setText(null);
                    result.setText(null);
                }
            }
        });
    }

    public void setupUIView (){

        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        zero = (Button)findViewById(R.id.btn0);
        add = (Button)findViewById(R.id.btnadd);
        sub = (Button)findViewById(R.id.btnsub);
        mul = (Button)findViewById(R.id.btnmul);
        clr = (Button)findViewById(R.id.btnclr);
        eql = (Button)findViewById(R.id.btneql);
        div = (Button)findViewById(R.id.btndiv);
        text = (TextView)findViewById(R.id.tvText);
        result = (TextView)findViewById(R.id.tvResult);


    }

    private void compute(){

        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(text.getText().toString());

            switch(ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICAITON:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQUAL:
                    break;
            }
        }
        else {
            val1 = Double.parseDouble(text.getText().toString());
        }

    }
}
