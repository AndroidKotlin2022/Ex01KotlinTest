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





}