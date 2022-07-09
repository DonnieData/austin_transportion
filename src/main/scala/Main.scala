
class getData(inputURL:String) {      //input will be url or "q" to quit

  //method for api get request
  def executeRequest()={

    val r = requests.get(inputURL)
    if (r.statusCode == 200)
      println("Request Successful")
    else if (inputURL == "q")
      System.out.println("Exiting Program")
    else
      println("Request Failed: Please try again")
  }

}

object Main{
  def main(args: Array[String]) = {

    var appControl = "run"
    while ( appControl == "run") {

      println("Input URL for request")
      var obj = new getData(scala.io.StdIn.readLine()) // read in user input as string
      obj.executeRequest()

    }
  }
}











