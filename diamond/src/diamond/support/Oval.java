package diamond.support;

public interface Oval extends Circle{

    default void style() {
        System.out.println("Style invocation of interface : Oval");
    }
}
