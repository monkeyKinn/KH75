/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190807.class_test 
 * @author: 金聖聰   
 * @date: 2019年8月7日 下午4:39:21 
 */
package kh75.day190807.class_test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestMyException.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月7日 下午4:39:21 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月7日     金聖聰           v1.0.0               修改原因
*/
public class TestMyException {
	static String[] names = {"well","lucy","lili"};
	public static void main(String[] args) {
		try {
			cheakName("well");
			System.out.println("Success!");
		} catch (MyException e) {
			e.printStackTrace();//自己看
			//zz看
			System.out.println(e.getMessage());
		} finally {
			System.out.println("欢迎使用,再见~");
		}
		
	}
	/**   
	* @Function: TestMyException.java
	* @Description: 该函数的功能描述
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月7日 下午4:40:46 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月7日     金聖聰           v1.0.0               修改原因
	*/
	private static void cheakName(String name) {
		for (String na : names) {
			if (na.equals(name)) {
				throw new MyException("傻屌,"+name+"有人注册过了");
			}
		}
	}
}
