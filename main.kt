fun main(){


    //Lambda 1

    var lamb = {a: Int, b: Int ->  a + b}
    println(lamb(2, 5))

    //Lambda 2
    val programtest = Program2()
    var lamb3 = {s: Int -> println(s)}
    programtest.addNums(2, 9, lamb3)

    //lambda3
    val numList = (0..20).toList()
    val programString = Program()
    var lamb2 ={number: String -> println(number)}
    programString.loop(numList, lamb2)

    //Lambda 4

    val test = {a: Int -> val multi = (a * 2)
       println(multi) }
    test(4)
    // val no parameters
    val askName = {
        print("Please, Enter your name:  ")
        val input = readLine()!!.toString()
        println("Hello! $input")
    }
    askName()
    //Lambda Players
    val playersData = arrayListOf<Player>(Player("Ahmad", 21, 179),
        Player("Hashem", 19, 183), Player("Abdul", 22, 170),
        Player("Logan", 25, 180), Player("Adam", 29, 185),
        Player("Jack", 23, 178), Player("Mark", 24, 183),
        Player("Morad", 20, 176), Player("Khalid", 22, 176))

    val lam4 = {a: ArrayList<Player> ->
        val list = a.sortedBy { it.age }
        var ages = 0
        var name =""
        var height =0

        for( i in list ){
            ages = i.age
            name = i.name
            height = i.height
            print("name = $name ,age =  $ages , Height= $height \n")
        }

        //val result = list.toString()

    }

    fun listSort(list: ArrayList<Player>, action: (ArrayList<Player>) -> Unit){
        action(list)
        //println(output)
    }

    listSort(playersData, lam4)




    }


class Program {

    fun loop(a: List<Int>, action: (String) -> Unit) {

        var result = ""

        for (i in a) {
            result += "$i - "
        }
        action(result)
    }
}

    class Program2{
        fun addNums(a: Int, b: Int, action: (Int) -> Unit){
            val sum = a+ b

            action(sum)
        }
    }


data class Player(
    val name: String,
    val age: Int,
    val height: Int,
)


