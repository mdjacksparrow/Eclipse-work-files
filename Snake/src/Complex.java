
class ComplexTest{
    int a,b;
    ComplexTest(int x,int y)
    {
       a=x;
       b=y;
    }
   static void add(ComplexTest obj1,ComplexTest obj2)
   {
       System.out.println("\nThe Addition of two ComplexTest number is "+(obj1.a+obj2.a)+"+i"+(obj1.b+obj2.b) );
   }
   static void sub(ComplexTest obj1,ComplexTest obj2)
   {
       System.out.printf("\nThe Subraction of two ComplexTest number is %d + i (%d)",(obj1.a-obj2.a),(obj1.b-obj2.b) );
   }
   static void mul(ComplexTest obj1,ComplexTest obj2)
   {
       System.out.printf("\n\nThe Multiplication of two ComplexTest number is %d + i(%d)\n",((obj1.a*obj2.a)-(obj1.b*obj2.b)),((obj1.a*obj2.b)+(obj1.b*obj2.a)));
   }
  static void div(ComplexTest obj1,ComplexTest obj2)
   {
       int a,b,c;
       a=((obj1.a*obj2.a)+(obj1.b*obj2.b));
       b=(-(obj1.a*obj2.b)+(obj1.b*obj2.a));
       c=((obj2.a * obj2.a)+(obj2.b * obj2.b));
       System.out.printf("\n\nThe Multiplication of two ComplexTest number is (%d + i(%d))/%d\n",a,b,c);
   }
}
public class Complex
{
    public static void main(String []args)
    {
        ComplexTest obj1=new ComplexTest(6,3);
        ComplexTest obj2=new ComplexTest(5,2);
        ComplexTest.add(obj1, obj2);
        ComplexTest.sub(obj1, obj2);
        ComplexTest.mul(obj1, obj2);
        ComplexTest.div(obj1, obj2);
        
        
    }
}