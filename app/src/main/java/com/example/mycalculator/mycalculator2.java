package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class mycalculator2 extends AppCompatActivity {
    private long backPressedTime;

    float input1 , input2;
    EditText edt1;
    boolean Add, Sub, Mul, Div, mRemainder, decimal;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub,
            buttonMul, buttonDivision, buttonEqual, buttonDel, buttonDot, Remainder,button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycalculator2);

        button =  (Button) findViewById(R.id.button);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button20);
        button3 = (Button) findViewById(R.id.button7);
        button4 = (Button) findViewById(R.id.button9);
        button5 = (Button) findViewById(R.id.button10);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button15);
        button8 = (Button) findViewById(R.id.button16);
        button9 = (Button) findViewById(R.id.button17);
        buttonDot = (Button) findViewById(R.id.b3);
        buttonAdd = (Button) findViewById(R.id.button2);
        buttonSub = (Button) findViewById(R.id.button18);
        buttonMul = (Button) findViewById(R.id.button8);
        buttonDivision = (Button) findViewById(R.id.button5);
        Remainder = (Button) findViewById(R.id.button3);
        buttonDel = (Button) findViewById(R.id.button11);
        buttonEqual = (Button) findViewById(R.id.button4);

        edt1 = (EditText) findViewById(R.id.edt1);

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(edt1==null){
                    edt1.setText(" ");
                }
                else{
                    input1 =Float.parseFloat(edt1.getText()+"");
                    Add = true;
                    edt1.setText(null);

                }
            }
        });

        Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(edt1==null){
                    edt1.setText(" ");
                }
                else{
                    input1 =Float.parseFloat(edt1.getText()+"");
                    mRemainder = true;
                    edt1.setText(null);

                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(edt1==null){
                    edt1.setText(" ");
                }
                else{
                    input1 =Float.parseFloat(edt1.getText()+"");
                    Sub = true;
                    edt1.setText(null);

                }


            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(edt1==null){
                    edt1.setText(" ");
                }
                else{
                    input1 =Float.parseFloat(edt1.getText()+"");
                    Mul = true;
                    edt1.setText(null);

                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(edt1==null){
                    edt1.setText(" ");
                }
                else{
                    input1 =Float.parseFloat(edt1.getText()+"");
                    Div = true;
                    edt1.setText(null);

                }
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edt1.setText(edt1.getText()+".");
            }
        });




        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                input2=Float.parseFloat(edt1.getText()+"");

                if (Add==true){
                    edt1.setText("+");
                    edt1.setText(input1 + input2+"");
                    Add=false;
                }

                if (Sub==true){
                    edt1.setText(input1 - input2+"");
                    Sub=false;
                }

                if (Mul==true){
                    edt1.setText(input1 * input2+"");
                    Mul=false;
                }

                if (Div==true){
                    edt1.setText(input1 / input2+"");
                    Div=false;
                }

                if (mRemainder==true){
                    edt1.setText(input1 % input2+"");
                    mRemainder=false;
                }




            }
        });



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        if(backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else{
            Toast.makeText(getBaseContext(),"Press back again to exit",Toast.LENGTH_SHORT);
        }


        backPressedTime = System.currentTimeMillis();
    }
}
