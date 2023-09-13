import kotlinx.browser.document
import org.w3c.dom.HTMLInputElement
import react.FC
import react.Props
import react.dom.html.ReactHTML.body
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.input

external interface WelcomeProps : Props {
    var name: String
}

val Welcome = FC<WelcomeProps> { _ ->
    body {
        div {
            input {
                id = "celsiusInput"
            }
        }
        input {
            id = "fahrenheitInput"
        }
        div {
            button {
                +"C to F"
                onClick = {
                    onClickCelsiusButton()
                }
            }
            button {
                +"F to C"
                onClick = {
                    onClickFahrenheitButton()
                }
            }
        }
    }
}

fun onClickCelsiusButton() {
    val celsiusInput: HTMLInputElement = document.getElementById("celsiusInput") as HTMLInputElement
    val fahrenheitInput: HTMLInputElement = document.getElementById("fahrenheitInput") as HTMLInputElement
    fahrenheitInput.value = celsiusInput.value.toFahrenheit().toString()
}

fun onClickFahrenheitButton() {
    val celsiusInput: HTMLInputElement = document.getElementById("celsiusInput") as HTMLInputElement
    val fahrenheitInput: HTMLInputElement = document.getElementById("fahrenheitInput") as HTMLInputElement
    celsiusInput.value = fahrenheitInput.value.toCelsius().toString()
}