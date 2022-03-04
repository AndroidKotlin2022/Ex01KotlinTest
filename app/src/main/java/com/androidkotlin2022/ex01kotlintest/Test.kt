package com.mrhi.hellokotlin

//코틀린 언어 기초문법 [ 코틀린 연습 사이트 : https://try.kotlinlang.org/ ]

//문법적 주요 특징!!
// A. 문장의 끝을 나타내는 ; 을 사용하지 않는다. 써도 에러는 아니지만 무시된다.
// B. 변수를 만들 때 자료형을 사용하지 않고 var키워드를 사용한다. 단, 자료형은 존재함. 자동 형변환 안됨. 즉, 정적타입 언어임.[자바스크립트와 다름]
// C. 코틀린은 함수형 언어다. 즉, 함수를 객체처럼 생각해서 변수에 저장하고 파라미터로 넘겨주는 등의 작업이 가능함. [객체지향프로그래밍 언어가 아님]
// D. 안전하게 null 을 다룰수 있는 문법을 제공한다.

//1. 프로그램의 시작함수인 main함수가 반드시 있어야 함.
//2. 함수를 정의할 때 리턴타입위치에 'fun'키워드(function의 약자) 사용
fun main() {

    // ## .kt문서의 실행은 마우스 우 클릭하여 run 하면됨. -결과는 아래 run 탭화면에서 출력됨. ## //

    //3. 화면 출력 print(), println()함수  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    println("Hello Kotlin")
    println(10)
    println(10.5)
    println('A')
    println(true)
    println(5 + 3)
    // ; 이 없으므로 한줄에 2개의 코드를 작성할 수 없음. [ ;을 사이에 넣으면 구분이 되기는 하지만 권장하지 않음. ]
    //println(10)println(10) //ERROR


    //4. 자료형과 변수 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 4.1 기본자료형 : Boolean, Char, Byte, Short, Int, Long, Float, Double, String, Any(Java의 Object와 비슷)  [기본적으로 Kotlin은 모든 변수가 객체임. 즉, 모두 참조변수임]
    //                -Boolean, String, Any, Char은 숫자타입[Number Type] 이 아님!!!

    // 4.2 변수선언 문법 [ var키워드 ] :  ;이 없기때문에 변수를 만들 때 반드시 값의 초기화가 있어야함. (또는 자료형을 명시하거나)
    // var 변수명:자료형
    //var a //ERROR
    var a = 10
    var b = 10.5
    var c = 3.14f
    var d = true
    var e = 'A'
    var f = "Hello"
    //주의!!! 변수선언시에 자료형 표기가 없지만 값을 대입하면서 자료형이 자동추정되어 지정된 것임. 즉, 변수는 자료형이 있는 것임.

    //변수이므로 변수가 가진 값의 변경 가능함
    a = 20;
    b = 20.5
    println(a)
    println(b)
    println()

    //자료형이 있는 변수이므로 다른 자료형을 대입하면 ERROR
    //a= 3.14 //ERROR   [Int변수에 Double대입]
    //b= 50   //ERROR   [Double변수에 Int대입] - 자동형변환 없음


    //명시적으로 형변환 하는 방법 [ .toXXX()로 변환 가능함. ]
    //a= (Int)3.14 //이런 문법 없음.
    a = 3.14.toInt()
    b = 50.toDouble()

    println(a)
    println(b)
    println()


    //그래서 변수선언시에 자료형을 명시적으로 표기하는 방법도 있음.
    var a2: Int = 100
    var b2: Double = 3.14
    var c2: Boolean //이렇게 자료형을 명시하면 값을 지정하지 않고 변수만 선언하는 것이 가능함.
    println(a2)
    println(b2)
    //println(c2) //ERROR - 변수에 초기화값이 없는 상태로 사용하면 에러.

    c2=true
    println(c2)

    //정수값 표기의 특이한 점. [실생활에서 숫자의 3자리마다 , 구분을 사용하듯이 값에 _문자로 구분자사용 가능 :잘 사용하지 않음]
    var a3 = 5_000_000
    println(a3) //출력은 그냥 원래대로 구분자없이 숫자만 보여짐


    // ** 화면 출력의 format 만들기
    println("Hello" + " Kotlin") //문자열 결합 연산자 + 사용가능함

    //하지만 Number타입에서 String타입으로 자동 형변환은 이루어지지 않음.
    //println( 10 + "Hello") //ERROR
    //그래서 Number자료형을 String자료형으로 변환하여 출력
    println(10.toString() + " Hello")

    //특이한 점! 문자열이 먼저 있다면 덧셈 가능
    println("Hello" + 10)
    println()

    //즉, 2변수의 값을 덧셈하는 코드
    var num1 = 50
    var num2 = 30
    //println( num1 +" + "+ num2 +" = " + num1+num2) //이렇게 작성할 수 없음.
    println(num1.toString() + " + " + num2.toString() + " = " + (num1 + num2))//이렇게 하거나
    println("" + num1 + " + " + num2 + " = " + (num1 + num2)) //이렇게 문자열을 먼저...해아함.

    //하지만 위 2가지 모두 가독성이 떨어지고 실수의 여지가 많음.
    println("  $num1  +  $num2   =   ${num1 + num2} ") //이렇게 " " 사이에 $키워드로 변수명임을 표시하고 사용하는 방식 사용
    // 이렇게  $변수명 을 사용하는 것을 [문자열 탬플릿] 이라고 부름


    //즉, 종합하면..
    var name = "sam"
    var age = 20
    println("이름 : $name \n나이 : $age")
    println()


    //Any타입 [ 타입이 없다는 표현식 : 타입이 정해져 있지 않은 것이 좋아보이지만 실제 프로그래머들에게는 실수의 여지가 크기에 선호되지 않음. 초보자들은 선호함 ]
    // 타입을 특정하기 어려울 때 활용됨.
    var v: Any
    v = 10
    println(v)

    v = 3.14
    println(v)

    v = "Hello"
    println(v)
    println()


    // 변수에 값을 대입할 때 특이점!! [ null 안전성 ]
    // null값에 대한 체크 !!!!!! -
    var n = null
    println(n) //출력 : null

    // 자료형을 명시하면 기본적으로 변수에 null을 저장할 수 없도록 되어 있음.
    //var n2: Int  = null   //ERROR
    //var s: String = null //ERROR

    //null값을 가질 수 있는 변수라고 표시할 수 있음. [ Nullable 변수 ]
    var n3: Int? = null
    var s2: String? = null
    println(n3)
    println(s2)
    println()

    // Nullable변수를 사용할 때 특이한 멤버접근 연산자들은 뒤에 따로 소개


    // 4.3 상수!!! [ 엄밀하게는 Read Only 변수라고 부름 ]
    val m=10
    //값변경하면 에러!!
    //m=30 //ERROR

    //자료형을 명시하면 다음줄에 값을 대입할 수 있음.
    val u:Int
    u=50
    //u=70 //ERROR







    //5. 연산자 특이점.////////////////////////////////////////////////////////////////////////////////////
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

    class Person{
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

    //Any타입에 Person객체 만들기
    obj= Person()
    if(p is Person){
        println( p.name + "  " + p.age )
        println( "이름 : ${p.name}    나이: ${p.age}")
    }
    println()





    //6. 제어문에서 특이한 점!!! //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //6.1. if와 삼항연산자의 결합
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



    //6.2. switch문법이 없어지고 when 문법이 이를 대체함
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

    // when을 특정 수식으로 제어하고 싶을 때 : when()에서 ()를 생략
    h=85
    when{
        h>=90 && h<=1000-> println("A학점 입니다")
        h>=80 -> println("B학점 입니다.")
        h>=70 -> println("C학점 입니다.")
        h>=60 -> println("D학점 입니다.")
        else -> println("F학점 낙제 입니다.")
    }

    //when도 if문처럼 표현식이라서 변수에 저장 가능함
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



    //when에 in키워드 연산자를 통해 Collections의 요소들값을 체크할 수도 있음.
    //이는 for문과 배열에 대한 소개후 수업해야함.


    //6.3. for문을 작성하는 방법이 완전히 다름

    //for(var i=0; i<5; i++){} //ERROR - 이런 문법이 없음

    for(i in 0..5){ //i변수 앞에 var쓰면 에러
        println(i)
    }
    println()

    //for안의 제어변수는 지역변수이기에 위에 사용했던 변수명을 사용해도 문제없음
    for(a in 3   ..    10){ //..양옆의 공백은 상관없음
        println(a)
    }
    println()

    //마지막 숫자 전까지 .. 대신에 until
    for(i in 0 until 10){
        println(i)
    }
    println()

    //2씩 증가 ( step )
    for(i in 0..10 step 2){
        println(i)
    }
    println()

    //값의 감소 ( downTo )
    for(i in 10 downTo 0) println(i)
    println()

    //값의 2씩 감소 ( downTo + step )
    for(i in 10 downTo 0 step 2) println(i)
    println()


    //for에 대한 또다른 점은 배열을 먼저 배우고...

    //7. 배열 Array ///////////////////////////////////////////////////////////////////////////////////////
    var arr= arrayOf(10,20,30)
    println(arr[0])
    println(arr[1])
    println(arr[2])
    //println(arr[3]) //Exception발생

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

    //
    arr.forEach {
        println(it)
    }
    println()


    //arrayOf() 배열의 특이한 점.
    //배열 각 요소의 자료형을 다르게 하면 각 요소의 타입은 read only(상수) Any 타입이 됨. [kotlin 이 버전업 되면서 - 2021년 상반기에는 값변경이 되었음]
    var arr2= arrayOf(10, "Hello", true)

    //값을 가져오는 것은 문제 없음
    println(arr2[0])
    println(arr2[1])
    println(arr2[2])
    println()

    //각 요소의 값은 변경할 수 없음
    //arr2[0]= 20 //ERROR
    //arr2.set(1, "bbb") //ERROR

    // 또한 요소의 타입이 저장된 값의 자료형으로 되어 있지 않기에 곧바로 연산에 사용 못함
    //println( arr2[0] + 5 ) //ERROR
    println( arr2[0] as Int + 5) //요소를 as 연산자로 변환해서 사용해야 함.
    println( arr2[1] as String + "AAA")
    println()


    //그래서 보통 배열을 사용할때는 타입을 명시하여 같은 자료형만 저장함 [원래 배열의 특징]

    //Type을 지정하여 배열을 만들 수 있음.
    var arr3= arrayOf<Int>(10,20,30)

    //<Int> 제네릭 표기법이 보기 싫다면
    var arr4= intArrayOf(10,20,30)

    //배열 참조변수만 먼저 만들고 나중에 배열객체 대입하려면 변수만들때 자료형을 표시
    var arr5: IntArray
    arr5= intArrayOf(1,2,3)

    //## boolean부터 Double까지의 기초 자료형들만 xxxArrayOf()가 존재함.. StringArrayOf()는 없음

    //배열의 요소값의 시작을 null값을 가진 배열 만들기 [길이:5]
    var arr6= arrayOfNulls<Double>(5)
    for(t in arr6){
        println(t)
    }
    println()

    //타입에 명시적으로 Any타입 사용 가능  - 저 위에 타입명시 없이 만들때와 다름
    val arr7= arrayOf<Any>(10,"hong",true)
    for(t in arr7){
        println(t)
    }
    println()

    //명시적으로 <Any>타입을 사용하면 값 변경도 가능하고 원래 자료형과 달라도 됨.
    arr7[0]= 100
    println(arr7[0])

    //원래 arr7[1] 요소의 값을 "hong"이라는 String값이 었으나 타입이 Any 이기에 Double값도 저장 가능
    arr7[1]= 3.14
    println(arr7[1])
    println()

    //요소값 변경은 되지만..
    //arr7 참조변수를 val 상수로 만들어서 다른 배열객체로 변경하는 것은 불가
    //arr7=  arrayOfNulls<Any>(5)  //ERROR


    //arrayOf()는 배열의 개수는 변경할 수 없음
    //배열 개수의 추가/제거 가 가능한 배열 : Java의 ArrayList 같은 배열
    //ArrayList로 만들기
    val arrList= arrayListOf<Any>(10, "Hello", true);
    for( e in arrList){
        println(e)
    }
    println()

    //요소 추가 및 삭제
    arrList.add(3.14) //소수점 추가 불가 [ 원래 있던 자료형이 아닌 것이 추가되면 에러였으나 이제 가능함]
    arrList.add(3)
    for( e in arrList){
        println(e)
    }
    println()

    //특정 위치에 추가하기
    arrList.add(0, "Nice")
    for( e in arrList){
        println(e)
    }
    println()

    //인덱스번호로 지우기
    arrList.removeAt(0)
    for( e in arrList){
        println(e)
    }
    println()

    //요소값으로 지우기
    arrList.remove(3.14)
    for( e in arrList){
        println(e)
    }
    println()


    //요소개수나 set(), get()은 동일하게 존재함
    println("요소개수 : ${arrList.size}")
    arrList.set(0,20)
    println("0번요소의 값 :  ${ arrList.get(0) }") //변수명이 아니라 함수를 호출하는 것도 가능함
    println()


    //2차원 배열!!!!
    val arrays= arrayOf( arrayOf(10,20,30),  arrayOf("aa", "bb"), arrayOf(true, false))
    for( ar in arrays){
        for( e in ar){
            print(e)
            print("   ")
        }
        println()
    }
    println()


    //Java의 Collection 인 List,Set,Map에 대응되는 mutableXXXOf()를 더 많이 사용함
    val mutableList= mutableListOf<String?>()
    mutableList.add("aa")
    mutableList.add("bb")
    mutableList.add(null)
    mutableList.add("aa") //같은 값이 저장되어도 OK
    for( s in mutableList ) println(s)
    println()

    val mutableSet= mutableSetOf<String?>()
    mutableSet.add("aaa")
    mutableSet.add("bbb")
    mutableSet.add("aaa") //같은 값이 저장되면 저장 안됨
    for( s in mutableSet ) println(s)
    println()

    val mutableMap= mutableMapOf<String, Any>()  // <key, value>
    mutableMap.put("name", "sam")
    mutableMap.put("age", 20)
    mutableMap.put("address", "seoul")
    for( s in mutableMap ) {
        println( s ) // s:  key=value 형태의 문자열
    }
    println()

    //key, value를 분리해서 받고 싶다면
    for( (key, value) in mutableMap ) {
        println( "$key : $value" )
    }
    println()

    //8. 함수 /////////////////////////////////////////////////////////////////////////////////////////////////
    //8.1 함수호출
    show()

    //8.2 파라미터 전달
    output(100, "Hello")

    //8.3 리턴을 하는 함수 호출
    var sum= sum(50, 30)
    println("sum함수의 결과값 : $sum ")
    println()

    //참고** 리턴이 없는 함수의 리턴을 받으면?? void가 아니라 Unit이라는 자료형이 됨.
    var x= display()
    println(x)
    println()

    //함수 선언의 특이한 점. ######
    //8.4 함수선언의 단순화 : 리턴 키워드를 할당 연산자[ = ]로 바꿀 수 있음.
    val data= getData()
    println(data)

    val data2= getData2()
    println(data2)

    val data3= getData3(5)
    println(data3)

    val data4= getData4(15)
    println(data4)
    println()

    //8.5 익명함수 [ 지금 이 수업을 소개하면 문법이 너무 어렵게 느껴질 소지가 있기에 이해한다기 보다 이런문법이 있다는 정도로 수업하거나 아예 제외 - 추후 리스너 적용할 때 검토] ###
    aaa()   //일반함수 호출
    bbb()   //익명함수를 참조하는 변수명을 이용하여 함수 호출
    ccc()   //명시적으로 익명함수의 자료형[()->리턴타입]이 지정된 참조변수. 의 이름을 통해 익명함수 호출
    ddd()   //fun()키워드 생략한 익명함수 호출 [ {} 까지는 생략불가 ]
    eee()   //익명함수를 가진 변수의 자료형을 명시하지 않고 추론하도록..하고 사용

    fff("Hello") //파라미터를 전달받는 익명함수 호출 - 문자열을 전달받아 그 글자의 글자수를 출력해주는 함수 [리턴값은 없는 함수 ]
    ggg("Nice")  //익명함수의 자료형을 명시한 참조변수를 이용한 호출
    hhh("God")   //fun()키워드 생략한 익명함수 호출 [ { } 안에서 파라미터 작성하는 코드 필요 ]
    iii("He")    //파라미터가 1개라면 { }안에서 생략가능 - 단, 만약 그 파라미터를 사용하고자 한다면 익명함수의 특별한 키워드 "it" 사용
    jjj("sam", 20)  //파라미터 여러개인 익명함수 호출 [ "it"키워드 불가 ]

    val number= kkk()  // 리턴타입이 있는 익명함수 호출  [ number의 타입은 자동추론 ]
    val number2:Int= kkk()  // 리턴타입이 있는 익명함수 호출 [명시적으로 자료형 지정 ]
    val number3:Int= lll()  // 익명함수의 자료형을 명시한 참조변수를 이용한 호출
    val number4:Int= mmm()  // fun()키워드를 생략한 익명함수 호출 - [ return 키워드도 삭제해야 함 ]
    val number5:Int= nnn()  // fun()키워드를 생략한 익명함수의 {}안에 실행문이 여러줄인 함수 호출 [ 가장 마지막 실행문이 리턴값 ]
    println(number5)

    val add= ooo(5,3)   //파라미터와 리턴타입이 모두 있는 익명함수 호출 [두수를 전달받아 덧셈결과를 리턴하는 함수]
    println(add)
    val add2= ppp(4,6)  //fun()키워드 생략한 파라미터와 리턴타입이 같이 있는 익명함수 호출
    println(add2)

    //파라미터와 리턴타입이 다른 익명함수 사용의 마지막 연습
    val len= stringLength("android")
    println(len)

    //익명함수로 만든 함수 호출
    val len2= stringLength2("kotlin")
    println(len2)

    //축약표현 익명함수 호출
    println( stringLength3("nice") )
    println( stringLength4("web") )
    println()

    //익명함수는 '고차함수'로 이용할 때 많이 사용함.

    //8.6 고차 함수
    //함수는 다른 함수를 인수로 취할 수 있습니다. 다른 함수를 인수로 사용하는 함수를 고차 함수라고 합니다. 이 패턴은 자바에서 콜백 인터페이스를 사용할 때와 동일한 방식으로 구성요소 간에 통신하는 데 유용합니다.
    val len3= getLength("android", stringLength3 ) //위에서 만든 익명함수를 2번째 파라미터에 전달
    println(len3)

    //2번째 파라미터에 그 자리에서 익명함수[String받아 Int를 리턴해주는]를 설계하여 전달
    val len4= getLength("kotlin", { str -> str.length })
    println(len4)

    val len5= getLength("450", { str ->  str.toInt() }) //이런식으로 원래 의도와 다른 함수를 전달하여 기능이 바뀌게 할 수도 있음.
    println(len5 + 3)

    //이 고차함수가 가장 많이 사용되는 곳 : 안드로이드의 클릭리스너 작업에 많이 사용
    //#############################################################################################################################


    //#################################################################
    // TestOOP.kt 파일만들고 클래스와 객체에 대한 수업 소개
    //#################################################################
}

//8.1 함수의 정의
//함수를 정의할 때 리턴타입의 위치에 fun 키워드를 사용
fun show(){
    println("show function")
    println()
}

//8.2 파라미터를 받는 함수 ( 파리미터명 : 자료형 )
fun output(a:Int, b:String){
    println(a)
    println(b)
    println()
}

//8.3 리턴하는 함수 [ 리턴타입을 함수()뒤에 : 후에 작성 ]
fun sum(a:Int, b:Int) : Int{
    return a+b
}


//참고.** 로 리턴타입이 없으면 void가 아니라 Unit 타입이라는 것임
fun display(){
    println("display");
}


//8.4 함수선언의 단순화 : 리턴 키워드를 할당 연산자[ = ]로 바꿀 수 있음.
//8.4.1 기본적인 return을 가진 함수
fun getData(): String{
    return "Hello"
}

//8.4.2  return 값을 할당연산자로 바꾸어 함수 선언
fun getData2():String = "Hello"


//8.4.3 좀더 복잡한 함수코드가 있어도 할당연산자 사용 가능
fun getData3(num:Int): String{
    if( num < 10 ) return "Good"
    else return "Bad"
}

fun getData4(num:Int): String = if(num<10){
    "Good"
} else {
    "Bad"
}


//8.5 익명함수  [ 지금 이 수업을 소개하면 문법이 너무 어렵게 느껴질 소지가 있기에 익명함수 수업은 제외 - 추후 리스너 적용할 때 검토] ###
//8.5.1 기본적인 함수
fun aaa(){
    println("aaa")
}

//8.5.2 익명함수 - 함수의 이름이 없는 함수 [ 당연히 그냥 이름만 지우면 에러 - why? 함수의 기능은 있지만 호출할 이름이 없으니까.
//fun (){}  //ERROR
//그래서 익명함수는 반드시 어떤 변수에서 참조되고 있어야 함 - 이렇게 함수를 가진 변수명을 이용하여 함수를 호출함 [ bbb() ] ,즉, 변수명이 함수명임
val bbb= fun(){
    println("bbb")
}

//8.5.3 익명함수를 가진 변수의 자료형은???? - 모든 변수는 자료형을 가짐[명시적이든 자동추론이 되든] , 그럼 함수를 가진 변수의 자료형은?
//[ 익명함수의 자료형 : () -> 리턴타입 ]  ** 리턴타입이 없으면 Unit [자바의 void역할]
val ccc:()->Unit = fun(){
    println("ccc")
}

//8.5.4 익명함수를 좀 축약형으로 쓰고 싶다면? 즉, fun() 키워드가 굳이 없어도 익명함수임을 구별할 수 있을 듯 하여..
val ddd:()->Unit = {
    println("ddd")
}

//{} 까지 생략하는 축약형은 불가.. 함수의 기능 코드 작성임을 인식하기도 해야하고. {}까지 없애면 실행문이 함수일때 리턴값을 대입하라는 글씨로 오인될 수 있음. 즉, 익명함수 {}는 생략불가
//val ddd2:()->Unit = println("ddd2") //ERROR

//8.5.5 변수의 자료형은 자동 추론이 되니까 익명함수를 참조하는 변수의 자료형은 생략가능
val eee= {
    println("eee")
}

//## 파라미터 ###########################

//5.8.6 파라미터를 전달받는 익명함수 - 문자열을 전달받아 그 글자의 글자수를 출력해주는 함수 [리턴값은 없는 함수 ]
val fff= fun(s:String){
    println("글자수:" + s.length)
}

//5.8.6 이 익명함수를 가진 참조변수도 명시적으로 자료형을 명시할 수 있음. [ 파라미터:String 1개, 리턴타입 : Unit ]
val ggg:(String)->Unit = fun(s:String){
    println("글자수:" + s.length)
}

//5.8.7 파라미터를 전달받는 함수도 fun()키워드를 생략할 수 있음. 단, { }안에 익명함수의 자료형[()->리턴타입] 같은 형식으로 코딩 필요
val hhh:(String)->Unit = {
    s -> println("글자수:" + s.length)  // "s->" 의 s가 이 익명함수의 파라미터 변수이름
}

//5.8.8 혹시 파라미터가 1개뿐이라면 "s->" 생략해도 됨.
val iii:(String)->Unit = {
    println("iii")
    //단, 만약 그 파라미터를 사용하려면.. 익명함수의 특별한 변수 "it" 키워드 사용 [ it변수의 자료형은 참조변수에 명시한 익명함수 자료형(String) 으로 자동 선언됨
    println("글자수:" + it.length)
}

// ** 단, 익명함수 참조변수의 명시적 타입지정을 안하면 자동으로 파라미터가 없는 ()->Unit 으로 추론되기에 "it" 키워드 불가..
//val iii2= {
//    println("글자수:"+it.lenght) //ERROR
//}

// *** {} 안에서 파라미터를 생략하지 않았더라도 익명함수의 참조변수 자료형을 자동 추론되게 할 수 없음. 즉, 파라미터가 있을때는 익명함수의 자료형을 참보변수에 명시해야함.
//val iii3= {
//        s -> println("글자수:" + s.length)  // ERROR
//}

//5.8.9 파라미터 여러개도 당연히 가능 [ 파라미터가 여러개일때는 "it" 키워드는 사용 불가 ]
val jjj:(String, Int) -> Unit = {
    name, age -> println("name: $name    age: $age")
}


//## 리턴타입 ###########################

//5.8.10 리턴타입이 있는 익명함수 [파라미터 없고 리턴타입이 Int인 익명함수]
val kkk= fun():Int{
    return 10
}

//5.8.11 리턴타입이 있는 익명함수를 참조하는 변수의 자료형 명시적으로 지정
val lll: ()->Int = fun():Int{
    return 20
}

//5.8.11 리턴타입이 있는 익명함수의 fun()키워드 생략하는 축약형 - [ return 키워드를 제거해야 함]
val mmm: ()->Int = {
    20
}

//5.8.12 만약 {}안에 실행문이 여러개 라면? - 마지막 실행문의 값이 return 값
val nnn: ()->Int = {
    30
    println("중간 글씨") //{}영역은 실행문 작성 영역이므로 당연히 중간에 이렇게 리턴값이 아닌 실행문이 있어도 됨. 단, 이 println()이 마지막 실행문이면 에러. [리턴타입이 안 맞아서]
    40
    50 //이 값이 리턴값
    //println("중간 글씨") //ERROR
}

//5.8.12 파라미터와 리턴타입이 같이 있는 익명함수 [두 수를 전달받아 덧셈결과를 리턴하는 함수 ]
val ooo:(Int, Int) -> Int = fun(a:Int, b:Int):Int{
    return a+b
}

//5.8.12 fun()키워드 생략한 파라미터와 리턴타입이 같이 있는 익명함수 [두 수를 전달받아 덧셈결과를 리턴하는 함수 ] : {}안에 익명함수 타입(Int,Int)->Int 형태로 코딩 , return 키워드 역시 생략
val ppp:(Int, Int) -> Int = {
    a, b -> a+b
}

//### 파리미터와 리턴타입의 자료형이 다른 마지막 익명함수 연습 ####

//5.8.13.1) 기본적인 함수 [ String 입력을 받아 글자수를  Int 로 리턴해 주는 기능 함수]
fun stringLength(str:String): Int{
    return str.length
}

//8.8.13.2) 익명함수 [함수를 stringLength2라는 변수에 넣는 것 (String) -> Int 는 String를 매개변수로 받아  Int를 리턴해 준다는 표기법 ]
val stringLength2: (String) -> Int = fun(str:String):Int{
    return str.length
}

//8.8.13.3) 익명함수 축약형 [ fun() , return 키워드 생략 ]
val stringLength3: (String) -> Int = {
    str -> str.length
}

//8.8.13.4) 파라미터 생략 익명함수 축약형 [ fun() , return 키워드 및 파라미터 생략 ]
val stringLength4: (String) -> Int = {
    it.length
}


//익명함수는 '고차함수'로 이용할 때 많이 사용함.

//8.6 고차 함수
//함수는 다른 함수를 인수로 취할 수 있습니다. 다른 함수를 인수로 사용하는 함수를 고차 함수라고 합니다. 이 패턴은 자바에서 콜백 인터페이스를 사용할 때와 동일한 방식으로 구성요소 간에 통신하는 데 유용합니다.
//두번째 파라미터에 함수를 완전히 설계하기 전인 상태까지만 함수 지정 [ String을 전달받아 Int를 리턴한다는 정보만 가진 함수 지정 ] 하고 실제 이 메소드[getLength3]를 사용할때 aaa 파라미터에 (String)파라미터와  Int를 리턴하는 함수를 전달

//'고차함수' : 함수의 파라미터로 다른 함수를 사용하는 것을 고차함수라고 부름
// 두번째 파라미터 aaa는 익명함수를 인자로 받겠다고 표시
fun getLength(str:String, aaa: (String)->Int ): Int{
    return aaa(str)
}

