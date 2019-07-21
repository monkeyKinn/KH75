/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：第一个练习包
 * @Package: kh75.day190712.test00 
 * @author: 金聖聰   
 * @date: 2019年7月12日 上午9:59:10 
 */
package kh75.day190712.test00;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Test01.java
* @Description: 练习类
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年7月12日 上午9:59:10 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年7月12日     金聖聰           v1.0.0               修改原因
*/
public class PersonInfoAndPrintStars {
	public static void main(String[] args) {
		System.out.println("---------个人信息-----------");
		personalInfor();
		System.out.println("\n---------爱心练习-----------");
		printStar();
	}

	/**
	 * 
	* @Function: Test01.java
	* @Description: 个人信息
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月12日 上午10:00:07 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月12日     金聖聰           v1.0.0               修改原因
	 */
	private static void personalInfor() {
		String name = "金圣聪";
		String sex = "男";
		String nativePlace = "江苏常州";
		String address = "常州天宁郑陆省岸朱家桥10号";

		System.out.println("name:" + name + "\n" + "Sex:" + sex + "\n" + "NativePlace:" + nativePlace + "\n"
				+ "Address:" + address);
	}

	/**
	 * 
	* @Function: Test01.java
	* @Description: 练习爱心
	*
	* @param: null
	* @return：void
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年7月12日 上午10:00:41 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年7月12日     金聖聰           v1.0.0               修改原因
	 */
	private static void printStar() {
		System.out.println("      *                                                             *     ");
		System.out.println("*                 *                                        *            *");
		System.out.println(" *                                                                   * ");
		System.out.println("    *                          I LOVE U                            * ");
		System.out.println("      *                                                           * ");
		System.out.println("        *                                                       * ");
		System.out.println("         *                                                    * ");
		System.out.println("            *                                                * ");
		System.out.println("              *                                            * ");
		System.out.println("                 *                                        * ");
		System.out.println("                   *                                    * ");
		System.out.println("                     *                                * ");
		System.out.println("                       *                            * ");
		System.out.println("                         *                        * ");
		System.out.println("                           *                    * ");
		System.out.println("                             *                 * ");
		System.out.println("                              *             * ");
		System.out.println("                                *        * ");
		System.out.println("                                   *   * ");
	}
}
