/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test4 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午10:02:50 
 */
package kh75.day190809.exam.test4;

import org.junit.Test;

import kh75.day190809.exam.test4.ui.MainUI;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestAll.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午10:02:50 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class TestAll {
	
	@Test
	public void test01() throws Exception {
		MainUI mainUI = new MainUI();
		mainUI.mains();
	}
}
