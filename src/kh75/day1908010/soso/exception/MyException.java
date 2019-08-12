/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day1908010.soso.exception 
 * @author: 金聖聰   
 * @date: 2019年8月11日 下午8:14:16 
 */
package kh75.day1908010.soso.exception;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: MyException.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月11日 下午8:14:16 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月11日     金聖聰           v1.0.0               修改原因
*/
public class MyException extends RuntimeException{
	private static final long serialVersionUID = -4483825685921120810L;

	public MyException() {
		super();
	}
	public MyException(String message, Throwable cause) {
		super(message, cause);
	}
	public MyException(String message) {
		super(message);
	}
	
}
