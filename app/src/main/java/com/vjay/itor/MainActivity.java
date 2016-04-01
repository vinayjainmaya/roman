package com.vjay.itor;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    private int intValue;
    private EditText edit;
    private TextView tv;
    private Button bt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText)findViewById(R.id.editText);
        tv = (TextView)findViewById(R.id.textView2);
        bt = (Button)findViewById(R.id.button);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(this);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                doConvertion();
                break;
            case R.id.fab:
                reset();
        }
    }

    private void reset() {
        edit.setText("");
        tv.setText("Roman");
    }

    private void doConvertion() {


        String value = edit.getText().toString();
        if(value != null && value.length() > 0) {
            if(value.contains(".")){
                Toast.makeText(this,"Please enter the digit b/w 1-100, no decimal",Toast.LENGTH_LONG).show();
            }else {
                intValue = Integer.parseInt(edit.getText().toString());
                if(intValue < 0 || intValue > 100){
                    Toast.makeText(this,"Please enter the digit b/w 1-100",Toast.LENGTH_LONG).show();
                }else{
                    tv.setText("Roman :"+ConvertItoR.integerToRoman(intValue));
                }
            }
        }else{
            Toast.makeText(this,"Please enter the digit b/w 1-100",Toast.LENGTH_LONG).show();
        }


    }
}
