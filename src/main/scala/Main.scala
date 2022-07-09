
class getInput(userInput:String) {      //input will be url or "q" to quit


  if (userInput == "q") System.out.println("Exiting Application")
  val r = requests.get(userInput)

  //method for api get request
  def executeRequest()={
    if (r.statusCode == 200)
      println("Request Successful")
      else
      println("Request Failed: Please try again")
  }

  def out(): Unit ={
    var data = ujson.read(r.text)
    println(r.headers)
    println(" ")
    println(data(0))
  }

}

object Main{
  def main(args: Array[String]) = {

    var appControl = "run"
    while ( appControl == "run") {

      println("Input URL for request")
      var obj = new getInput(scala.io.StdIn.readLine()) // read in user input as string
      println(" ")
      obj.executeRequest()
      println(" ")
      obj.out()
    }
  }
}











