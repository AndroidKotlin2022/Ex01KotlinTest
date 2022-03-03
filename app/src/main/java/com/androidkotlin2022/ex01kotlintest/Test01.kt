package com.androidkotlin2022.ex01kotlintest

//코틀린 언어 기초문법 [ 코틀린 연습 사이트 : https://try.kotlinlang.org/ ]

//문법적 주요 특징!!
// A. 문장의 끝을 나타내는 ; 을 사용하지 않는다. 써도 에러는 아니지만 무시된다.
// B. 변수를 만들 때 자료형을 먼저 명시하지 않고 var 키워드를 사용한다. 단, 자료형은 존재함. 자동 형변환 안됨. 즉, 정적타입 언어임.[자바스크립트와 다름]
// C. 코틀린은 함수형 언어다. 즉, 함수를 객체처럼 생각해서 변수에 저장하고 파라미터로 넘겨주는 등의 작업이 가능함. [객체지향프로그래밍 언어가 아님]
// D. 안전하게 null 을 다룰수 있는 문법을 제공한다.

// #. 프로그램의 시작함수인 main함수가 반드시 있어야 함.
// #. 함수를 정의할 때 리턴타입위치에 'fun'키워드(function의 약자) 사용
fun main(){

    /* .kt 코틀린 파일만 별도로 실행하려면 마우스 우클릭으로 해당파일 run 메뉴 실행 - 결과는 하단 [run]탭에서 실행 */

    // 1. 화면출력
    //3. 화면 출력 print(), println()함수  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    print(10)
    print(3.14)
    print("Nice")

    // print()는 자동으로 줄바꿈 되지 않음. 자동 줄바꿈을 하고 싶다면 println() [ print + line]
    println()
    println("Hello Kotlin")
    println(10)
    println(10.5)
    println('A')
    println(true)
    println(5 + 3)
    // ; 이 없으므로 한줄에 2개의 코드를 작성할 수 없음. [ ;을 사이에 넣으면 구분이 되기는 하지만 권장하지 않음. ]
    //println(10)println(10) //ERROR

    // 변수명을 전달하면 변수안에 값이 출력됨 - 변수 선언문법에 대해서는 아래에서 소개
    var a:Int=10
    println( a )
    var b:String="Hello"
    println(b)


    //2. 자료형과 변수
    // * 코틀린 자료형의 종류
    // Boolean, Byte, Char, Short, Int, Long, Float, Double  [기본적으로 Kotlin은 모든 변수가 객체임. 즉, 모두 참조변수임] -Boolean, String, Any, Char은 숫자타입[Number Type] 이 아님!!!
    // String, Any(Java의 Object와 비슷), Unit ...  그외 Kotlin APIs, Java APIs

    // * 변수의 2가지 종류 : var, val  [ 문법 : var 변수명:자료형  or  val 변수명:자료형 ]
    // 2.1 var [ 값변경이 가능한 변수 ]
    var num:Int = 10
    println(num)

    var num2:Double = 3.14
    println(num2)

    // 2.2 val [ 값 변경이 불가능한 변수 - 읽기전용 변수 ]  ## 상수와는 조금 다른 개념임 - 상수는 const 키워드 사용 ##
    val num3:Int= 100
    //num3=200 //error
    println(num3)

    val c:Boolean= true
    //c= false //error
    println(c)


    // 2.3 자료형을 생략하며 변수선언이 가능함 - 자료형은 자동 추론됨.
    var aa=10 //Int
    println(aa)

    var bb=3.14 //Double
    println(bb)

    var cc=3.14f //Float
    println(cc)

    var dd=true //Boolean
    println(dd)

    var ee= 'A' //Char
    println(ee)

    var ff= "Hello" //String
    println(ff)
    //주의!!! 변수선언시에 자료형 표기가 없지만 값을 대입하면서 자료형이 자동추정되어 지정된 것임. 즉, 변수는 자료형이 있는 것임.



    // null 값 저장하기 - Nullable variable
    var aaa:String?= null
    println(aaa)

    // null 변수의 멤버 사용하기
    var bbb:String?= "Hello"
    //println( bbb.length ) //error - null safety 연산자 필요
    println( bbb?.length )




}