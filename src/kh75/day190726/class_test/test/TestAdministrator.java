/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190726.class_test.test 
 * @author: 金聖聰   
 * @date: 2019年7月26日 上午11:04:07 
 */
package kh75.day190726.class_test.test;

import kh75.day190726.class_test.entity.Administrator;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestAdministrator.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月26日 上午11:04:07 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月26日     金聖聰           v1.0.0               修改原因
*/
public class TestAdministrator {
	public static void main(String[] args) {
		Administrator a = new Administrator();
		a.setName("admin1");
		a.setPassWord("111111");
		a.getInfo();
		Administrator b = new Administrator();
		b.setName("admin2");
		b.setPassWord("222222");
		b.getInfo();
		
	}
}
