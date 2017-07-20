package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CoffeeActivity extends AppCompatActivity {
    public static final int INT = 1;
    public static final int MIN_QUANTITY = 1;
    public static final int DEFAULT_QUANTITY = 1;
    public static final int COFFEE_PRICE = 3000;
    private TextView mQuantityTextView;
    private TextView mPriceTextView;
    private EditText mNameEditText;
    private CheckBox mWippedCreamCheckBox;
    private int mQuantity = DEFAULT_QUANTITY;


    // 메인
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //레이아웃 설정
        setContentView(R.layout.activity_coffee);

        //XML에 있는 View의 래퍼런스를 가져오는 방법
        mQuantityTextView = (TextView) findViewById(R.id.quantity_text);
        mPriceTextView = (TextView) findViewById(R.id.price_text);
        mWippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream_check);
        mNameEditText = (EditText) findViewById(R.id.name_edit);

        mQuantityTextView.setText("" + mQuantity);
        mPriceTextView.setText("0원");
    }

    public void minusButtonClicked(View view) {
        mQuantity--;
        if (mQuantity < MIN_QUANTITY) {
            mQuantity = MIN_QUANTITY;
        }
        mQuantityTextView.setText("" + mQuantity);

        mPriceTextView.setText(mQuantity * COFFEE_PRICE + "원");
    }


    public void plusButtonClicked(View view) {
        Toast.makeText(this, "잘 눌림", Toast.LENGTH_SHORT).show();
        mQuantity++;
        mQuantityTextView.setText("" + mQuantity);
        mPriceTextView.setText(mQuantity * COFFEE_PRICE + "원");
    }
}
