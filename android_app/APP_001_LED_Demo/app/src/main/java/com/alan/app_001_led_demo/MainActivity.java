package com.alan.app_001_led_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,CompoundButton.OnCheckedChangeListener{
    private Button btnAll = null;
    private boolean isClickAll = false;

    private CheckBox ckLed1 = null;
    private CheckBox ckLed2 = null;
    private CheckBox ckLed3 = null;
    private CheckBox ckLed4 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initAction();
    }

    private void initView(){
        btnAll = (Button) findViewById(R.id.btn_all);
        ckLed1 = (CheckBox) findViewById(R.id.led1);
        ckLed2 = (CheckBox) findViewById(R.id.led2);
        ckLed3 = (CheckBox) findViewById(R.id.led3);
        ckLed4 = (CheckBox) findViewById(R.id.led4);

    }

    private void initAction(){
        btnAll.setOnClickListener(this);
        ckLed1.setOnCheckedChangeListener(this);
        ckLed2.setOnCheckedChangeListener(this);
        ckLed3.setOnCheckedChangeListener(this);
        ckLed4.setOnCheckedChangeListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_all:
                isClickAll = !isClickAll;
                if(isClickAll){
                    btnAll.setText(R.string.button_all_off);
                    ckLed1.setChecked(true);
                    ckLed2.setChecked(true);
                    ckLed3.setChecked(true);
                    ckLed4.setChecked(true);
                }else{
                    btnAll.setText(R.string.button_all_on);
                    ckLed1.setChecked(false);
                    ckLed2.setChecked(false);
                    ckLed3.setChecked(false);
                    ckLed4.setChecked(false);
                }

                break;
            default:
                break;
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.led1:
                if(isChecked){
                    Toast.makeText(this,R.string.toast_led1_click_on,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this,R.string.toast_led1_click_off,Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.led2:
                if(isChecked){
                    Toast.makeText(this,R.string.toast_led2_click_on,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this,R.string.toast_led2_click_off,Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.led3:
                if(isChecked){
                    Toast.makeText(this,R.string.toast_led3_click_on,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this,R.string.toast_led3_click_off,Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.led4:
                if(isChecked){
                    Toast.makeText(this,R.string.toast_led4_click_on,Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this,R.string.toast_led4_click_off,Toast.LENGTH_SHORT).show();
                }

                break;

        }
    }
}
