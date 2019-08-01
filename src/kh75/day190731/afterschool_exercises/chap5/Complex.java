/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：Chap5 练习包
 * @Package: kh75.day190731.afterschool_exercises.chap5 
 * @author: 金聖聰   
 * @date: 2019年8月1日 下午7:07:51 
 */
package kh75.day190731.afterschool_exercises.chap5;

import java.math.BigDecimal;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: 类Complex.java
* @Description: Chap5 No15
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月1日 下午7:07:51 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月1日     金聖聰           v1.0.0               修改原因
*/
public class Complex {
	/*这个复数类具有两个属性：
	 * 		double real，表示实部；
	 * 		double im，表示虚部。
	 * 并为Complex 类增加add(加)、sub(减)、mul(除) 方法，分别表示复数的加法、减法和乘法运算。
	 * 其中，add 方法的声明如下： 
				public Complex add(Complex c) //表示当前Complex 对象与参数c 对象相加 
				public Complex add(double real) //表示当前Complex 对象与实数real 相加*/
	/**
	 * 实部
	 */
	double real;
	/**
	 * 虚部
	 */
	double im;

	/**
	 * 
	* @Function: Complex.java
	* @Description: 表示当前Complex 对象与参数c 对象相加
	*		运算时实部与实部相加，虚部与虚部相加。例如： 
	*			(1.5 – 3i) + (2.3 + 2.4i) = (1.5+2.3) + (-3 + 2.4)i = 3.8 – 0.6i 
	* @param: 复数类对象
	* @return：加运算后的那个复数对象
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月1日 下午7:15:16 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月1日     金聖聰           v1.0.0               修改原因
	 */
	public Complex add(Complex c) {
		Complex complex = new Complex();
		// double cReal = c.real;
		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal cBigReal = new BigDecimal(c.real).setScale(1,BigDecimal.ROUND_CEILING);
		
		// double cIm = c.im;
		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal cBigIm = new BigDecimal(c.im).setScale(1,BigDecimal.ROUND_CEILING);
		
		// double sumReal = this.real+cReal;
		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal thisBigReal = new BigDecimal(this.real).setScale(1,BigDecimal.ROUND_CEILING);
		//BigDecimal相加后,转成double
		double sumReal = thisBigReal.add(cBigReal).doubleValue();

		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal thisBigIm = new BigDecimal(this.im).setScale(1,BigDecimal.ROUND_CEILING);
		//BigDecimal相加后,转成double
		double sumIm = thisBigIm.add(cBigIm).doubleValue();

		complex.real = sumReal;
		complex.im = sumIm;
		return complex;
	}

	/**
	 * 
	* @Function: Complex.java
	* @Description: 表示当前Complex 对象与实数real 相加
	*
	* @param: 实数 real ,如:3
	* @return：返回加运算后的复数对象
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月1日 下午7:17:47 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月1日     金聖聰           v1.0.0               修改原因
	 */
	public Complex add(double real) {
		Complex complex = new Complex();
		
		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal thisBigReal = new BigDecimal(this.real).setScale(1,BigDecimal.ROUND_CEILING);
	
		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal BigReal = new BigDecimal(real).setScale(1,BigDecimal.ROUND_CEILING);
		
		//BigDecimal相加后,舍去0,转成double
		double sumReal = thisBigReal.add(BigReal).doubleValue();

		complex.real = sumReal;
		complex.im = this.im;
		return complex;
	}

	public Complex sub(Complex c){

		Complex complex = new Complex();
		// double cReal = c.real;
		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal cBigReal = new BigDecimal(c.real).setScale(1,BigDecimal.ROUND_CEILING);
		
		// double cIm = c.im;
		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal cBigIm = new BigDecimal(c.im).setScale(1,BigDecimal.ROUND_CEILING);
		
		// double sumReal = this.real+cReal;
		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal thisBigReal = new BigDecimal(this.real).setScale(1,BigDecimal.ROUND_CEILING);
		//BigDecimal相减后,转成double
		double subReal = thisBigReal.subtract(cBigReal).doubleValue();

		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal thisBigIm = new BigDecimal(this.im).setScale(1,BigDecimal.ROUND_CEILING);
		//BigDecimal相减后,转成double
		double subIm = thisBigIm.subtract(cBigIm).doubleValue();

		complex.real = subReal;
		complex.im = subIm;
		return complex;
	
	}
	
	public Complex mul(Complex c){
		Complex complex = new Complex();
		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal thisBigIm = new BigDecimal(this.im).setScale(1,BigDecimal.ROUND_CEILING);
		// double sumReal = this.real+cReal;
		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal thisBigReal = new BigDecimal(this.real).setScale(1,BigDecimal.ROUND_CEILING);
		//BigDecimal相乘后,转成double
		// double cReal = c.real;
		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal cBigReal = new BigDecimal(c.real).setScale(1,BigDecimal.ROUND_CEILING);
		
		// double cIm = c.im;
		//转成BigDecimal 保留1位小数并舍入模式向正无穷大舍入
		BigDecimal cBigIm = new BigDecimal(c.im).setScale(1,BigDecimal.ROUND_CEILING);
		
		//BigDecimal相乘后,转成double  (thisBigReal*cBigReal-thisBigIm*cBigIm) + (thisBigReal*cBigIm+thisBigIm*cBigReal)i 
		double subReal = ((thisBigReal.multiply(cBigReal)).subtract((thisBigIm.multiply(cBigIm)))).doubleValue();

		double subIm = ((thisBigReal.multiply(cBigIm)).add((thisBigIm.multiply(cBigReal)))).doubleValue();

		complex.real = subReal;
		complex.im = subIm;
		return complex;
	
	}
}
