package com.androidkotlin2022.ex01kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

// 코틀린 문법 연습을 위해 별도의 코틀린 파일 생성
// 원하는 패키지에서 우클릭으로 New >> Kotlin Class/File 선택
// 우선 기본 문법 테스트로서 File를 만들어 실습진행 [ Test01.kt ]