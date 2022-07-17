//package object appapi extends App {
package apiapp


//class appAPI() {
//class for api get request
class getInput(userInput: String) { //input will be url or "q" to quit
  var inputString = userInput
  var requestStatus = false

  if (userInput == "q") (println("-----------\nExiting Application\n----------- "), System.exit(1))
  if (userInput == "i") {
    println("""-----info-----\nThis application is meant to help streamline ad-hoc API GET Requests." +
      "\nMore inforamtion at: https://github.com/DonnieData/scala-api-app  \n----""")
  }
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
    println("""
               ___                 _       ___         _
              | . \ ___  _ _  _ _ [_] ___ | . \ ___  _| |_  ___
              | | |/ . \| ' || ' || |/ ._]| | |[_] |  | |  [_] |
              |___/\___/|_|_||_|_||_|\___.|___/[___|  |_|  [___|
              SCALA API APPLICATION
    """)
    Thread.sleep(3000)

    println("""
      Welcome!!
      -------------""")

    var appControl = "run"
    while (appControl == "run") {

      println("""

       Input URL endopint for request

        _____________
        "i" for more info
        "q" to exit


          """.stripMargin)

      var obj = new getInput(scala.io.StdIn.readLine()) // read in user input as string
      println(" ")
      obj.executeRequest()
      println(" ")



    }
  }

}
//  }
//}


