package project;

public class FizzBuzzQix {

  public String interpret(int numberToInterpret) {
    if ((numberToInterpret % 7 == 0) && (numberToInterpret % 5 == 0) && (numberToInterpret % 3 == 0)) {//if (numberToInterpret % 105 == 0) {
      return "FizzBuzzQix";
    }
    if ((numberToInterpret % 7 == 0) && (numberToInterpret % 5 == 0)) {
      return "BuzzQix";
    }
    if ((numberToInterpret % 7 == 0) && (numberToInterpret % 3 == 0)) {
      return "FizzQix";
    }
    if ((numberToInterpret % 5 == 0) && (numberToInterpret % 3 == 0)) {
      return "FizzBuzz";
    }
    if (numberToInterpret % 3 == 0) {
      return "Fizz";
    }
    if (numberToInterpret % 5 == 0) {
      return "Buzz";
    }
    if (numberToInterpret % 7 == 0) {
      return "Qix";
    }
    return "" + numberToInterpret;
  }
}
