/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190727.class_test.entity 
 * @author: 金聖聰   
 * @date: 2019年7月27日 下午5:02:47 
 */
package kh75.day190727.class_test.entity;

import java.util.Scanner;
import java.util.Arrays;

import com.sun.swing.internal.plaf.basic.resources.basic;
import com.sun.xml.internal.bind.v2.TODO;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: StudentBiz.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月27日 下午5:02:47 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月27日     金聖聰           v1.0.0               修改原因
*/
public class StudentBiz {
	private Scanner scanner = new Scanner(System.in);
	String[] names = new String[5];
	
	public StudentBiz(){
		names[0] = "晨";
	}
	public String getName(){
		System.out.print("请输入要添加的名字:");
		return scanner.next();
	}
	public void addStudent(String name){
		
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null){
				System.out.println("有空位,可以添加");
				names[i] = name;
				System.out.println("添加成功!");
				break;
			}
		}
		show();
	}
	private void show() {
		System.out.print("添加后,有:");
		for (String string : names) {
			if (string != null){
				System.out.print(string+" ");
			}
		}
	}
	
	
}
