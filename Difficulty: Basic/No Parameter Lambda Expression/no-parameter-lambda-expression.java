class Solution {
    public static Hello helperFunction() {
        // Implement sayHello using lambda expression and return the object.
        return () -> System.out.println("Hello");
    }
}