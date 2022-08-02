package oop.udemyandtechproexamples.visibilitytopic.accessmodifiers;

/*

Challenge:
In the following interface declaration, what is the visibility of:
1. The Accessible interface? - deafult; it's visible in the relevant package only
2. The int variable SOME_CONSTANT? - public
3. methodA? - public
4. methodB and methodC? - public

Hint: Think back to the lecture on interfaces before answering.
--> With interfaces - the lack of the access modifier doesn't mean that it's package-private (for interfaces), but for the rest - yes.
    in Interfaces - variables and methods are always public.
 */

interface Accessible {
    int SOME_CONSTANT=100;
    public void methodA();
    void methodB();
    boolean methodC();
}
