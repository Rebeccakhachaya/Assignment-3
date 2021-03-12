fun main(){
    details("AkiraChix")
    var name=personal("becky", 30)
    println(name)
    var church=trial("christian")
    println(church)
    name("kisumu")

}
fun details(school:String){
    print(school[0])
    print(school[2])
    println(school[3])
}
fun personal(name:String, age:Int):String{
    return "hi my name is $name and am $age year old"
}
fun trial(religion:String):Int{
    return religion.length
}
fun name(home:String){
    if(home=="kisumu"){
        println("thats me")
    }
    else{
        println("i do not know who that is")
    }
}