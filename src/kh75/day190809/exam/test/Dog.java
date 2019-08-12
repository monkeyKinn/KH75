/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午9:15:03 
 */
package kh75.day190809.exam.test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Dog.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午9:15:03 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class Dog extends Pet{
	@Override
	public void eat() {
		if (this.getHealth()==100) {
			System.out.println("旺财的健康值已经爆表啦....不用吃啦~");
			return;
		}
		System.out.println("旺财吃肉啦.....");
		this.setHealth(getHealth()+3);
	}
	
}
