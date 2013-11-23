public class TWReport {

    @Authorization(message = "ThoughtWorks Xi'an")
    @CompileTime
    public void forPrint() {
        System.out.println("This is in TWReport");
    }

    @Authorization
    @CompileTime
    public void withOutMessage(){
        System.out.println("This is a method without specified message.");
    }

}
