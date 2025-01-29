package exceptions;

public class InvalidHumidityException extends RuntimeException {
  public InvalidHumidityException(String message) {
    super(message);
  }
}
