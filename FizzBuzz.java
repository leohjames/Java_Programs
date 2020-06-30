// This program illustrates the classic coding interview question to create a program that outputs 'Fizz' on multiples of 3, 'Buzz' on multiples of 5, and 'FizzBuzz' on multiples of both
public class FizzBuzz {
public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
          if (i % 3 == 0) {
            if (i % 5 == 0) {
              System.out.println("FizzBuzz");
            } else {
              System.out.println("Fizz");
            }
          } else if (i % 5 == 0) {
            System.out.println("Buzz");
          } else {
        System.out.println(i);
        }
      }
   }
}
