class getData(apiURL:String) {


  def executeRequet()={

    val r = requests.get(apiURL)
    if (r.statusCode == 200)
      println("Request Successful")
    else
      println("Request Failed: Please try again")
  }

}

object Main{
  def main(args: Array[String]) = {
    println("Input URL for request")
    var obj = new getData(scala.io.StdIn.readLine()) // read in user input as string

    obj.executeRequet()
  }
}











