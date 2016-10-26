
object Chapter1q5 {

  def oneAway(str1: String, str2: String):Boolean = {
    val splits = (0 to str2.length) map(str2 splitAt _)
    val deletes = splits take(splits.length-1) map(x => x._1 + x._2.tail)
    val transposes = splits take(splits.length-2) map(x => 
                                 x._1 + x._2.tail.head + x._2.head + x._2.tail.tail)
    val replaces = splits take(splits.length-1) flatMap(x => 
                                 ('a' to 'z').map(c => x._1 + c + x._2.tail) )
    val inserts = splits flatMap(x => ('a' to 'z').map(c => x._1 + c + x._2) )

    val candidates = deletes ++ transposes ++ replaces ++ inserts
    val res = candidates contains str1

    res     
  }

  def main(args: Array[String]) {
    println(oneAway("pale", "pkle") == true)
    println(oneAway("pkle", "pable") == false )
    println(oneAway("acdsfdsfadsf", "acdsgdsfadsf") == true)
  }
}


