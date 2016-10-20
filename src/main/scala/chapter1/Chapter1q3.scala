
object Chapter1q3 {

  def urlEncode(url: String): String = {
    @annotation.tailrec
    def go(cur: String, acc: String): String = cur match {
       case ""|null => acc
       case _ if(cur.head == ' ') => go(cur.tail, acc :+ '%' :+ '2' :+ '0') 
       case _ => go(cur.tail, acc :+ cur.head)
    }
    go(url, "")
  }


  def main(args: Array[String]) {
    var res: String = urlEncode("aab cds ta")
    println( urlEncode("aab cds ta") == "aab%20cds%20ta")
  }

}


