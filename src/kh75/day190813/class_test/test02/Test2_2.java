/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190813.class_test.test02 
 * @author: 金聖聰   
 * @date: 2019年8月13日 上午10:53:39 
 */
package kh75.day190813.class_test.test02;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	/*	System.out.println("欢迎进入作业提交系统");
		System.out.print("请输入Java 文件名:");
		String name = in.next();
		System.out.print("请输入邮箱:");
		String email = in.next();
		//判断文件名合法
		boolean flag = false;
		if (name.endsWith(".java") && name.lastIndexOf(".")>0) {//有点.java结尾
			flag = true;
			if (email.contains("@") && email.contains(".") && email.indexOf("@")<email.indexOf(".") ) {
				flag = true;
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}
		
		if (flag) {
			System.out.println("提交成功");
		}else {
			System.out.println("输入的文件名或邮箱不合法,提交失败");
		}*/
		/*System.out.println("----------------------------");
		System.out.print("请输入一串数字");
		StringBuffer sb = new StringBuffer(in.next());
		for (int i = sb.length()-3; i > 0; i -= 3) {
			sb.insert(i, ",");
		}
		System.out.println(sb);*/
		System.out.println("----------------------------");
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(d);
		System.out.println(format);
		System.out.println("----------------------------");
		Calendar c  = Calendar.getInstance();
		c.set(2015, 4, 6);
		System.out.print(c.getWeekYear());
		
	}
}
