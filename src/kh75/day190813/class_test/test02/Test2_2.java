/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190813.class_test.test02 
 * @author: 金聖聰   
 * @date: 2019年8月13日 上午10:53:39 
 */
package kh75.day190813.class_test.test02;

import java.util.Scanner;
/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Test2_2.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月13日 上午10:53:39 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月13日     金聖聰           v1.0.0               修改原因
*/
public class Test2_2 {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("欢迎进入作业提交系统");
		System.out.print("请输入Java 文件名:");
		String name = in.next();
		System.out.print("请输入邮箱:");
		String email = in.next();
		//判断文件名合法
		if (name.endsWith(".java")) {//有点.java结尾
			System.out.println("文件名合法~");
		} else {
			System.out.println("文件名不合法~");
		}
		if (email.contains("@") && email.contains(".") && email.indexOf("@")<email.indexOf(".")) {
			System.out.println("邮箱名合法~");
		} else {
			System.out.println("邮箱不合法~");
		}
	}
}
