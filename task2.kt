fun main(){


    fun findOasis(x: Int, y: Int): String {
        return "Oasis found at coordinates ($x, $y)"
    }

   var res = findOasis(10, 20)
    println(res)

    //Task 3


    fun currentTemperature(morningTemperature:Int,afternoonTemperature:Int):Int{
        var Average: Int = morningTemperature + afternoonTemperature / 2
return Average


    }

   var ave = currentTemperature(25, 40)
    println(ave)

// Task 4

    fun startCamelRide(time: Int,speed: Int): Int{
var distance = time * speed
        return distance
    }


    var dis = startCamelRide(5,5)
    println(dis)

    fun exploreDune (height: Int,climbRate: Int):Int{
var time : Int = height/ climbRate
        return time
    }
var time = exploreDune(500,100)
println("Time to Climb the Dune: $time hours")



    // task 6
    fun survivalChance(supplies: Int , survivalRate: Int):Int{
        var res = supplies * survivalRate
        return  res

    }


    var chance = survivalChance(8,4)
println("Survival Chance: $chance")
}




