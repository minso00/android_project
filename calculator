# 계산기 Xml, Java 코드
## xml
```
<EditText
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:id="@+id/Edit1"
    android:hint="숫자 입력"></EditText>

<EditText
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:id="@+id/Edit2"
    android:hint="숫자 입력"></EditText>

<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal">

    <Button
        android:layout_width="75dp"
        android:layout_height="wrap_content"
        android:id="@+id/btn0"
        android:layout_marginLeft="7dp"
        android:layout_marginRight="5dp"
        android:text="0"></Button>

    <Button
        android:layout_width="75dp"
        android:layout_height="wrap_content"
        android:id="@+id/btn1"
        android:layout_marginRight="5dp"
        android:text="1"></Button>

    <Button
        android:layout_width="75dp"
        android:layout_height="wrap_content"
        android:id="@+id/btn2"
        android:layout_marginRight="5dp"
        android:text="2"></Button>

    <Button
        android:layout_width="75dp"
        android:layout_height="wrap_content"
        android:id="@+id/btn3"
        android:layout_marginRight="5dp"
        android:text="3"></Button>

    <Button
        android:layout_width="75dp"
        android:layout_height="wrap_content"
        android:id="@+id/btn4"
        android:layout_marginRight="5dp"
        android:text="4"></Button>
</LinearLayout>

<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal">

    <Button
        android:layout_width="75dp"
        android:layout_height="wrap_content"
        android:id="@+id/btn5"
        android:layout_marginLeft="7dp"
        android:layout_marginRight="5dp"
        android:text="5"></Button>

    <Button
        android:layout_width="75dp"
        android:layout_height="wrap_content"
        android:id="@+id/btn6"
        android:layout_marginRight="5dp"
        android:text="6"></Button>

    <Button
        android:layout_width="75dp"
        android:layout_height="wrap_content"
        android:id="@+id/btn7"
        android:layout_marginRight="5dp"
        android:text="7"></Button>

    <Button
        android:layout_width="75dp"
        android:layout_height="wrap_content"
        android:id="@+id/btn8"
        android:layout_marginRight="5dp"
        android:text="8"></Button>

    <Button
        android:layout_width="75dp"
        android:layout_height="wrap_content"
        android:id="@+id/btn9"
        android:layout_marginRight="5dp"
        android:text="9"></Button>
</LinearLayout>

<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:layout_marginTop="20dp">

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/btnp"
        android:text="더하기"></Button>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/btnm"
        android:text="빼기"></Button>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/btnmul"
        android:text="곱하기"></Button>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/btndiv"
        android:text="나누기"></Button>
</LinearLayout>

<TextView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:id="@+id/textResult"
    android:text="계산 결과 : "
    android:textColor="#FF0000"
    android:padding="10dp"
    android:layout_marginTop="20dp"
    android:textSize="20dp"></TextView>
```
## Java 
```
package com.example.practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText Edit1, Edit2;
Button btnp, btnm, btnmul, btndiv;
TextView textResult;
String num1, num2;
Integer result;
Button[] numButtons = new Button[10];
Integer[] numBtnIDs = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};
int i;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Edit1 = (EditText) findViewById(R.id.Edit1);
    Edit2 = (EditText) findViewById(R.id.Edit2);
    btnp = (Button) findViewById(R.id.btnp);
    btnm = (Button) findViewById(R.id.btnm);
    btnmul = (Button) findViewById(R.id.btnmul);
    btndiv = (Button) findViewById(R.id.btndiv);
    textResult = (TextView) findViewById(R.id.textResult);

    btnp.setOnTouchListener(new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            num1 = Edit1.getText().toString();
            num2 = Edit2.getText().toString();
            result = Integer.parseInt(num1) + Integer.parseInt(num2);
            textResult.setText("계산 결과 : " + result.toString());
            return false;
        }
    });

    btnm.setOnTouchListener(new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            num1 = Edit1.getText().toString();
            num2 = Edit2.getText().toString();
            result = Integer.parseInt(num1) - Integer.parseInt(num2);
            textResult.setText("계산 결과 : " + result.toString());
            return false;
        }
    });

    btnmul.setOnTouchListener(new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            num1 = Edit1.getText().toString();
            num2 = Edit2.getText().toString();
            result = Integer.parseInt(num1) * Integer.parseInt(num2);
            textResult.setText("계산 결과 : " + result.toString());
            return false;
        }
    });

    btndiv.setOnTouchListener(new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            num1 = Edit1.getText().toString();
            num2 = Edit2.getText().toString();
            result = Integer.parseInt(num1) / Integer.parseInt(num2);
            textResult.setText("계산 결과 : " + result.toString());
            return false;
        }
    });

    for (i = 0; i < numBtnIDs.length; i++) {
        numButtons[i] = (Button) findViewById(numBtnIDs[i]);
    }
    for (i = 0; i < numBtnIDs.length; i++) {

        final int index; // 주의! 꼭 필요함..
        index = i;

        numButtons[index].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 포커스가 되어 있는 에디트텍스트에 숫자 추가
                if (Edit1.isFocused() == true) {
                    num1 = Edit1.getText().toString()
                            + numButtons[index].getText().toString();
                    Edit1.setText(num1);
                } else if (Edit2.isFocused() == true) {
                    num2 = Edit2.getText().toString()
                            + numButtons[index].getText().toString();
                    Edit2.setText(num2);
                } else {
                    Toast.makeText(getApplicationContext(),
                            "먼저 에디트텍스트를 선택하세요",Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
```
