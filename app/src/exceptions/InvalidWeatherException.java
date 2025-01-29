package exceptions;

public class InvalidWeatherException extends RuntimeException {
  public InvalidWeatherException(String message) {
    super(message);
  }
}
