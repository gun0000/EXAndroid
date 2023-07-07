package com.example.api1230;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SubActivity2 extends AppCompatActivity {

    //전역변수 선언
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        //레이아웃에 아이디찾기
        editText = findViewById(R.id.editTextTextPersonName2);
        textView = findViewById(R.id.textView5);

    }

    //입력하면 텍스트 뷰에 나타나게 하기
    public void onButtonClicked(View view) {
        //입력박스에 있는  값을 화면창에 출력시켜라
        //textView.setText(editText.getText());

        //새로운 페이지에 값을 넘기기
        //myIntent 예:택배상자 객체 생성
        Intent myIntent = new Intent(this,FourthActivity.class);
        //스트링 타입으로 변환
        String text = String.valueOf(editText.getText()); //.toString()으로 써도 된다.
        //상자에 담기          //키 밸류 처럼 담는다 //입력박스에 있는  값
        myIntent.putExtra("제목",text);
        Log.e("!","text확인"+text); //쓴글에 값 예:ㅈㄷㅂㅈㄷ

        startActivity(myIntent); // 담아서 보내기
    }
}