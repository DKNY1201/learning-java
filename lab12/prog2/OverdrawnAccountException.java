package lab12.prog2;

public class OverdrawnAccountException extends Exception {
  OverdrawnAccountException() {
    super();
  }
  
  OverdrawnAccountException(String msg) {
    super(msg);
  }
}
