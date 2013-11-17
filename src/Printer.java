
public class Printer {
    @Authorization(message = "Printer 1")
    public void print(){
        System.out.println("I am Printer!");
    }
}
