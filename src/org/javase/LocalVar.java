package org.javase;

import org.junit.Test;

/**
 * 局部变量
 * @author 123
 *
 */
public class LocalVar {

	/**
	 * 在以下实例中age是一个局部变量，定义在pupAge方法中，它的作用域就限制在这个方法中
	 */
	public void pupAge(){
	    int age = 0;
	    age = age + 7;
	    System.out.println("小狗的年龄是: " + age);
	}
	
	@Test
	public void demo1() {
		LocalVar localVar = new LocalVar();
		localVar.pupAge();
	}
}
