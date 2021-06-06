package project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzQixTest {

//    @Test
//    public void oneShouldReturnOne() {
//      FizzBuzzQix underTest = new FizzBuzzQix();
//      String spokenWord = underTest.interpret(1);
//      assertThat(spokenWord).isEqualTo("1");
//    }

  @Test
  public void oneShouldReturnOne() {
    FizzBuzzQix underTest = new FizzBuzzQix();
    String spokenWord = underTest.interpret(1);
    assertEquals("1", spokenWord);
  }

  @Test
  public void twoShouldReturnTwo() {
    FizzBuzzQix underTest = new FizzBuzzQix();
    String spokenWord = underTest.interpret(2);
    assertEquals("2", spokenWord);
  }

  @Test
  public void ShouldReturnFizzIfGivenThree() {
    FizzBuzzQix underTest = new FizzBuzzQix();
    String spokenWord = underTest.interpret(3);
    assertEquals("Fizz", spokenWord);
  }

  @Test
  public void shouldReturnFizzIfGivenMultipleOfThree() {
    FizzBuzzQix underTest = new FizzBuzzQix();
    String spokenWord = underTest.interpret(132);
    assertEquals("Fizz", spokenWord);
  }

  @Test
  public void shouldReturnBuzzIfGivenFive() {
    FizzBuzzQix underTest = new FizzBuzzQix();
    String spokenWord = underTest.interpret(5);
    assertEquals("Buzz", spokenWord);
  }

  @Test
  public void shouldReturnBuzzIfGivenMultipleOfFive() {
    FizzBuzzQix underTest = new FizzBuzzQix();
    String spokenWord = underTest.interpret(200);
    assertEquals("Buzz", spokenWord);
  }

  @Test
  public void shouldReturnQixIfGivenSeven() {
    FizzBuzzQix underTest = new FizzBuzzQix();
    String spokenWord = underTest.interpret(7);
    assertEquals("Qix", spokenWord);
  }

  @Test
  public void shouldReturnQixIfGivenMultipleOfSeven() {
    FizzBuzzQix underTest = new FizzBuzzQix();
    String spokenWord = underTest.interpret(154);
    assertEquals("Qix", spokenWord);
  }

  @Test
  public void shouldReturnFizzBuzzIfGivenMultipleOfFiveAndThree() {
    FizzBuzzQix underTest = new FizzBuzzQix();
    String spokenWord = underTest.interpret(15);
    assertEquals("FizzBuzz", spokenWord);
  }

  @Test
  public void shouldReturnFizzQixIfGivenMultipleOfSevenAndThree() {
    FizzBuzzQix underTest = new FizzBuzzQix();
    String spokenWord = underTest.interpret(21);
    assertEquals("FizzQix", spokenWord);
  }

  @Test
  public void shouldReturnBuzzQixIfGivenMultipleOfSevenAndFive() {
    FizzBuzzQix underTest = new FizzBuzzQix();
    String spokenWord = underTest.interpret(35);
    assertEquals("BuzzQix", spokenWord);
  }

  @Test
  public void shouldReturnFizzBuzzQixIfGivenMultipleOfSevenAndFiveAndThree() {
    FizzBuzzQix underTest = new FizzBuzzQix();
    String spokenWord = underTest.interpret(105);
    assertEquals("FizzBuzzQix", spokenWord);
  }

}
