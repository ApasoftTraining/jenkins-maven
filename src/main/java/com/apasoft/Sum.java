public class Sum {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("I need two numbers to sum.");
                return;
            }

            // Convert parameters from String to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Sum the numbers
            int result = num1 + num2;

            // Print result
            System.out.println("The sum of" + num1 + " and " + num2 + " is " + resul);
        } catch (NumberFormatException e) {
            System.out.println("Error: The parameteres must be integers.");
        }
    }
}
