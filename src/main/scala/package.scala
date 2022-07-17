//package object appapi extends App {
package apiapp


//class appAPI() {
//class for api get request
class getInput(userInput: String) { //input will be url or "q" to quit
  var inputString = userInput
  var requestStatus = false

  if (userInput == "q") (println("-----------\nExiting Application\n----------- "), System.exit(1))

 //error and exception handling for invalid user input/ failed requests that can force the script to terminate


  //method for api get request
  def executeRequest(): Unit = {
    try {
      var r = requests.get(inputString)
      if (r.statusCode == 200) {
        println("Request Successful")
        requestStatus = true
      } else {
        println("Request Failed: Please try again")
        requestStatus = false
      }
    }
    catch {case _: Throwable => println("Request Failed: Please try again")}

  }
  /*def out(): Unit ={
var data = ujson.read(r.text)
println(r.headers)
println(" ")
println(data(0))
}*/

}


//main
object RunApp {
  def main(args: Array[String]) = {
    var appControl = "run"
    while (appControl == "run") {

      println("""Input URL for request or "q" to exit """)
      var obj = new getInput(scala.io.StdIn.readLine()) // read in user input as string
      println(" ")
      obj.executeRequest()
      println(" ")



    }
  }

}
//  }
//}






