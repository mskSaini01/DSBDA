object ScalaBasic {
  def add(x:Int, y:Int) : Int =
    {
        x + y
    }
    
     def sub(x:Int, y:Int) : Int =
    {
        x - y
    }
    
      def mult(x:Int, y:Int) : Int =
    {
        x * y
    }
    

    
   def main(args: Array[String]): Unit = {
      println("Input numbers taken:- 10 15");
      println("Addition: " + add(10, 15));
      println("Substraction: " + sub(10, 15));
      println("Multiplication: " + mult(10, 15));
   }
}
