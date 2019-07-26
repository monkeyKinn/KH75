/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190726.afterschool_exercises.entity 
 * @author: 金聖聰   
 * @date: 2019年7月26日 上午9:55:19 
 */
package kh75.day190726.class_test.entity;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: School.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月26日 上午9:55:19 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月26日     金聖聰           v1.0.0               修改原因
*/
public class School {
	public static String name;
	public static int classNum;
	public static int computerRoomNum;

	public School(int no){
		name = "北大";
		classNum = 100;
		computerRoomNum = 150;
		System.out.println("我是"+no+"位");
	}
	public School(){
		
	}
	public void getInfo() {
		System.out.println("名:" + name + "\t班级数目:" + classNum + "\t机房数目:" + computerRoomNum);
	}
}
