public class ConcreteA implements InterfaceA, InterfaceB {
    
    @Override
    public void name() {
    
    }
    
    /**
     * You can override default methods in concrete classes where you can either make your own implementation or use the
     * implementation that exists within the interface.
     *
     * You have to override a default method if there is naming ambiguity between multiple implemented interfaces
     */
    @Override
    public void defaultMethod() { InterfaceA.super.defaultMethod(); }
}
