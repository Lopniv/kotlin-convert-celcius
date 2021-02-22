import kotlin.system.exitProcess

var celcius: Int? = null

private fun main(){
    runConvertCelcius()
}

private fun runConvertCelcius(){
    print("""
                    Welcome
            Program Convert Celcius to 
          Fahrenheit, Kelvin, and Reamur
        ==================================
        
    """.trimIndent())
    menu()
}

private fun menu(){
    print("""
        Please choose what type that you want as a result
        1. Fahrenheit
        2. Kelvin
        3. Reamur
        4. Exit
        Choose type (1/2/3/4): 
    """.trimIndent())
    when(readLine()){
        "1" -> {
            inputCelcius()
            fahrenheit(celcius ?: 0)
        }
        "2" -> {
            inputCelcius()
            kelvin(celcius ?: 0)
        }
        "3" -> {
            inputCelcius()
            reamur(celcius ?: 0)
        }
        "4" -> exitProcess(0)
        else -> {
            print("Error code!\n")
            menu()
        }
    }
}

private fun inputCelcius(){
    print("""
        
        Input value of Celcius: 
    """.trimIndent())
    try {
        celcius = readLine()?.toInt() ?: 0
    } catch (e: Throwable) {
        println("Please input number type only")
        inputCelcius()
    }
}

private fun fahrenheit(celcius: Int){
    val fahrenheit = (celcius*4) + 32
    println("""
        $celcius Celcius = $fahrenheit Fahrenheit
        ================================
    """.trimIndent())
    menu()
}

private fun kelvin(celcius: Int){
    val kelvin = celcius+273
    println("""
        $celcius Celcius = $kelvin Kelvin
        ================================
    """.trimIndent())
    menu()
}

private fun reamur(celcius: Int){
    val reamur = celcius*4/5
    println("""
        $celcius Celcius = $reamur Reamur
        ================================
    """.trimIndent())
    menu()
}