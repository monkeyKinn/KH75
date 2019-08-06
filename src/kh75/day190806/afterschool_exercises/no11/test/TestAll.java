/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.afterschool_exercises.no11.test 
 * @author: 金聖聰   
 * @date: 2019年8月6日 下午3:47:53 
 */
package kh75.day190806.afterschool_exercises.no11.test;

import java.util.Scanner;
import static org.junit.Assert.*;

import org.junit.Test;

import kh75.day190806.afterschool_exercises.no11.control.Controller;
import kh75.day190806.afterschool_exercises.no11.control.Goldbach;
import kh75.day190806.afterschool_exercises.no11.control.Program;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestNo11.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 下午3:47:53 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class TestAll {
	Scanner in = new Scanner(System.in);
	@Test
	public void testNo11() throws Exception {
		Controller controller = new Controller();
		for (int i = 0; i < 3; i++) {
			controller.play(i);
			controller.stop(i);
			controller.open(i);
			System.out.println("----------------------------");
		}
	}
	@Test
	public void testNo12() throws Exception {
		Program program = new Program();
		program.show();
	}
	@Test
	public void testNo18() throws Exception {
		Goldbach g = new Goldbach();
		System.out.print("请输入一个大于6的整数:");
		int num = in.nextInt();
		g.sumWithTheNum(num);
		
	}
}
