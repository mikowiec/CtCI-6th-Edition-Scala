
object Chapter1q4 {

  def palindromePermutation(str: String):Boolean = {
    val cleanString = str.toLowerCase.replaceAll("[ ,.]", "")
    @annotation.tailrec
    def odd(cur:String, acc:String): String = cur match {
       case ""|null => acc
       case _ if(acc contains cur.head) => odd(cur.tail, (acc.filter(_ != cur.head)) )
       case _       => odd(cur.tail, (cur.head + acc ) )
    }    
    if(odd(cleanString, "").length <= 1) true
      else false
  }


  def main(args: Array[String]) {
    println(palindromePermutation("Ratzs live on no evil starz") == true)
    println(palindromePermutation("Zeus was deified, saw Suez") == true)
    println(palindromePermutation("Zeuz was deified, saw Suez") == true)

  }

}


