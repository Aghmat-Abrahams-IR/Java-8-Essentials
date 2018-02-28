public interface InterfaceA {
    static int addInteger(int a, int b) { return a + b; }
    
    default void defaultMethod() { System.out.println("InterfaceA"); }
    
    void name();
    
    /**
     * Will not compile because you cannot implement non-static or non-default methods
     **/
//   void willNotCompile() {
//        System.out.println();
//   }
}
