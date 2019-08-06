/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190801.afterschool_exercises.car_rental.son 
 * @author: 金聖聰   
 * @date: 2019年8月5日 下午6:14:39 
 */
package kh75.day190801.afterschool_exercises.car_rental.son;

import kh75.day190801.afterschool_exercises.car_rental.father.Pet;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Master.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月5日 下午6:14:39 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月5日     金聖聰           v1.0.0               修改原因
*/
public class Master {
	public void play(Pet pet){
		if (pet instanceof Dog) {
			Dog d = (Dog) pet;
			d.catchingFlyDisc();
			d.print();
		} else if(pet instanceof Penguin){
			Penguin p = (Penguin) pet;
			p.swimming();
			p.print();
		}
	}
}
