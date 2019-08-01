/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75._4myself 
 * @author: 金聖聰   
 * @date: 2019年8月1日 下午8:54:16 
 */
package kh75._4myself;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Test3.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月1日 下午8:54:16 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月1日     金聖聰           v1.0.0               修改原因
*/
public class Test3 {
	@Test
	public void testBigDec() throws Exception {
		BigDecimal setScale = new BigDecimal(3.65).setScale(1);
//		System.out.println(setScale,BigDecimal.ROUND_CEILING );
	}
}
