import kotlin.math.roundToInt

const val celsiusFraction: Float = 1.8f
const val fahrenheitFraction: Float = 0.55f
const val calculatorValue: Float = 32f

fun String.toCelsius() = (celsiusFraction * this.toFloat() + calculatorValue).roundTo()
fun String.toFahrenheit() = fahrenheitFraction * (this.toFloat() - calculatorValue).roundTo()
fun Float.roundTo(): Double = this.times(100.0).roundToInt() / 100.0