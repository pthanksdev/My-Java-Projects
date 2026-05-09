public interface FactorialCalculation {
    public int factorial(int number);

    //class FactorialCalculationImpl implements FactorialCalculation
// @Override
// public int factorial(int number)
// int result=
// for(int index=1; number;index
// result*=
//
// return
//
    public class FactorialExample {
        public static void main(String[] args) {
            // FactorialCalculation factorialTraditional =new FactorialCalculationImpl();
            //Anonymous Class Example
//      FactorialCalculation factorial=new FactorialCalculation
//      {
//       @Override
//       public int factorial(int number)
//       int result=
//       for(int index=1; number;index
//      result*=index;
//         }
//      return result;
//
//  }
            //}
            FactorialCalculation factorial=(number)-> {
                int result = 1;
                for (int index = 1; index <= number; index++) {
                    result *= index;
                }
                return result;
            };
            System. out .println("Factorial of Given Number:"+factorial.factorial(5));
        }
    }
}
