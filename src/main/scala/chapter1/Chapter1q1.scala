
object Chapter1q1 {

  def isUniqueCharacters(str: String):Boolean = {
    val charsSorted = str.toArray.sortWith(_<_)
    val charsPair = charsSorted zip charsSorted.tail
    val pairEq = charsPair.exists {case(ch1, ch2) => ch1 == ch2}
    !pairEq
  }



  def main(args: Array[String]) {
    println(isUniqueCharacters("aa") == false )
    println(isUniqueCharacters("aaabbdddd") == false )
    println(isUniqueCharacters("abdegjlmyy") == false )
    println(isUniqueCharacters("abdegjlmyzcw") == true )
  }

}


