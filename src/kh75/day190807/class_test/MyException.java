/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190807.class_test 
 * @author: 金聖聰   
 * @date: 2019年8月7日 下午4:37:17 
 */
package kh75.day190807.class_test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: MyException.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月7日 下午4:37:17 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月7日     金聖聰           v1.0.0               修改原因
*/
public class MyException extends RuntimeException{

	private static final long serialVersionUID = 4286800149290162476L;

	/**   
	* @Function: MyException.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月7日 下午4:38:13 
	*/
	public MyException() {
		super();
	}

	/**   
	* @Function: MyException.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月7日 下午4:38:13 
	*/
	public MyException(String message, Throwable cause) {
		super(message, cause);
	}

	/**   
	* @Function: MyException.java
	* @Description: 该函数的功能描述
	*
	* @param:　参数描述
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月7日 下午4:38:13 
	*/
	public MyException(String message) {
		super(message);
	}
	
	
}
