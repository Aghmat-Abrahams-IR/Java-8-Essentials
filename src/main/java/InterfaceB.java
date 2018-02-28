public interface InterfaceB {
    
    /**
     * Will not compile because interfaces cannot have constructors, additionally interfaces do not have a state
     */
    //InterfaceB(); //will not compile
    
    static int subtractInteger(int a, int b) { return a - b; }
    
    default void defaultMethod() { System.out.println("InterfaceB"); }
    
    void name();
}
