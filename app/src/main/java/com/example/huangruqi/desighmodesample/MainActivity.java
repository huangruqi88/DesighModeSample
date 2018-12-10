package com.example.huangruqi.desighmodesample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.huangruqi.desighmodesample.factory.Cat;
import com.example.huangruqi.desighmodesample.factory.Dog;
import com.example.huangruqi.desighmodesample.factory.SimapleFactory;
import com.example.huangruqi.desighmodesample.factory.SimapleFactory1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnSimpleFactory;
    private Button mBtnStrategy;
    /**
     * 被点击了几次
     */
    private int mClickNum = 0;
    /**
     * 是否被点击过
     */
    boolean isClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnSimpleFactory = findViewById(R.id.btn_simple_factory);
        mBtnStrategy = findViewById(R.id.btn_strategy);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_simple_factory:
                isClicked = true;
                mClickNum++;
                String content = getResources().getString(R.string.check_look);
                String name = getResources().getString(R.id.btn_simple_factory);
                String info = String.format(content, name, mClickNum, "factory", name);
                Toast.makeText(this, info, Toast.LENGTH_LONG).show();
                //第一种简单工厂
                Cat cat = (Cat) SimapleFactory.createInstence("Cat");
                Dog dog = (Dog) SimapleFactory.createInstence("Dog");
                //第二种简单工厂
                Cat cat1 = (Cat) SimapleFactory1.createInstence(Cat.class);
                Dog dog1 = (Dog) SimapleFactory1.createInstence(Dog.class);
                break;
            case R.id.btn_strategy:
                break;
            default:
                break;
        }
    }
}
