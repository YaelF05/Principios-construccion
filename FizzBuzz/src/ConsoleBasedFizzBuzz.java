public class ConsoleBasedFizzBuzz implements FizzBuzz {

    @Override
    public void print(int to) {
        //Substitute Algorithm
        for (int i = 1; i <= to; i++) {
            System.out.println(validarNumero(i));
        }
    }

    //Extract Method y Hide Method
    private String validarNumero(int from) {
        //Substitute Algorithm
        if (from % 15 == 0) return "FizzBuzz";
        if (from % 3 == 0) return "Fizz";
        if (from % 5 == 0) return "Buzz";
        return "" + from;
    }

}
