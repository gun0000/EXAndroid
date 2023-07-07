package com.example.api1230;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SubActivity extends AppCompatActivity {

    //전역변수 선언
    ImageView img3;
    ImageView img4;
    int imageIndex = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        //이미지 찾기
        //아이디 찾기
        //레이아웃에 있는 아이디 이미지뷰
        img3 = findViewById(R.id.imageView3);
        img4 = findViewById(R.id.imageView4);
    }

    public void onButtonClicked(View view) {

        //이미지 전환 메소드 호출
        changeImage();

    }

    //이미지 전환 메소드
    private void changeImage(){

        if (imageIndex == 0){
            img3.setVisibility(View.VISIBLE);//보여지게 한다
            img4.setVisibility(View.INVISIBLE);//안보이게 한다
            imageIndex = 1;
        }else {
            img3.setVisibility(View.INVISIBLE);//안보이게 한다
            img4.setVisibility(View.VISIBLE);//보여지게 한다
            imageIndex = 0;
        }



    }

    //페이지 이동
    public void onButton2Clicked(View view) {
        Intent myIntent = new Intent(getApplicationContext(),SubActivity2.class);
        startActivity(myIntent);
    }
}