
object Chapter1q2 {

  def isPermutation(str1: String, str2: String):Boolean = {
    val charsSorted1 = str1.toArray.sortWith(_<_)
    val charsSorted2 = str2.toArray.sortWith(_<_)
    val strEq = charsSorted1 sameElements charsSorted2
    !strEq
  }


  def main(args: Array[String]) {
    println(isPermutation("abdegjlmyzcw", "jlmyzcwabdeg") == false)
    println(isPermutation("abdefjlmyzcw", "jlmyzcwabdeg") == true)
  }

}


