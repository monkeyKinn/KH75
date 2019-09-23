/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：我的工具包
 * @Package: kh75.day190724.foodieleague.util 
 * @author: 金聖聰   
 * @date: 2019年7月24日 下午2:54:26 
 */
package kh75.day190724.foodieleague.utils;

import java.util.Scanner;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: MyUtils.java
* @Description: 我的工具类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月24日 下午2:54:26 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月24日     金聖聰           v1.0.0              代码重构
*/
public enum MyUtils {
	INSTANCE;
	Scanner in = new Scanner(System.in);
	/**
	 * 
	* @Function: MyUtils.java
	* @Description: 判断输入是否为0,不是的话循环输入,直到为0
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月24日 下午2:56:33 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月24日     金聖聰           v1.0.0               代码重构
	 */
	public void isZero() {
		System.out.print("输入0返回:");
		int isZero = -1;
		while (isZero != 0) {
			// 判断输入合法性
			if (in.hasNextInt()) {// 合法
				isZero = in.nextInt();
				if (isZero != 0) {
					System.out.print("输入无效~请重输:");
				}
			} else {// 不合法
				System.out.print("输入非法,请重新输入:");
				in.next();
			}
		}
		System.out.println();
	}
}