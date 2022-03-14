package com.androidkotlin2022.ex01kotlintest

fun main() {

    //NullPointerException[NPE]에 대한 앱의 버그를 문법에서부터 막아주기 위한 Null safety 관련 문법들

    //코틀린은 null값을 저장할 수 있는 타입을 명시적으로 구분하여 사용하도록 하고 있음.
    //var s1:String  = null //ERROR - non nullable 변수
    var s2:String? = null //OK  - nullable 변수
    println(s2)


    // Nullable변수를 사용할 때 특이한 멤버접근 연산자들
    var str1:String = "Hello"   // non nullable type
    var str2:String? = "Nice"   // nullable type

    //위 두 타입(String, String?) 의 차이
    println("글자수 : " + str1.length)    // OK :   . 연산자를 통해 String객체의 멤버 접근하여 사용
    //println("글자수 : " + str2.length)  // ERROR :  String? 타입은 null 일 수도 있다는 것이기에 . 연산자가 언제나 안전하게 멤버를 가져올 수 있다고 확신할 수 없음 - 실제 null 이 아니어도 사용불가 [ 객체가 없을때 NullPointException 발생 ]

    //해결방법 - null인지 확인하는 if문 코드 필요
    if(str2!=null) println("글자수 : " + str2.length) //if문이 참일때만 실행되는 영역이어서 String?도 사용가능함.

    //근데 위 해결방법이 좀 코드가 번거로움. 그래서 등장한 안전한 호출 연산자 ?.

    //1) ?. 연산자 : null safe 연산자
    println("글자수 : " + str2?.length)  // null이 아니면 멤버에 접근, null이면 그냥 null 을 결과로 줌

    //진짜로 객체가 null이면 null출력 됨
    str2= null;
    println("글자수 : " + str2?.length)  // null 출력
    //---------------------------------------------------------------------------------------


    //근데 객체가 null일때 그냥 null로 값이 전달되는 것이 싫고..내가 원하는 값으로 나왔으면 한다면??
    //객체가 null이면 길이값을 -1 로 주고 싶다면....
    val len= if(str2!=null) str2.length else -1
    println(len)

    //if-else 표현식이 길게 느껴진다면...
    //2) ?: 연산자 -  엘비스[Elvis] 연산자
    val len2= str2?.length ?: -1   // ?: 연산자 뒤에 null일때 원하는 값을 지정
    println(len2)
    println()
    //-----------------------------------------------------------------------------------------


    //이런 NPE에 안전한 사용을 위한 문법을 쓰지 않고 그냥 자바에서처럼 실수로 null 참조변수를 사용하면 Exception이 발생하여 앱이 종료되로록 하고싶다면?
    //즉, 개발자가 의도하지 않게 null이면 앱이 꺼지도록 하여 앱을 더이상 실행되게 하고 싶지 않다면..
    //3) non-null asserted(주장된,단언된) call !! 연산자
    var ss:String?= "Hello"
    //println( ss.length )  //ERROR - String? 타입은 NPE 발생이 안되도록 문법적으로 못쓰도록 하고 있음
    println( "글자수 : " + ss!!.length  )

    //이렇게 중간에 null이 되면 !!연산자를 사용할때 length 멤버를 인식하지 못함[모든 String멤버 인식불가]
    //ss=null
    //println( "글자수 : " + ss!!.length  ) //ERROR

    // null 참조객체
    val sss:String?= null
    //println( "글자수 : " + sss!!.length  ) //Exception
    println()
    //------------------------------------------------------------------------------------------


    //4) 안전한 casting 연산자 as?  - 자료형이 맞지 않는 타입을 억지로 형변환 하는 경우
    val mmm:MMM?= MMM()

    //전혀 다른 타입 참조변수에 대입
    //val zzz:BBB?= mmm       //문법적으로 error - 타입이 전혀다르므로.

    //억지로 as 연산자를 통해 형변환 [ class 수업을 통해 as 형변환 연산자 소개 ]
    //val zzz:ZZZ? = mmm as ZZZ?  //문법적으로는 error가 없지만 Class cast Exception 발생함!

    //이때 혹시 잘못된 casting을 해도 예외로 인해 앱이 다운되지 않고 그냥 null을 리턴하는 안전한 캐스팅 연산자 as?
    val zzz:ZZZ? = mmm as? ZZZ?
    println(zzz) // null출력   - 객체가 실제로 캐스팅이 되었다면 [클래스명@해시코드] 가 출력됨

}

//4) 안전한 캐스팅 실습용 클래스들
class MMM{
    var a=10
}

class ZZZ{
    val a=20
}