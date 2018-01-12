package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtText;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,btnAdd,btnEqual,btnSub,btnMul,btnDiv,btnC,btndot;
    boolean mAddition,mSubtract,mMultiple,mDivision,verify;
    float mValueOne, mValueTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtText = (EditText) findViewById(R.id.edt_text);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btn0 = (Button) findViewById(R.id.btn_0);
        btnAdd = (Button) findViewById(R.id.btn_plus);
        btnEqual = (Button) findViewById(R.id.btn_equal);
        btnSub = (Button) findViewById(R.id.btn_minus);
        btnMul = (Button) findViewById(R.id.btn_multi);
        btnDiv = (Button) findViewById(R.id.btn_div);
        btnC = (Button) findViewById(R.id.btn_ac);
        btndot = (Button) findViewById(R.id.btn_dot);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verify == true)
                {
                    edtText.setText("1");
                    verify = false;
                }
                else {
                    edtText.setText(edtText.getText() + "1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verify == true)
                {
                    edtText.setText("2");
                    verify = false;
                }
                else
                {
                    edtText.setText(edtText.getText()+"2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verify == true)
                {
                    edtText.setText("3");
                    verify = false;
                }
                else
                {
                    edtText.setText(edtText.getText()+"3");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verify == true)
                {
                    edtText.setText("4");
                    verify = false;
                }
                else
                {
                    edtText.setText(edtText.getText()+"4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verify == true)
                {
                    edtText.setText("5");
                    verify = false;
                }
                else
                {
                    edtText.setText(edtText.getText()+"5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verify == true)
                {
                    edtText.setText("6");
                    verify = false;
                }
                else
                {
                    edtText.setText(edtText.getText()+"6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verify == true)
                {
                    edtText.setText("7");
                    verify = false;
                }
                else
                {
                    edtText.setText(edtText.getText()+"7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verify == true)
                {
                    edtText.setText("8");
                    verify = false;
                }
                else
                {
                    edtText.setText(edtText.getText()+"8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verify == true)
                {
                    edtText.setText("9");
                    verify = false;
                }
                else
                {
                    edtText.setText(edtText.getText()+"9");
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verify == true)
                {
                    edtText.setText("0");
                    verify = false;
                }
                else
                {
                    edtText.setText(edtText.getText()+"0");
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleForEqualOperation();

                if(edtText == null)
                {
                    edtText.setText("");
                }
                else
                {
                    mValueOne = Float.parseFloat(edtText.getText()+"");
                    mAddition = true;
                    verify = true;

                }


            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleForEqualOperation();
                mValueOne = Float.parseFloat(edtText.getText()+"");
                mSubtract = true;
                verify = true;
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleForEqualOperation();
                mValueOne = Float.parseFloat(edtText.getText()+"");
                mMultiple = true;
                verify = true;
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleForEqualOperation();
                mValueOne = Float.parseFloat(edtText.getText()+"");
                mDivision = true;
               verify = true;
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleForEqualOperation();
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtText.setText("");
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtText.setText(edtText.getText()+".");
            }
        });

    }

    public void handleForEqualOperation(){

        if (mAddition == true)
        {
            mValueTwo = Float.parseFloat(edtText.getText() + "");
            edtText.setText(mValueOne + mValueTwo + "");
            mAddition = false;
        }
        if (mSubtract == true)
        {
            mValueTwo = Float.parseFloat(edtText.getText() + "");
            edtText.setText(mValueOne - mValueTwo + "");
            mSubtract = false;
        }
        if (mMultiple == true)
        {
            mValueTwo = Float.parseFloat(edtText.getText() + "");
            edtText.setText(mValueOne * mValueTwo + "");
            mMultiple = false;
        }
        if (mDivision == true)
        {
            mValueTwo = Float.parseFloat(edtText.getText() + "");
            edtText.setText(mValueOne / mValueTwo + "");
            mDivision = false;
        }
    }

}











