fun main(){
 val toyota = car("Toyota","prado","KCT 123B", 0)
    val subaru = car("subaru","forester","KDG 001G", 0)

    val jackline=Student("vyonne",20,"anita B")

    val cheruto=Student("sang",20,"anita B")
    println(jackline.name)
    println(jackline.age)
    println(cheruto.age)





    println(subaru.registration)
    subaru.start()
    println(toyota.speed)
    subaru.accelarate(30)
   // println(subaru.speed)
    subaru.accelarate(70)
   // println(subaru.speed)
    subaru.hoot()

    subaru.deccelarate(20)
    subaru.stop()



   //println(toyota.speed)
   // toyota.accelarate(accelaration = 30)
    //println(toyota.speed)

}
//A class has a Name
//Tha body of a class is denoted by a pair of curly braces

class car(var make:String,var model:String, var registration: String, var speed: Int,) {
    fun start() {
        println("Chogio gio gio")
    }

    fun accelarate(accelaration: Int): Int {
        speed += accelaration
        println("current speed is: $speed ")

        return speed

    }

    fun hoot() {
        println("peep peep")
    }

    fun deccelarate(deccelaration: Int): Int {
        speed -= deccelaration
        println("current speed is: $speed")
        return speed
    }

    fun stop() {
        speed = 0
        println("current speed is: $speed")

    }
}

data class  Student(var  name:String,var age:Int,var stream:String)



