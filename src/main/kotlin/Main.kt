fun main() {
    var wheelPrice = 40
    var suspensionPrice = 50
    var handlePrice = 30
    var framePrice = 45

    var totalPrice = 0
    var breakout = 0

    do{
        println("To add an item to your cart, enter the corresponding number")

        println("1) Wheels: $40")
        println("2) Suspension: $50")
        println("3) Handles: $30")
        println("4) Frames: $45")
        println("Done Shopping? Press 9")

        print("Please enter your items number: ")

        breakout = readLine()!!.toInt()
        if (breakout == 1){
            totalPrice += 40
        } else if (breakout == 2){
            totalPrice+= 50
        } else if (breakout == 3){
            totalPrice += 30
        } else if (breakout == 4){
            totalPrice += 45
        } else if ((breakout < 0 || breakout > 4) && breakout != 9){
            println("You have not entered a number that corresponds to any known part. Please try again")
        }

    } while (breakout != 9)

    println()
    print("Your total for today is: $totalPrice")

}