/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：Chap5 练习包
 * @Package: kh75.day190731.afterschool_exercises.chap5 
 * @author: 金聖聰   
 * @date: 2019年8月1日 下午6:32:33 
 */
package kh75.day190731.afterschool_exercises.chap5;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Worker.java
* @Description: Chap5 No11 
* 写一个Worker 类，并创建多个Worker 对象。 
		1) 为Worker 类添加三个属性，
			1）String 类型的name，表示工人的姓名； 
			2）int 类型的age，表示工人的年龄；
			3）double 类型的salary，表示工人的工资。 
		2) 为Worker 类添加两个构造方法，
			1）公开无参构造方法；
			2）接受三个参数的构造方法，
				三个参数分别为
					字符串、int 和double 类型。 
		3) 为Worker 类添加两个work 方法，
				一个无参，另一个带整数参数，
				表示工人工作的时间（为多少小时）。 
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月1日 下午6:32:33 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月1日     金聖聰           v1.0.0               修改原因
*/
public class Worker {
	String name;
	int age;
	double salary;
	Address addr;
	
	/**   
	* @Function: Worker.java
	* @Description: 无参构造
	*
	* @param:　没有
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月1日 下午6:35:13 
	*/
	public Worker() {
		
	}
	/**   
	* @Function: Worker.java
	* @Description: 有参构造
	*
	* @param:　name 名字,age 年龄,salary 薪水
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月1日 下午6:35:55 
	*/
	public Worker(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	/**
	 * 
	* @Function: Worker.java
	* @Description: 当前工作时间
	*
	* @param: 没有
	* @return：void
	* @throws：没有
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月1日 下午6:38:32 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月1日     金聖聰           v1.0.0               修改原因
	 */
	public void work(){
		System.out.println("工人工作的时间:默认的,8小时");
	}
	public void work(int hours){
		System.out.println("工人工作的时间自己输入的,"+hours+"小时");
	}
}
