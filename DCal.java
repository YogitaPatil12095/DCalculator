public class DCal {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;

      // Check if enough arguments are provided
      if (args.length < 3) {
         System.out.println("Usage: java Calculator <number1> <number2> <operator>");
         return;
      }

      // Parse the arguments
      num1 = Double.parseDouble(args[0]);
      num2 = Double.parseDouble(args[1]);
      op = args[2].charAt(0);

      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': 
            if (num2 == 0) {
               System.out.println("Error: Division by zero is not allowed.");
               return;
            }
            ans = num1 / num2;
            break;
         default: 
            System.out.printf("Error! Enter correct operator");
            return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}
