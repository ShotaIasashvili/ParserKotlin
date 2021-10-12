package jsonresponse

import com.google.gson.Gson
import java.io.File
import java.net.URL

fun main (args: Array<String>) {
    val response = URL("https://run.mocky.io/v3/3588163c-a9c8-488c-af9a-534b392e7128").readText()
    var gson= Gson()

    val data = gson.fromJson(response, Array<Response>::class.java)
    for (x in 0 until data.size)
        // println(data[x].title)
    File("c:\\doc\\json\\title.txt").appendText("${data[x].title} \n")

}