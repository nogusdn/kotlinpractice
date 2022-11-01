package com.example.firstpractice

fun main(){
    ignoreNulls()
}

//4. 조건식
fun maxBy(a: Int, b:Int) : Int {
    if(a > b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a :Int, b:Int) = if (a>b) a else b

fun checkNum(score:Int) {
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
    }
    var b = when(score){
        1-> 1
        2-> 2
        else -> 3
    }

    println("b: $b")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement
// 값을 반환 Return , 명령을 지시

//5. Array and List

//Array : 크기가 정해져있음 (메모리가 할당되어있다)

//List 1.List 2. MutableList

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",2, 3.4f)
    val list2 = listOf(1,"d",2, 11L)

    array[0] = 3
    var result = array.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
}


// 6. For / while

fun forAndWhile() {
    val students = arrayListOf("joyce","james","jenny","jisu","rose")
    for(name in students){
        println(name)
    }
    var sum: Int = 0
    for(i in 1..10 step 2){
        sum += i
    }
    println(sum)
    for(i in 10 downTo 1 ){
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10){

        println("currentIdx = $index")
        index++
    }

    for ((index, name) in students.withIndex()){
        println("${index+1}번째 학생 : $name")
    }

}

//7. nullable / nonnull

fun nullcheck(){
    //NPE: NULL pointer Exception

    var name = "jenny"

    var nullName: String? = null

    // 물음표 붙이면 nullable 타입이 된다.

    var nameInUpperCase = name.uppercase()

    var nullNameInUpperCase: String? = nullName?.uppercase()

    // ?:
    // null이면 이거 출력해~

    val lastName: String? = "noh"
    val fullName = name+" "+(lastName?: "No lastName")
    println(fullName)

    // !!

}

fun ignoreNulls(){
//    val mNotNull : String = str!!
//    val upper = mNotNull.uppercase()

    val email : String? = null
    email?.let{
        println("my email is ${email}")
    }
    val testCheck = email?: "hello"
    println(testCheck)

    // 이메일이 null이 아니면 이거를 해라
}