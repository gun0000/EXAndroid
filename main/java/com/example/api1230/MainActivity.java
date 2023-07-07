package com.example.api1230;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //자바의 메인같은 클래스 //시작메소드
        super.onCreate(savedInstanceState);// 부모 onCreate호출
        //메인 레이아웃 매핑
        setContentView(R.layout.activity_main); // 이 화면을 뜨게 만든다 //화면을 보여주겠다


    }
    //Log.i("인텐트","인텐트"+getApplicationContext()); 로그 찍는법

    //알림창띄우기
    public void onButton1Clicked(View view) {// 버튼 메소드 온클릭
        // Toast 메시지를 생성하여 화면에 출력하는 기능을 수행합니다. Toast는 잠깐 동안 화면에 간단한 메시지를 보여주는 데 사용되는 안드로이드의 클래스
        //Toast.makeText() 메소드는 다음과 같은 매개변수를 받습니다:
        //첫 번째 매개변수인 'this'는 현재 컨텍스트를 의미합니다. 'this'는 현재 액티비티를 가리킵니다.
        //두 번째 매개변수인 "버튼을 눌렸어요."는 Toast 메시지에 표시될 텍스트입니다.
        //세 번째 매개변수인 Toast.LENGTH_LONG은 Toast 메시지가 표시될 시간을 나타냅니다. 여기서는 긴 시간 동안 메시지가 표시되도록 설정되었습니다.
        Toast.makeText(this ,"버튼을 눌렸어요.", Toast.LENGTH_LONG).show();

    }

    //페이지이동
    public void onButton2Clicked(View view) {
        //페이지 이동
        //택배상자와 같다 //전달하고 사용하는 클래스
        // getApplicationContext()는 현재 컨텍스트(애플리케이션 컨텍스트)를 가져옵니다.
        // SubActivity.class는 전환할 액티비티의 클래스입니다.
                                    //android.app.Application@5712a08
        Intent myIntent = new Intent(getApplicationContext(),SubActivity.class);//getApplicationContext 에서 SubActivity 페이지 이동준비

        // 생성한 Intent를 사용하여 다른 액티비티로 화면을 전환합니다.
        startActivity(myIntent); //페이지 이동

    }

    //네이버가기
    public void onButton3Clicked(View view) {

        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);

    }
    
    //전화걸기
    public void onButton4Clicked(View view){

        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1111-2222"));
        startActivity(myIntent);

    }





}