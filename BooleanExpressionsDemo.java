public class BooleanExpressionsDemo {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isHomeworkTiring = false;

        int a = 15;
        int b = 20;

        boolean isAGreater = a > b;   // 15 > 20 → false
        boolean areEqual = (a == b);  // 15 == 20 → false
        boolean bothTrue = isJavaFun && (a < b);  // true && (15 < 20) → true && true → true
        boolean eitherTrue = isJavaFun || isHomeworkTiring;  // true || false → true
        boolean notTrue = !isHomeworkTiring;  // !false → true
        boolean exclusiveOr = isJavaFun ^ isHomeworkTiring;  // true ^ false → true (XOR: different values → true)

        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is homework tiring? " + isHomeworkTiring);
        System.out.println("Is 'a' greater than 'b'? " + isAGreater);
        System.out.println("Are 'a' and 'b' equal? " + areEqual);
        System.out.println("Both conditions (isJavaFun && a<b): " + bothTrue);
        System.out.println("Either condition (isJavaFun || isHomeworkTiring): " + eitherTrue);
        System.out.println("Logical NOT of isHomeworkTiring: " + notTrue);
        System.out.println("Exclusive OR (isJavaFun ^ isHomeworkTiring): " + exclusiveOr);
    }
}
