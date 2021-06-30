/* 
 * Functional Interface MUST have ONLY ONE abstract method
 * Functional Interface can optionally have more than one default or/and static methods 
 */
package java8Features;
public interface FunctionalInterface {
//	abstract method
	public void square(int a);
	
//	Static method can be called only by interface name.static method
	public static void m1() {
		System.out.println("Inside Static method");
	}

}