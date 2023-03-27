package ar.edu.unq.po2.tp3.test;

public class ExaminarExpresionesTestCase extends CounterTestCase {
	public static void main(String[] args) {
		String a = "abc";
		String s = a;
		String t;

		System.out.println(s.length()); // devuelve 3
		// System.out.println(t.length()); // no inicializada t
		System.out.println(1 + a); // devuelve 1abc
		System.out.println(a.toUpperCase()); // devuelve ABC
		System.out.println("Libertad".indexOf("r")); // devuelve 4
		System.out.println("Universidad".lastIndexOf('i')); // devuelve 7
		System.out.println("Quilmes".substring(2, 4)); // devuelve il
		System.out.println((a.length() + a).startsWith("a"));// devuelve false
		System.out.println(s == a); // devuelve true
		System.out.println(a.substring(1, 3).equals("bc")); // devuelve true

	}
}
