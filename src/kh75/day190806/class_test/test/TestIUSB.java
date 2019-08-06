/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.class_test 
 * @author: 金聖聰   
 * @date: 2019年8月6日 上午10:01:34 
 */
package kh75.day190806.class_test.test;

import static org.junit.Assert.*;

import org.junit.Test;

import kh75.day190806.class_test.IUSB;
import kh75.day190806.class_test.impl.Disk;
import kh75.day190806.class_test.impl.Fan;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestIUSB.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 上午10:01:34 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class TestIUSB {
	@Test
	public void test01() throws Exception {
		IUSB usb = new Fan();
		usb.service();
		usb = new Disk();
		usb.service();
	}
}
