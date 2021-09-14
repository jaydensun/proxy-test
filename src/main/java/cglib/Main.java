package cglib;

public class Main {
    public static void main(String[] args) {
        System.out.println("begin test cglib\n");
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("java");
    }
}
