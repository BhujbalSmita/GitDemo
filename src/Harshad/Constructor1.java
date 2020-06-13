package harshad;

class Constructor1
{
      private int var;
      //default constructor
      public Constructor1()
      {
             this.var = 10;
      }
      //parameterized constructor
      public Constructor1(int num)
      {
             this.var = num;
      }
      public int getValue()
      {
              return var;
      }
      public static void main(String args[])
      {
              Constructor1 obj = new Constructor1();
              Constructor1 obj2 = new Constructor1(100);
              System.out.println("var is: "+obj.getValue());
              System.out.println("var is: "+obj2.getValue());
      }
}
