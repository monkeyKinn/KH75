/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190813.class_test.test01 
 * @author: 金聖聰   
 * @date: 2019年8月13日 上午8:53:46 
 */
package kh75.day190813.class_test.test01;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestStudentJava.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月13日 上午8:53:46 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月13日     金聖聰           v1.0.0               修改原因
*/
public class TestStudentJava {
	Scanner input = new Scanner(System.in);
	@Test
	public void test01() throws Exception {
		System.out.print("请输入单元:");
		StudentJava s = null;
		switch (input.next()) {
		case "U1":
			 s = StudentJava.U1;
			break;
		case "U2":
			 s = StudentJava.U2;
			break;
		case "U3":
			 s = StudentJava.U3;
			break;
		default:
			break;
		}
		switch (s) {
		case U1:
			System.out.println("第一单元打基础");
			break;
		case U2:
			System.out.println("第二单元可以胜任java程序开发");
			break;
		case U3:
			System.out.println("第二单元可以胜任企业java开发");
			break;
		}
	}
	@Test
	public void test02() throws Exception {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer("1");
		Boolean b1 = new Boolean("TRuE");
		//Boolean 的时候,只要后面new的字符串不是true,就是false
		Boolean b2 = new Boolean("FRuE");
		//当是基本数据类型的时候,必须严格一致
		Boolean b3 = new Boolean(true);
		System.out.println(i1);
		System.out.println(i1+" "+i2+" "+b1+" "+b2);
		System.out.println("----------------------------");
		Integer i3 = 15;
		System.out.println(i3);
	}
}
