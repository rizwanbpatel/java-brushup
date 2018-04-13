package diamond.support;

/**
 * Child overriding default behaviour from the Parent interface
 */
public interface Square{

    default void style() {
        System.out.println("Style invocation of interface : Square");
    }
}
