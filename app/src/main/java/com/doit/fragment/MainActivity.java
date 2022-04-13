package com.doit.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 사용할 변수선언
    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 버튼가져오기
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);

        // 버튼클릭시 이벤트 메서드
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction(); //프래그먼트 매니저 가져오고 비긴트렌젝션을 생성하
                Fragment1 fragment1 = new Fragment1(); //프래그먼트1 타입의 객체생성
                transaction.replace(R.id.frame,fragment1); // 교체할 프래그먼트 레이아웃설정
                transaction.commit(); // transaction .커밋하여 저장

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment2 fragment2 = new Fragment2();
               getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment2).commit();


            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment3 fragment3 = new Fragment3();
                transaction.replace(R.id.frame,fragment3);
                transaction.commit();

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment4 fragment4 = new Fragment4();
                transaction.replace(R.id.frame,fragment4);
                transaction.commit();

            }
        });

    }
}