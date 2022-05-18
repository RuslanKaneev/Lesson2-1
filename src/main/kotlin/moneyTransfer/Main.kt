package moneyTransfer

fun main() {
    val commissionPercent: Double = 0.0075
    val commissionMinimum = 35 * 100
    var amount = 4666_00
    var commissionSum =
        if (commissionMinimum >= commissionPercent * amount) commissionMinimum else amount * commissionPercent
    println(commissionSum)
    amount = 5000_00
    commissionSum =
        if (commissionMinimum >= commissionPercent * amount) commissionMinimum else amount * commissionPercent
    println(commissionSum)
}