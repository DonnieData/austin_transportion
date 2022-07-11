//class for api get request
class getInput(userInput:String) {      //input will be url or "q" to quit
  var requestStatus = false

  if (userInput == "q") System.exit(1)
  //if (userInput == "q") System.out.println("Exiting Application")

  //method for api get request
  def executeRequest()={
    val r = requests.get(userInput)
    if (r.statusCode == 200) {
      println("Request Successful")
      requestStatus = true
      println(requestStatus)
    } else {
      println("Request Failed: Please try again")
      requestStatus = false
    }
  }

  /*def out(): Unit ={
    var data = ujson.read(r.text)
    println(r.headers)
    println(" ")
    println(data(0))
  }*/
}

//main
object Main{
  def main(args: Array[String]) = {

    var appControl = "run"
    while ( appControl == "run") {

      println("""Input URL for request or "q" to exit """)
      var obj = new getInput(scala.io.StdIn.readLine()) // read in user input as string
      println(" ")
      obj.executeRequest()
      println(" ")
      /*if (obj.requestStatus == true) {
        obj.out()
      } else {
        println("There is an error with your request please try again")
      }*/
    }
  }
}











