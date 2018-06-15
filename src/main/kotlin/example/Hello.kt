package example

fun main(args: Array<String>) {
    window.alert("Hello, Kotlin")
}

@JsName("window")
external object window {
    fun alert(message: String)
}

