
object Main extends App {
  val r = requests.get("https://data.austintexas.gov/resource/dx9v-zd7x.json?$limit=5") //data is in json format
  println(r.statusCode) // ensure api succesful
  println("--")
  //println(r.headers)
  //println("--")
  val data = ujson.read(r.text) // use ujson to read in returned data as actual json object
  println(data(0))
  //println(r.text)


}

