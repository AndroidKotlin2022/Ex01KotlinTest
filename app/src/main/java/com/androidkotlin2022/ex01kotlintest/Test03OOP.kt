package com.androidkotlin2022.ex01kotlintest

//무조건 main함수는 존재해야 함.
fun main() {
    println("Hello Kotlin OOP\n")

    //1. 클래스 선언 및 생성 - main()함수 밑에 선언
    //객체 생성 [매우 특이함!!! new키워드가 존재하지 않음 ]
    var obj= MyClass()
    obj.show()

    //1-1. 별도의 파일로 class만들기 [당연히 확장자는 .kt]
    var obj2= MyKotlinClass()
    obj2.show()


    //2. 생성자 [많이 당황스러울 수 있음]
    //코틀린의 생성자는 2가지 종류가 있음. [ 주생성자, 보조생성자 ] - 저 밑에 Simple클래스 하나 선언하고 기본 주 생성자 사용해보기
    //2.1 주 생성자 [Primary Constructor]
    var s= Simple()

    //2.2 주 생성자에 파라미터 전달 [ 기본적으로 주 생성자는 오버로딩이 없음 ]
    var s2= Simple2(1000, 20) //먼저 num만 전달하는 것부터 실습
    s2.show()

    //2.3 보조 생성자 [Secondary Constructor] : 생성자 오버로딩의 역할의 위해!!
    var s3= Simple3()
    //생성자 오버로딩
    var s4= Simple3(100)

    //2.4 주 생성자와 보조 생성자를 동시에 사용할 때.. [즉, 주 생성자를 오버로딩하고 싶다면...]
    var s5= Simple4()
    var s6= Simple4(1000)

    //## 참고. constructor키워드 생략가능
    var s7= Simple5()

    // ###########################################################
    // 객체지향의 주요 기능중 하나인 상속 알아보기 : TestOOP.kt
    // ###########################################################

}

//1. 클래스 선언 - 자바나 C++과 기본 모습은 비슷함. 단, 멤버변수(Field)를 Property(프로퍼티) 라고 부름
class MyClass{
    //멤버변수[ Property:프로퍼티] -반드시 초기화 해야함
    var a:Int= 10

    //메소드 : Method
    fun show(){
        println(" show : $a ")
        println()
    }
}

//2. 생성자 테스트
//2.1 주 생성자 [클래스명 옆에 constructor()키워드로 정의
class Simple constructor(){
    //근데 생성자가 별도의 메소드가 아니어서.. 코드를 작성할 수 없음.
    //그래서 존재하는 초기화 블럭 키워드
    init {
        //주 생성자가 호출될 때 실행되는 영역
        println("Simple primary constructor!!")
        println()
    }
}

//2.2 주 생성자에 값 전달
//아주 특이하게 주 생성자의 파라미터를 만들 때 var, val을 사용하면 곧바로 프로퍼티, 즉, 멤버변수가 됨 [ 우선, 이것만 먼저 실습 ]
//참고!! var을 안써도 에러는 아니지만 그때의 파리미터는 단순 매개변수임. 즉, 멤버변수(property)가 아님
class Simple2 constructor(var num:Int, num2:Int){

    init {
        println("Simple2 primary constructor!! : $num ")
        println("Simple2 primary constructor!! : $num2 ") //초기화 블럭에서는 num2매개변수 인식가능
    }

    fun show(){
        println("프로퍼티 num : $num ")
        //println("프로퍼티 num : $num2 ") //일반 메소드에서는 num2인식 불가
        println()
    }

    //프로퍼티에 주 생성자의 매개변수를 대입하여 사용하는 것은 가능함
    var n:Int= num2;
}



//2.3 보조 생성자 - 자바처럼 class안에 메소드처럼 존재하는 생성자
class Simple3{
    //초기화 블럭 [물론 없어도 됨]
    init {
        println("이 영역은 항상 객체생성시에 초기화를 위해 처음으로 실행됨")
    }

    //보조 생성자
    constructor(){
        println("Simple3 Secondary 생성자")
        println()
    }

    //보조 생성자는 Overloading 이 됨 [보조생성자의 파라미터에는 var로 곧바로 property를 만들 수 없음
    constructor(num: Int){
        println("Simple3 Overloading Secondary 생성자 : $num ")
        println()
    }

}


//2.4 주 생성자와 보조 생성자를 동시에 사용할 때..[즉, 주 생성자를 오버로딩하고 싶다면...]
class Simple4 constructor(){
    init {
        println("Simple4 init")
    }

    //2.2 보조 생성자 - 주 생성자가 명시적으로 표기되어 있다면 반드시 주 생성자를 보조생성자에서 호출해야만 함. (Overloading)
    // [보조생성자 뒤에 : this()]
    constructor(num:Int) : this(){
        println("Simple4 secondary constructor!!!!!!!")
        println()
    }
}


//## 참고로 주 생성자의 constructor키워드는 접근제한자나 어노테이션이 없다면 생략 가능함. ##
class Simple5 (){
    init {
        //주 생성자가 호출될 때 실행되는 영역
        println("Simple5 primary constructor!!")
        println()
    }
}