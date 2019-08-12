/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190809.exam.test2 
 * @author: 金聖聰   
 * @date: 2019年8月9日 上午9:40:16 
 */
package kh75.day190809.exam.test2;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Printer.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月9日 上午9:40:16 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月9日     金聖聰           v1.0.0               修改原因
*/
public class Printer implements InkBox,Paper {
	@Override
	public void showPaper() {
		System.out.println("纸张连接成功");
	}
	@Override
	public void showInkBox() {
		System.out.println("墨盒连接成功");
		
	}
}
