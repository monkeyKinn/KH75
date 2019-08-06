/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.class_test.test 
 * @author: 金聖聰   
 * @date: 2019年8月6日 上午11:09:45 
 */
package kh75.day190806.class_test.test;

import static org.junit.Assert.*;

import org.junit.Test;

import kh75.day190806.class_test.father.Handset;
import kh75.day190806.class_test.son.AptitudeHandset;
import kh75.day190806.class_test.son.CommonHandset;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestMobile.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 上午11:09:45 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class TestMobile {
	@Test
	public void test01() throws Exception {
		Handset handset = new CommonHandset("索尼","G520");
		if (handset instanceof CommonHandset) {
			System.out.println("这是一款"+handset.getBrand()+handset.getType()+"手机");
			CommonHandset c = (CommonHandset) handset;
			c.play("放<热雪>");
			c.sendInfo();
			c.call();
		}
		System.out.println("----------------------------");
		handset = new AptitudeHandset("HTC","I9100");
		if (handset instanceof AptitudeHandset) {
			System.out.println("这是一款"+handset.getBrand()+"的"+handset.getType()+"手机");
			AptitudeHandset c = (AptitudeHandset) handset;
			c.network();
			c.play("放<你一定要幸福>");
			c.takePictures();
			c.sendInfo();
			c.call();
		}
		
		
	}
}
