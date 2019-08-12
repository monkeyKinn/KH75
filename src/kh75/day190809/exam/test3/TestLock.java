/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test3 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午9:50:30 
 */
package kh75.day190809.exam.test3;

import static org.junit.Assert.*;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestLock.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午9:50:30 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class TestLock {
	@Test
	public void test01() throws Exception {
		TheftproofDoor t = new TheftproofDoor();
		t.openLock();
		t.open();
		t.close();
		t.takePhoto();
		t.lockUp();
	}
}
