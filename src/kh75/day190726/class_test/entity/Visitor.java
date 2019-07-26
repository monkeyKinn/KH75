/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190726.class_test.entity 
 * @author: 金聖聰   
 * @date: 2019年7月26日 上午10:16:56 
 */
package kh75.day190726.class_test.entity;

import java.util.Scanner;
/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Visitor.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月26日 上午10:16:56 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月26日     金聖聰           v1.0.0               修改原因
*/
public class Visitor {
	private String name;
	private int age;

	public void setInfo(){
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.print("In Put Name:");
			String n = in.next();
			if ("n".equals(n.toLowerCase())) {//把输入的转成小写,然后与n比较
				System.out.println("さよなら！");
				flag = false;
				break;
			} else {
				name = n;
				System.out.print("In Put Age:");
				int a = in.nextInt();
				age = a;
				getInfo();
			}
		} while (flag);
		in.close();
	}
	private void getInfo(){
		if (age>=80 || (age <18) && (age>0)) {//free
			System.out.println("的年龄为:"+age+",门票免费");
		} else {
			System.out.println(name+"的年龄为:"+age+",门票价格为20元");
		}
	}
}
