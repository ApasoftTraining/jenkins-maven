public class Sum {
    public static void main(String[] args) {
        try {
            int num1;
            int num2;
            if (args.length < 2) {
                 num1=1;
                num2=1;
            }
        else
        {
            // Convert parameters from String to integers
             num1 = Integer.parseInt(args[0]);
             num2 = Integer.parseInt(args[1]);
        }
            // Sum the numbers
            int result = num1 + num2;
            // Print result
            System.out.println("The sum of" + num1 + " and " + num2 + " is " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: The parameteres must be integers.");
        }
    }
}


