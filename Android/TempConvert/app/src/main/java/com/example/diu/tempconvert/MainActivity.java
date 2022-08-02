package com.example.diu.tempconvert;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText edtIn;
    RadioButton ra1;
    RadioButton ra2;
    Button btncv;
    Button btncl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtIn = (EditText)findViewById(R.id.editInput);
        ra1 = (RadioButton)findViewById(R.id.rad1);
        ra2 = (RadioButton)findViewById(R.id.rad2);
        btncv = (Button)findViewById(R.id.btnC);
        btncl = (Button)findViewById(R.id.btncl);

        btncv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ra1.isChecked()){
                    Double F = Double.parseDouble(edtIn.getText().toString());
                    Double C = (((F-32)/9)*5);
                    edtIn.setText(Double.toString(C));
                }
                else{
                    Double C = Double.parseDouble(edtIn.getText().toString());
                    Double F = (((C*9)/5)+32);
                    edtIn.setText(Double.toString(F));
                }
            }
        });
    }
}
