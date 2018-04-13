package diamond.rules;

import diamond.support.Circle;
import diamond.support.Square;

/**
 * To resolve the conflict class has to specifically override
 * and provide a method with the same method definition
 */
public class SpecificOverridingPrecedence implements Square, Circle {


    public static void main(String[] args) {
        SpecificOverridingPrecedence diamond = new SpecificOverridingPrecedence();
        diamond.style();
    }


    /**
     * Overriding and specifically mentioning Circle Interface's style()
     */
    @Override
    public void style() {
        Circle.super.style();
    }
}
