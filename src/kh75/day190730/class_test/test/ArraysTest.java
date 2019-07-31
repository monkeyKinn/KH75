/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：测试包
 * @Package: kh75.day190730.class_test.test 
 * @author: 金聖聰   
 * @date: 2019年7月30日 上午9:23:37 
 */
package kh75.day190730.class_test.test;

import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: ArraysTest.java
* @Description: Student的测试类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月30日 上午9:23:37 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月30日     金聖聰           v1.0.0               修改原因
*/
public class ArraysTest {
	String[] names = new String[30];

	/**
	 * 
	* @Function: ArraysTest.java
	* @Description: 向数组中插入学生的姓名（使用方法来做）
	*
	* @param: 插入学生的名字
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月30日 上午9:28:32 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月30日     金聖聰           v1.0.0               修改原因
	 */
	private void addStudent(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}

	/**
	 * 查询学生的相关信息
	 */
	public void showStudent() {
		for (int i = 0; i < names.length; i++) {
			// 当学生不为空的时候全部显示
			if (names[i] != null) {
				System.out.print(names[i] + " ");
			}
		}
	}

	/**
	 * 在某个区间查询学生的相关方法
	 */
	public boolean queryStu(int start, int end, String name) {
		boolean flag = false; // 假设没有找到 true: 找到了
		for (int i = start - 1; i < end; i++) {
			// 数值比较使用 == ;引用数据类型比较实用equals()
			if (names[i].equals(name)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 增加学生和显示学生的相关测试
		ArraysTest t = new ArraysTest();
		String name = "";
		for (int i = 0; i < 5; i++) {
			System.out.print("请输入第" + (i + 1) + "个学生的姓名：");
			name = sc.next();
			t.addStudent(name);
		}
		// 调用显示学生的方法
		t.showStudent();

		System.out.print("请输入查找的开始位置：");
		int s = sc.nextInt();
		System.out.print("请输入结束的位置：");
		int e = sc.nextInt();

		System.out.print("请输入查找的学生的姓名：");
		String n = sc.next();

		boolean b = t.queryStu(s, e, n);
		if (b) {
			System.out.println("找到了");
		} else {
			System.out.println("没有找到");
		}

	}
}
