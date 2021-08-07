object CaesarCipher extends App{

  val alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val e = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
  val d = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
  val cipher=(algo:(Char,Int,String)=>
    Char,s:String,key:Int,a:String)=>
    s.map(algo(_,key,a))

  val ct = cipher(e,"s",5,alph)
  print(ct)

}
