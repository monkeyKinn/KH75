/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test3 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午9:49:20 
 */
package kh75.day190809.exam.test3;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TheftproofDoor.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午9:49:20 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class TheftproofDoor extends Door implements Lock,Doorbell{
	@Override
	public void lockUp() {
		System.out.println("上锁了");
	}
	@Override
	public void openLock() {
		System.out.println("锁开了");
	}

	@Override
	public void takePhoto() {
		System.out.println("卡擦  拍照");
		
	}
}
