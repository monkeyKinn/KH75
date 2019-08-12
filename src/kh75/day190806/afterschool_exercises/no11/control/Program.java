/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.afterschool_exercises.no11.control 
 * @author: 金聖聰   
 * @date: 2019年8月6日 下午3:59:44 
 */
package kh75.day190806.afterschool_exercises.no11.control;

import kh75.day190806.afterschool_exercises.no11.service.IPerformerable;
import kh75.day190806.afterschool_exercises.no11.service.impl.Dancer;
import kh75.day190806.afterschool_exercises.no11.service.impl.Player;
import kh75.day190806.afterschool_exercises.no11.service.impl.Singer;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Program.java
* @Description: 节日
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 下午3:59:44 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class Program {
	/**
	 * 表示表演这个节目的所需要的演员
	 */
	private IPerformerable[] ps;

	
	public Program() {
		ps = new IPerformerable[3];
		ps[0] = new Singer();
		ps[1] = new Dancer();
		ps[2] = new Player();
	}
	public void show(){
		for (IPerformerable iPerformerable : ps) {
			iPerformerable.perform();
		}
	}
	
}
