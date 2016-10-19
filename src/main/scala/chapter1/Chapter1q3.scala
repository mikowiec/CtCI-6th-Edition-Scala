
object Chapter1q3 {

  def urlEncode(str: String): String = {
    //var buf = "".toSeq
    val urlSeq: Seq[Char] = str
    @annotation.tailrec
    def go(cur: Seq[Char], acc: Seq[Char]): Seq[Char] = {
      println(s"cur:${cur} acc:${acc}"); 
      cur match {
          case Nil                  => acc
          case head :: tail if (head == ' ') => go(tail, acc)
          case head :: tail                  => go(tail, acc :+ head)
          case x => error(x.toString)
      }
    }

    def ge(cur: Seq[Char], acc: Seq[Char]): Seq[Char] = {
      println(s"cur:${cur} acc:${acc}")
      cur.toList match {
          case Nil =>   { println("Nil"); acc }
          case head :: tail                  => { println(s"h:${head} t:${tail}"); go(tail, acc :+ head)}
          case _ => error(_.toString)
      }
    }
    val res = ge(urlSeq, Seq.empty[Char])
    res.toString
  }

/*
urlEncode :: String -> String
urlEncode [] = []
urlEncode (' ':xs) = "%20" ++ urlEncode xs
urlEncode (x:xs) = x : urlEncode xs
*/


  def main(args: Array[String]) {
    println(urlEncode("aabcdsta") )
  }

}


