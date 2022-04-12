package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView result;
    private StringBuilder phoneNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPointer();
        //Toast.makeText(this, "Tal Rozner", Toast.LENGTH_LONG).show();
    }

    private void setPointer() {
        result = findViewById(R.id.result);
        phoneNumber = new StringBuilder();
    }

    @Override
    public void onClick(View v) {
        String res = result.getText().toString();
        switch (v.getId()){
            case R.id.n0:
                phoneNumber.append("0");
                break;
            case R.id.n1:
                phoneNumber.append("1");
                break;
            case R.id.n2:
                phoneNumber.append("2");
                break;
            case R.id.n3:
                phoneNumber.append("3");
                break;
            case R.id.n4:
                phoneNumber.append("4");
                break;
            case R.id.n5:
                phoneNumber.append("5");
                break;
            case R.id.n6:
                phoneNumber.append("6");
                break;
            case R.id.n7:
                phoneNumber.append("7");
                break;
            case R.id.n8:
                phoneNumber.append("8");
                break;
            case R.id.n9:
                phoneNumber.append("9");
                break;
            case R.id.astrix:
                phoneNumber.append("*");
                break;
            case R.id.hashtag:
                phoneNumber.append("#");
                break;
            case R.id.dial:
                Toast.makeText(this, "dialing "+phoneNumber.toString(), Toast.LENGTH_LONG).show();
                phoneNumber = new StringBuilder();
                result.setText("");
                break;

            case R.id.hangup:
                Toast.makeText(this, "hanging up, bye bye", Toast.LENGTH_LONG).show();
                break;

        }
        result.setText(phoneNumber.toString());
    }
}