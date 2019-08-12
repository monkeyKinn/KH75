/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190807.class_test 
 * @author: 金聖聰   
 * @date: 2019年8月7日 下午3:13:39 
 */
package kh75.day190807.class_test;

import static org.junit.Assert.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestException.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月7日 下午3:13:39 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月7日     金聖聰           v1.0.0               修改原因
*/
public class TestException {
	Scanner in = new Scanner(System.in);
	@Test
	public void test03() throws Exception {
		String s = "张三";
		String s3 = "张三";
		String s1 = new String("张三");
		String s2 = new String("张三");
		System.out.println(s1==s);
		System.out.println(s2==s);
		System.out.println(s3==s);
	} 
	
	
	private static Logger logger=Logger.getLogger(TestException.class.getName());
	 @Test
	 public void test06(){
	   
	   Scanner sc = new Scanner(System.in);
	   try {
	    System.out.print("请输入被除数：");
	    int num1 = sc.nextInt();
	    logger.debug("输入被除数："+num1);
	    
	    System.out.print("请输入一个除数：");
	    int num2 = sc.nextInt();
	    logger.debug("请输入除数："+num2);
	    
	    System.out.println("商是："+(num1 / num2));
	    logger.debug("商是："+num1/num2);
	   } catch (Exception e) {
		   /**
		    * 把报错信息记录在文件里
		    */
		   logger.error(e.getMessage(),e);
			e.printStackTrace();
	   }
	 }

	
	
	
	
	@Test
	public void test01() throws Exception {
		try {
			System.out.print("Input num:");
			int a = in.nextInt();
			System.out.print("Input another num:");
			int b = in.nextInt();
			System.out.println("Result is:" + a / b);
		} catch (ArithmeticException | InputMismatchException e) {
			System.out.println("什么异常呢?");
			e.printStackTrace();
		} finally {
			System.out.println("我一直在...从未离开...");
		}
	}

	@Test
	public void test02() throws Exception {
		String[] arr = { "Java","SQL","JavaWeb" };
		System.out.print("输入 课程代号:(1~3):");
		
		try {
			int num = in.nextInt();
			int ind = num - 1;
			switch (ind) {
			case 0:
				System.out.println(arr[0]);
				break;
			case 1:
				System.out.println(arr[1]);
				break;
			case 2:
				System.out.println(arr[2]);
				break;
			default:
				System.out.print("输入错误,没有此课程");
			}
		} catch (Exception e) {
			System.out.println("出错辣~~输入的不是整数哦~");
			e.printStackTrace();
		} finally {
			System.out.println("欢迎给建议~");
		}

	}
}
