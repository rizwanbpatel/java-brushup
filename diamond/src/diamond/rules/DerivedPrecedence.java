package diamond.rules;

import diamond.support.Circle;
import diamond.support.Oval;

/**
 * Derived interfaces or sub-interfaces take higher precedence than the parents
 */
public class DerivedPrecedence implements Circle, Oval {

    public static void main(String[] args) {
        DerivedPrecedence diamond = new DerivedPrecedence();
        diamond.style();
    }


}
