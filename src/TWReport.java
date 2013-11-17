public class TWReport {

    @Authorization(message = "ThoughtWorks Xi'an")
    public void forPrint() {
        System.out.println("This is in TWReport");
    }

    @Authorization
    public void withOutMessage(){
        System.out.println("This is a method without specified message.");
    }

}
