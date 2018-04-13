# java-brushup
Some common concepts in Java using code samples

# Java Diamond Problem
What-if the multiple default interfaces implemented have default methods with the same signatures? <br>
Which default implementations from the many parent interfaces will be invoked in the implementing class?

There are conflict resolution rules for our help on default method inheritance.
<li> Classes take higher precedence than interfaces </li>
<li> Derived interfaces or sub-interfaces take higher precedence than the parents </li>
<li> In case above are not able to resolve the conflict then class has to specifically override and provide a method with the same method definition </li>
