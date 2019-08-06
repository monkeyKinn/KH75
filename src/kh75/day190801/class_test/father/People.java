/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190801.class_test.father 
 * @author: 金聖聰   
 * @date: 2019年8月3日 下午4:15:17 
 */
package kh75.day190801.class_test.father;

import kh75.day190801.class_test.son.Cat;
import kh75.day190801.class_test.son.Dog;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: People.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月3日 下午4:15:17 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月3日     金聖聰           v1.0.0               修改原因
*/
public class People {
	public void goHospital(Pet p) {
		if (p instanceof Dog && p.getHealth() < 70) {
			System.out.println("带狗看病");
			return;
		}
		if (p instanceof Cat && p.getHealth() < 70) {
			System.out.println("带猫看病");
			return;
		}
	}
}
