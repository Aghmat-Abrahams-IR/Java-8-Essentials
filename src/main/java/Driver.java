public class Driver {
    public static void main(String[] args) {
        System.out.println("1 + 2 = " +  InterfaceA.addInteger(1, 2));
        System.out.println("1 - 2 = " +  InterfaceB.subtractInteger(1, 2));
        
        ConcreteA concreteA = new ConcreteA();
        concreteA.defaultMethod();
        
        ConcreteB concreteB = new ConcreteB();
        concreteB.defaultMethod();
    }
}
