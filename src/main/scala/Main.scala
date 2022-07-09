
class getData(inputURL:String) {      //input will be url or "q" to quit

  val r = requests.get(inputURL)

  //method for api get request
  def executeRequest()={

    if (r.statusCode == 200) {
      println("Request Successful")
    } else if (inputURL == "q") {
      println("Exiting Application")
      System.exit(0)
    } else {
      println("Request Failed: Please try again")
    }
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
      var obj = new getData(scala.io.StdIn.readLine()) // read in user input as string
      println(" ")
      obj.executeRequest()
      println(" ")
      obj.out()
    }
  }
}











