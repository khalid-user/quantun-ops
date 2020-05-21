object Mobject {
  
  def upper(strings: String*): Seq[String] = {
    strings.map((s:String) => s.toUpperCase()) 
  }

}
