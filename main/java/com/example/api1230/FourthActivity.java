package com.example.api1230;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        //넘어온 값을 꺼낸다 getIntent();
        Intent fourthIntent = getIntent();
        Log.e("!","fourthIntent확인"+fourthIntent); //Intent { cmp=com.example.api1230/.FourthActivity (has extras) }



        //더 상세하게 꺼낸다  키값을 적는다
        String msg = fourthIntent.getStringExtra("제목");
        Log.e("!","msg확인"+msg); //쓴글에 값 예:ㅈㄷㅂㅈㄷ
        //값을줄 아이디를 찾아서
        TextView tv = findViewById(R.id.textView2);
        //그 값에 넣어준다
        tv.setText(msg);

    }

    //웹뷰페이지로 이동
    public void onButtonClicked(View view) {
        Intent myIntent = new Intent(this,FifthActivity.class);
        startActivity(myIntent);

    }
}