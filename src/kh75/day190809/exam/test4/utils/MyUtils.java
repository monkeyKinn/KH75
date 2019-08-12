/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test4.utils 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午10:10:12 
 */
package kh75.day190809.exam.test4.utils;

import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: MyUtils.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午10:10:12 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public enum MyUtils {
	INSTANCE;
	Scanner in = new Scanner(System.in);
	public int selectNum(){
		int num = 0;
		try {
			num = in.nextInt();
			return num;
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}finally {
			num = 0;
		}
		return num;
	}
	
	public String getString(){
		return in.next();
	}
}
