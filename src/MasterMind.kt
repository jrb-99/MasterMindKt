const val MAX_TRIES = 10 // in 5..20
const val SIZE_POSITIONS = 4 // in 2..6
const val SIZE_COLORS = 6 // in 2..10 and >= SIZE_POSITIONS
const val FIRST_COLOR = 'A' // ‘A’ or ‘a’ or ‘0’
val COLORS = FIRST_COLOR ..< FIRST_COLOR+SIZE_COLORS

fun main(){

    val secret: String = "CAFE"//generateSecret()

    println("Descubra o código em $MAX_TRIES tentativas.")
    println("$SIZE_POSITIONS posições e $SIZE_COLORS cores $COLORS")
    for (numTries in 1..MAX_TRIES) {
        val guess = readGuess(numTries)
        if (guess == secret) {
            println("Parabéns!\nAcertou à ${numTries}ª tentativa.")
            return
        }
        val corrects = getCorrects(guess, secret)
        val swapped = getSwapped(guess, secret)
        printTry(numTries, guess, corrects, swapped)
    }
    println("Não acertou em $MAX_TRIES tentativas. O segredo era: $secret")

}

fun generateSecret(): String{

    var secret = ""

    while(secret.length < SIZE_POSITIONS){

        var rand = COLORS.random()
        if(!secret.contains(rand)){
            secret += rand
        }

    }

    return secret
}

fun readGuess(numTries: Int): String{

    var guess: String = ""
    var lastChar = COLORS.last
    val regex = "^[$FIRST_COLOR-$lastChar]*$".toRegex()

    while(true){

        var tries = MAX_TRIES - numTries + 1

        println("Insira o seu palpite. Tem $tries tentativas.")
        guess = readln().uppercase()
        var arr = guess.toCharArray()

        if(guess.length < SIZE_POSITIONS || guess.length > SIZE_POSITIONS){
            println("O palpite deve conter exatamente $SIZE_POSITIONS caractéres")
            continue
        }

        if(!guess.contains(regex)){
            println("O seu paplite contém caractéres inválidos.")
            continue
        }

//        if(arr.distinct().lastIndex+1 != SIZE_POSITIONS){
//            println(arr.distinct().lastIndex)
//            println("O seu palpite nao deve conter caractéres repetidos")
//            continue
//        }

        break

    }

    return guess
}

fun getCorrects(guess: String, secret: String): Int{
    var corrects = 0
    for (i in 0..<guess.length){
        if(guess[i] == secret[i]){
            corrects++
        }
    }
    return corrects
}

fun getSwapped(guess: String, secret: String): Int{

    var swapped = 0
    var aux = arrayOf<Char>()
    for (i in 0..<guess.length){
        if (getCorrects(guess[i].toString(), secret[i].toString()) == 0 &&
            secret.contains(guess[i]) &&
            !aux.contains(guess[i])){
            aux += guess[i]
            swapped++
        }
    }
    return swapped
}

fun printTry(numTries: Int, guess: String, corrects: Int, swapped: Int){

    println("Voce tem $numTries tentativas. O seu palpite foi $guess. Acertou em $corrects caractéres. $swapped deles estao trocados")

}
