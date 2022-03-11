package com.androidkotlin2022.ex01kotlintest

import android.util.Log
import kotlin.reflect.typeOf

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

    //권장하지는 않지만 변수만 먼저 만들고 나중에 값을 대입해도 됨. [지역변수만 가능함 - 추후 추가 설명]
    var num3:Float
    num3= 5.23f
    println(num3)


    //변수이므로 변수가 가진 값의 변경 가능함
    num = 20;
    num2 = 20.5
    num3 = 10.88F
    println(num)
    println(num2)
    println(num3)
    println()

    //자료형이 있는 변수이므로 다른 자료형을 대입하면 ERROR
    //num= 3.14 //ERROR   [Int변수에 Double대입]
    //num2= 50   //ERROR   [Double변수에 Int대입] - 자동형변환 없음

    //명시적으로 형변환 하는 방법 [ .toXXX()로 변환 가능함. ]
    //a= (Int)3.14 //이런 문법 없음.
    num = 3.14.toInt()
    num2 = 50.toDouble()

    println(num)
    println(num2)
    println()



    // 2.2 val [ 값 변경이 불가능한 변수 - 읽기전용 변수 ]  ## 상수와는 조금 다른 개념임 - 상수는 const 키워드 사용 ##
    val n1:Int= 100
    //n1=200 //error
    println(n1)

    val n2:Boolean= true
    //n2= false //error
    println(n2)

    //권장하지 않지만 변수를 만들때 값을 지정하지 않으면 1번은 대입 할 수 있음. - 그 값으로 정해지고 값 변경 불가
    val n3:String
    n3= "Nice"
    //n3= "Good" //error
    println(n3)


    // 2.3 자료형을 생략하며 변수선언이 가능함 - 자료형은 자동 추론됨.
    var aa=10 //Int
    println(aa)

    var bb=3.14 //Double
    println(bb)

    var cc=3.14f //Float
    println(cc)

    val dd=true //Boolean
    println(dd)

    val ee= 'A' //Char
    println(ee)

    val ff= "Hello" //String
    println(ff)
    //주의!!! 변수선언시에 자료형 표기가 없지만 값을 대입하면서 자료형이 자동추정되어 지정된 것임. 즉, 변수는 자료형이 있는 것임.

    // 자료형 명시 생략을 통해 자동 추론을 하는 변수를 사용할때는 반드시 선언하면서 값을 대입해야만 함.
    //var gg  //error
    //gg=10

    //val hh  //error
    //hh= "aaa"


    // * 정수값 표기의 특이한 점. [실생활에서 숫자의 3자리마다 , 구분을 사용하듯이 값에 _문자로 구분자사용 가능 :잘 사용하지 않음]
    var a3 = 5_000_000
    println(a3) //출력은 그냥 원래대로 구분자없이 숫자만 보여짐


    // 2.4. 코틀린만의 자료형 타입
    // Any타입 [ 어떤 타입이든 된다는 표현식 : 타입이 정해져 있지 않은 것이 좋아보이지만 실제 프로그래머들에게는 실수의 여지가 크기에 선호되지 않음(자료형 예측이 어려움). 초보자들은 선호함 ]
    // 타입을 특정하기 어려울 때 활용됨. (Java의 Object와 비슷 - 최상위클래스)
    var v: Any
    v = 10
    println(v)

    v = 3.14
    println(v)

    v = "Hello"
    println(v)
    println()


    // ** 변수에 값을 대입할 때 특이점!! [ null 안전성 - 별도로 파일을 만들어 학습 예정 - 여기서는 대략적인 특성만 소개 ] ///////
    // null값의 존재에 대한 체크 !!!!!!
    var t = null              // --------- 자동 추론으로 Any? 로 지정됨
    println(t) //출력 : null

    // 자료형을 명시하면 기본적으로 변수에 null을 저장할 수 없도록 되어 있음.
    //var n2: Int  = null   //ERROR
    //var s: String = null //ERROR

    //null값을 가질 수 있는 변수라고 표시할 수 있음. [ Nullable 변수 ]
    var nn: Int? = null
    var s2: String? = null
    println(nn)
    println(s2)
    println()

    // null 변수의 멤버 사용하기 -
    var bbb:String?= "Hello"
    //println( bbb.length ) //error - null safety 연산자 필요
    println( bbb?.length )  // Nullable 변수를 사용할 때 특이한 멤버접근 연산자들은 뒤에 따로 소개
    ///////////////////////////////////////////////////////////////////////


    // ** 화면 출력의 format 만들기 ******************************************************************
    println("Hello" + " Kotlin") //문자열 결합 연산자 + 사용가능함

    //하지만 Number타입에서 String타입으로 자동 형변환은 이루어지지 않음.
    //println( 10 + "Hello") //ERROR
    //그래서 Number자료형을 String자료형으로 변환하여 출력
    println(10.toString() + " Hello")

    //특이한 점! 문자열이 먼저 있다면 덧셈 가능
    println("Hello" + 10)
    println()

    //즉, 2변수의 값을 덧셈하는 코드
    var nnn1 = 50
    var nnn2 = 30
    //println( num1 +" + "+ num2 +" = " + num1+num2) //이렇게 작성할 수 없음.
    println(nnn1.toString() + " + " + nnn2.toString() + " = " + (nnn1 + nnn2))//이렇게 하거나
    println("" + nnn1 + " + " + nnn2 + " = " + (nnn1 + nnn2)) //이렇게 문자열을 먼저...해아함.

    //하지만 위 2가지 모두 가독성이 떨어지고 실수의 여지가 많음.
    println("  $nnn1  +  $nnn2   =   ${nnn1 + nnn2} ") //이렇게 " " 사이에 $키워드로 변수명임을 표시하고 사용하는 방식 사용
    // 이렇게  $변수명 을 사용하는 것을 [문자열 탬플릿] 이라고 부름


    //즉, 종합하면..
    var name = "sam"
    var age = 20
    println("이름 : $name \n나이 : $age")
    println()
    // **************************************************************************************************


    //3. 연산자 특이점.////////////////////////////////////////////////////////////////////////////////////
    //숫자타입들간의 연산은 자동형변환이 수행됨[작은것->큰것]
    println(10 + 3.14)

    //숫자타입이 아닌 자료형과는 자동 형변환이 수행되지 않음.
    //println(10 + true) //ERROR
    //println(10 + 'A') //ERROR

    println()
    //자료형을 체크해주는 연산자 is
    var n4 = 10
    if (n4 is Int) {
        println("n4변수는 Int타입 입니다.")
    }

    var s3: String = "Hello"
    if (s3 is String) println("s3변수는 String 타입입니다.")
    //String 과 String? 는 같은 타입의 종류!!!
    if (s3 is String?) println("s3변수는 String 타입입니다.")

    // !is 도 있음.
    if( s3 !is String) println("s3변수는 String 타입이 아닙니다.")

    //다른 자료형은 is연산자로 체크하면 에러남
    //if( n4 is String){ } //ERROR

    //그럼 큰 의미는 없겠군요?? No............
    //사실 is연산자는 Any타입에 대한 식별로 많이 사용됨
    var obj:Any

    obj= 10
    //obj= 10.5
    if(obj is Int) println( "${obj}는 Int입니다.")
    if(obj is Double) println( "${obj}는 Doubl입니다.")


    //자바의 instanceof같은 기능으로도 사용가능

    open class Person{
        //코틀린에서는 멤버변수를 속성[Property]라고 명명함.
        //주의!! 프로퍼티는 반드시 초기화가 되어 있어야 함.
        var name:String = "sam"
        var age= 20
    }


    var p= Person()
    if(p is Person){
        println( p.name + "  " + p.age )
        println( "이름 : ${p.name}    나이: ${p.age}")
    }


    // is의 특이한점. is로 특정 타입으로 확인되었다면 참인 영역안에서는 그 타입으로 인식됨.
    //Any타입에 Person객체로 인식하여 사용하기
    var obj2:Any
    obj2= Person()
    //obj2.name="aaa" //편집기에서 name변수의 존재를 알려주지 않음. [다만, 업캐스팅 되어 있다면 .연산자로 자식객체의 멤버를 강제로 명시하여 사용이 가능함(자동 형변환 - 권장하지 않음)]

    if(obj2 is Person){  // is의 참 영역 안에서는 obj2가 Any타입이 아니라 Person타입의 참조변수인것으로 편집기가 인식함.
        println( obj2.name + "  " + obj2.age )
        println( "이름 : ${obj2.name}    나이: ${obj2.age}")
    }

    //obj2.name="aaa" //편집기에서 name변수의 존재를 알려주지 않음.
    println()



    //4. 제어문에서 특이한 점!!! //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 코틀린의 제어문 종류 : if, when, while, for [ switch 문법이 없음 ]

    //4.1. if와 삼항연산자의 결합
    //var str= (10>5)? "Hello" : "Nice" //ERROR : 삼항연산자 문법이 없음
    var str= if(10>5) "Hello" else "Nice"
    println(str)

    //혹시 if나 else문의 실행문이 여러줄이면 마지막 실행문이 변수에 대입됨
    str= if(10>5){
        "zzzzz"
        "aaaaa"
    }else{
        "qqqqq"
        println("ggggg") //당연히 이렇게 출력문 같은 코드가 있어도 됨.
        "bbbbb"
        //println("ggggg") //마지막이 있으면 당연히 에러 [ str의 자료형이 String이어서 에러임. Any였다면 에러 아님. 참고로 println()함수의 자료형은 Kotlin.Unit 타입임]
    }
    //이런 특징 때문에 if문을 코틀린에서는 제어문이라고 하지 않고 [if표현식]이라고 부름.
    println(str)
    println()


    //4.2. switch 문법이 없어지고 when 문법이 이를 대체함
    var h:Any?= null

    //문법이 없어서 아예 에러
    //switch(h){   }

    h=10
    when(h){
        10-> println("aaa")
        20-> println("bbb")
        //자료형이 달라도 상관없음
        "Hello"-> println("Hello")
        true-> println("true")

        //변수가 있어도 됨 (위에서 만들었던 n4변수가 10을 가지고 있음)
        n4-> println("n4와 값이 같음")

        //2개이상의 조건을 묶을 수 있음
        30,40-> println("30 or 40 입니다.")

        //switch문의 default역할 : 실행할 코드가 여러줄이면 {}로 묶어서...
        else->{
            println("ccc")
            println("end")
        }
    }


    //when도 if문처럼 표현식이라서 결과를 변수에 저장하는 것이 가능함
    h=20
    var result= when(h){
        10->"Hello"
        20->"Nice"
        else->{
            println("else")
            "BAD"
        }
    }
    println(result)


    //when에 is키워드 사용도 가능함
    when(h){
        is Int -> println("Int 타입입니다.")
        is String -> println("String 타입입니다.")
        else -> println("else")
    }
    println()


    // when을 특정 수식으로 제어하고 싶을 때 : when()에서 ()를 생략
    h=85
    when{
        h>=90 && h<=1000-> println("A학점 입니다")
        //h in 90..1000 -> println("A학점 입니다") - range 로 위 조건문을 변경할 수 있음. [range ... 문법은 반복문을 통해 소개]
        h>=80 -> println("B학점 입니다.")
        h>=70 -> println("C학점 입니다.")
        h>=60 -> println("D학점 입니다.")
        else -> println("F학점 낙제 입니다.")
    }

    //when에 in키워드 연산자를 통해 Collections의 요소들값을 체크할 수도 있음.
    //이는 for문과 배열에 대한 소개후 수업해야함.




    //5. 반복문
    // while문은 다른 것이 없음

    // for문은 작성하는 방법이 완전히 다름
    //for(var i=0; i<5; i++){} //ERROR - 이런 문법이 없음

    // 0부터 5까지 6번 실행되는 반복문
    for(i in 0..5){ //i변수 앞에 var쓰면 에러
        println(i)
    }
    println()

    //for안의 제어변수는 지역변수이기에 위에 사용했던 변수명을 사용해도 문제없음
    for(a in 3   ..    10){ //..양옆의 공백은 상관없음  - 3~10
        println(a)
    }
    println()

    //마지막 숫자 전까지 .. 대신에 until
    for(i in 0 until 10){ // 0 ~ 9
        println(i)
    }
    println()

    //2씩 증가 ( step )
    for(i in 0..10 step 2){ //0,2,4,6,8,10
        println(i)
    }
    println()

    //값의 감소 ( downTo )
    for(i in 10 downTo 0) println(i) //10,9,8,7,6,5,4,3,2,1,0
    println()

    //값의 2씩 감소 ( downTo + step )
    for(i in 10 downTo 0 step 2) println(i) //10,8,6,4,2,0
    println()


    //for에 대한 또다른 점은 배열을 먼저 배우고...


    //6. 배열 Array ///////////////////////////////////////////////////////////////////////////////////////
    // 5.1 요소개수의 변경이 불가능한 배열 : Array
    var arr= arrayOf(10,20,30)
    //요소값 출력
    println(arr[0])
    println(arr[1])
    println(arr[2])
    //println(arr[3]) //Exception발생
    println()

    //값변경도 특별할 것 없음
    arr[0]= 100
    println(arr[0])
    println()

    //arr[3]= 40 //인덱스번호가 틀리면 Exception발생

    //특이한 점은 코틀린의 모든 변수는 객체이므로 당연히 배열도 객체이며 모든 배열은 자동으로 get(), set() 함수와  size변수를 기본으로 가지고 있음
    println(arr.get(0)) //마치 자바의 ArrayList 요소 값 얻어오기 처럼...사용가능
    println(arr.get(1))
    println(arr.get(2))
    println()

    arr.set(1, 200)
    println(arr.get(0))
    println(arr.get(1))
    println(arr.get(2))
    println()

    //배열의 길이
    println("배열의 길이 : ${arr.size}")
    println()


    //출력을 일일이 하는거 짜증나죠?
    for(i in 0 until 3){   // 0..3쓰면 OutOfIndex Exception발생함
        println(arr.get(i))
    }
    println()

    //for문에 사용된 0..5는 사실 배열같은 것임. 즉, 6개짜리 배열을 놓은 것임.
    //in키워드는 자바의 확장된 for문(foreach문) 같은 역할임
    //다시말해 0..5자리에 배열이 놓여지고 i는 각 요소들의 차례로 대입되는 임시변수같은 것임

    //배열요소값 for문으로 출력하기 (Java의 foreach문 같은 코드)
    for(n in arr){ //n은 인덱스번호가 아님.... 주의!!!
        println(n)
    }
    println()

    //혹시 그럼에도 인덱스로 얻어오고 싶다면?? [ indices[인디시즈] : index의 복수형 ]
    for(i in arr.indices){
        println(i)
    }
    println()

    //혹시 인덱스와 값을 동시에 가져오고 싶다면
    for( (i, v) in arr.withIndex() ){
        println( "[ $i ] : $v ")
    }
    println()

    //함수형 프로그래밍 언어들의 배열처럼 요소값을 각각을 반복적으로 접근할때마다 {}의 코드가 실행되도록 하는 forEach 기능 있음.
    // {}안에서는 생략된 변수 it 이 있으며.. it이 요소의 값을 가지고 있음. [ 배열요소의 자료형으로 자동 지정됨 ]
    arr.forEach {
        println(it)
    }
    println()

    //arrayOf() 배열의 특이한 점.
    //배열 각 요소의 자료형을 다르게 하면 각 요소의 타입은 read only Any 타입이 됨. [kotlin 이 버전업 되면서 - 2021년 상반기에는 값변경이 되었음]
    var arr2= arrayOf(10, "Hello", true)

    //값을 가져오는 것은 문제 없음
    println(arr2[0])
    println(arr2[1])
    println(arr2[2])
    println()

    //각 요소의 값은 변경할 수 없음
    arr2[0]= 20 //ERROR
    arr2.set(1, "bbb") //ERROR

    // 또한 요소의 타입이 저장된 값의 자료형으로 되어 있지 않기에 곧바로 연산에 사용 못함
    //println( arr2[0] + 5 ) //ERROR
    println( arr2[0] as Int + 5) //요소를 as 연산자로 변환해서 사용해야 함.
    println( arr2[1] as String + "AAA")
    println()


    //그래서 보통 배열을 사용할때는 타입을 명시하여 같은 자료형만 저장함 [원래 배열의 특징]





    // 5.2 요소개수의 변경이 가능한 유동적배열 : Collection [ List, Set, Map ]



}