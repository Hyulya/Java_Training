package oop.udemyandtechproexamples.visibilitytopic;

public class Theory {
}

/*
*** Top level ***

- we can't have a private class
- only classes, interfaces and enums can exist at the top level - everything else must be included within one of these

public: the object is visible everywhere - the same package or out of it

package-private (default): the object is only available within its own package (and is visible to every class within the same
                           package. It's the not specified one - no keywords used, it's the default, invisible.
------------------------------------------------------------------------------------------------------------------------------
*** Member level ***

public: the same meaning as it has in the top level

package-private: the same meaning as it has in the top level

private: the object is visible only within the class it is declared. It is not visible anywhere else (incl subclasses of its class)

protected: the object is visible anywhere in its own package (like package-private) PLUS in subclasses even they're in another package

 */