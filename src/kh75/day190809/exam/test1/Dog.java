/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test1 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午9:27:21 
 */
package kh75.day190809.exam.test1;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Dog.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午9:27:21 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class Dog extends Pet{
	@Override
	void play() {
		//接飞盘游戏，狗狗健康值减少10，与主人亲密度增加5
		System.out.println("旺财终于和主人玩飞盘啦....");
		this.setHealth(getHealth()-10);
		this.setLove(getLove()+5);
	}
}
