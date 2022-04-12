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
    private RelativeLayout n1,n2,n3;
    private Double resHold;
    private char opr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setPointer();
        //Toast.makeText(this, "Tal Rozner", Toast.LENGTH_LONG).show();
    }

    private void setPointer() {
        result = findViewById(R.id.result);
        //result.setText("1234567890.00");
         /*
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double res = Double.parseDouble(result.getText().toString());
                res*=10;
                res+=1;
                result.setText(String.valueOf(res));
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double res = Double.parseDouble(result.getText().toString());
                res*=10;
                res+=2;
                result.setText(String.valueOf(res));
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double res = Double.parseDouble(result.getText().toString());
                res*=10;
                res+=3;
                result.setText(String.valueOf(res));
            }
        });
        */
    }

    @Override
    public void onClick(View v) {
        double res = Double.parseDouble(result.getText().toString());
        switch (v.getId()){
            case R.id.n0:
                res*=10;
                break;
            case R.id.n1:
                res*=10;
                res+=1;
                break;
            case R.id.n2:
                res*=10;
                res+=2;
                break;
            case R.id.n3:
                res*=10;
                res+=3;
                break;
            case R.id.n4:
                res*=10;
                res+=4;
                break;
            case R.id.n5:
                res*=10;
                res+=5;
                break;
            case R.id.n6:
                res*=10;
                res+=6;
                break;
            case R.id.n7:
                res*=10;
                res+=7;
                break;
            case R.id.n8:
                res*=10;
                res+=8;
                break;
            case R.id.n9:
                res*=10;
                res+=9;
                break;
            case R.id.clr:
                res=0;
                break;
            case R.id.plusminus:
                res*=-1;
                break;
            case R.id.plus:
                resHold=res;
                opr='+';
                res=0;
                break;
            case R.id.minus:
                resHold=res;
                opr='-';
                res=0;
                break;

            case R.id.multiply:
                resHold=res;
                opr='*';
                res=0;
                break;

            case R.id.divide:
                resHold=res;
                opr='/';
                res=0;
                break;

            case R.id.equal:
                switch (opr){
                    case '+':
                        resHold+=res;
                        break;
                    case '-':
                        resHold-=res;
                        break;
                    case '*':
                        resHold*=res;
                        break;
                    case '/':
                        resHold/=res;
                        break;
                    default:
                        break;
                }
                res=resHold;
                break;
        }
        result.setText(String.valueOf(res));
    }
}