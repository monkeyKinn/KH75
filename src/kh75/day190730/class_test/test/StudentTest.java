/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190730.class_test.test 
 * @author: 金聖聰   
 * @date: 2019年7月30日 上午10:20:52 
 */
package kh75.day190730.class_test.test;

import java.util.Scanner;
import java.util.Arrays;

import kh75.day190730.class_test.entity.Student;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: StudentTest.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月30日 上午10:20:52 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月30日     金聖聰           v1.0.0               修改原因
*/
public class StudentTest {
	private void showInfo(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName() != null) {
				System.out.println(students[i].toString());
			}
		}
	}

	private void addInfo(Student[] students) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName() == null) {
				System.out.print("输入名字:");
				students[i].setName(s.next());
				System.out.print("输入性别:");
				students[i].setGender(s.next());
			}
		}
	}
	private void addInfo1(Student students) {
		
	}


	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("金圣聪");
		s1.setGender("男");
		Student s2 = new Student();
		// s2.setName("吕筱贤");
		// s2.setGender;
		Student s3 = new Student();
		// s3.setName("金海霞");
		// s3.setGender("女");
		Student s4 = new Student();
		// s4.setName("吕勤锋");
		// s4.setGender("男");
		Student[] stu = { s1, s2, s3, s4 };
		StudentTest st = new StudentTest();
		st.showInfo(stu);
		st.addInfo(stu);
		st.showInfo(stu);
	}
}
