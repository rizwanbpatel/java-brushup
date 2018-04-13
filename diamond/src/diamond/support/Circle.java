package diamond.support;

/**
 * Child overriding default behaviour from the Parent interface
 */
public interface Circle{

    default void style(){
        System.out.println("Style invocation of interface : Circle");
    }
}
