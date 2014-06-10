// LogicalOperators.java
// logical operator examples
// (C) 2014 kmaune0

public class LogicalOperators {
  public static void main(String[] args) {

    // create a truth table for && operator
    System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
      "Conditional AND (&&)", " false && false", (false && false),
      "false && true", (false && true),
      "true && false". (true && false),
      "true && true", (true && true));

    // create truth table for || operator
    System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
      "Conditional OR (||)", "false || false", (false || false),
      "false || true", (false || true),
      "true || false", (true || false),
      "true || true", (true || true));

    // create truth table for & operator
    System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
      "Boolean logical AND (&)", "false & false", (false & false),
      "false & true", (false & true),
      "true & false", (true & false),
      "true & true", (true & true));

    // create truth table for | operator
    System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
      "Boolean logical inclusive OR (|)",
      "false | false", (false | false),
      "false | true", (false | true),
      "true | false", (true | false),
      "true | true", (true | true));

    // create truth table for ^ operator
    System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
      "Boolean logical exclusive OR (^)",
      "false ^ false", (false ^ false),
      "false ^ true", (false ^ true),
      "true ^ false", (true ^ false),
      "true ^ true", (true ^ true));

    // create truth table for ! operator
    System.out.printf("%s\n%s: %b\n%s: %b\n", "Logical NOT (!)",
      "!false", (!false), "!true", (!true));
  }
}
