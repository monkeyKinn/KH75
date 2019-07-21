/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：放課後練習のかばん
 * @Package: kh75.day190712.test01 
 * @author: 金聖聰   
 * @date: 2019年7月12日 上午11:11:21 
 */
package kh75.day190712.test01;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: AfterSchoolExercises.java
* @Description: 全て放課後の練習
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月12日 上午11:11:21 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月12日     金聖聰           v1.0.0               修改原因
*/
public class AfterSchoolExercises {
	public static void main(String[] args) {
		System.out.println("--------------个人信息------------");
		exercise4PerInfo();
		System.out.println("-----------成绩单-----------");
		exercise4PrintOtherInfo();
	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 显示别人成绩
	*
	* @param:null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月12日 上午11:41:15 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月12日     金聖聰           v1.0.0               修改原因
	*/
	private static void exercise4PrintOtherInfo() {
		System.out.println("姓名\t\t语文\t数学\t英语\t");
		System.out.println("张白痴\t\t85\t75\t60");
		System.out.println("李思思\t\t65\t58\t20");
		System.out.println("王五五\t\t88\t60\t0");
	}

	/**   
	* @Function: AfterSchoolExercises.java
	* @Description: 显示个人档案
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月12日 上午11:30:33 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月12日     金聖聰           v1.0.0               修改原因
	*/
	private static void exercise4PerInfo() {
		String name = "金聖聰";
		int age = 24;
		String gender = "男";
		String job = "JAVA初软";
		String address = "江苏省常州市天宁区郑陆镇省岸村朱家桥10号";
		String phoneNum = "18151282669";
		System.out.println("姓名:" + name + "\n" + "年龄:" + age + "\n" + "性别:" + gender + "\n" + "职业:" + job + "\n" + "地址:"
				+ address + "\n" + "电话:" + phoneNum);
	}
}
