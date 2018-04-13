package diamond.rules;

import diamond.support.Circle;
import diamond.support.ShapeHelper;
import diamond.support.Square;

/**
 * Classes take higher precedence than interfaces
 */
public class ClassPrecedence extends ShapeHelper implements Square, Circle {


    public static void main(String[] args) {
        ClassPrecedence diamond = new ClassPrecedence();
        diamond.style();
    }


}
