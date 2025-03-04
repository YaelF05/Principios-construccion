public class ConsoleBasedFizzBuzz implements FizzBuzz {

    @Override
    public void print(int num, int num2) {
        while (num < num2) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
            num++;
        }
    }
}
