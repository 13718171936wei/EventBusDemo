package com.bw.eventbusdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    //事件的发布
    public void pass(View view){
        EventBus.getDefault().post(new MyEvent("小青啊的团长"));
        startActivity(new Intent(SecondActivity.this,MainActivity.class));
    }


    //内部类bean
    public  class MyEvent{
        private String name;

        public MyEvent(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
