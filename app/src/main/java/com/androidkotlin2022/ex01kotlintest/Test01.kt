package com.androidkotlin2022.ex01kotlintest

// 실습내용
// 1. 화면출럭

fun main(){

    /* .kt 코틀린 파일만 별도로 실행하려면 마우스 우클릭으로 해당파일 run 메뉴 실행 - 결과는 하단 [run]탭에서 실행 */

    // 1. 화면출력
    print("Hello")
    print(10)
    print(3.14)
    //자동으로 줄바꿈 되지 않음.

    println()
    println("Nice")
    println(100)
    println(true)

    // 변수명을 전달하면 변수안에 값이 출력됨
    var a:Int=10
    println( a )
    var b:String="Hello"
    println(b)

    //2. 자료형과 변수
    // * 코틀린 자료형의 종류
    // Boolean, Byte, Char, Short, Int, Long, Float, Double . . .
    // String, Any, Unit ...  그외 Kotlin APIs, Java APIs

    // * 변수의 2가지 종류 : var, val
    // 2.1 var [ 값변경이 가능한 변수 ]
    var num:Int = 10
    println(num)

    var num2:Double = 3.14
    println(num2)

    // 2.2 val [ 값 변경이 불가능한 변수 - 읽기전용 변수 ]  ## 상수와는 조금 다른 개념임 - 상수는 const 키워드 사용 ##





}