/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day190806.afterschool_exercises.no11.control 
 * @author: 金聖聰   
 * @date: 2019年8月6日 下午4:26:19 
 */
package kh75.day190806.afterschool_exercises.no11.control;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: Goldbach.java
* @Description: 哥德巴赫猜想
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月6日 下午4:26:19 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月6日     金聖聰           v1.0.0               修改原因
*/
public class Goldbach {
	private int[] a;
	private int aCopy;
	private int[] b;
	private int bCopy ;
	
	
	
	
	/**
	 * @return the aCopy
	 */
	public int getaCopy() {
		return aCopy;
	}

	/**
	 * @return the bCopy
	 */
	public int getbCopy() {
		return bCopy;
	}

	/**
	 * 
	* @Function: Goldbach.java
	* @Description: 这个数是否是质数
	*
	* @param: 一个数
	* @return：如果是质数,就返回这个质数,如果是  -1 不是质数
	* @throws：null
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年8月6日 下午4:27:03 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年8月6日     金聖聰           v1.0.0               修改原因
	 */
	private int prime(int n) {
		if (n < 2) {
			return -1;
		}
		if (n == 2 || n == 3) {
			return n;
		} else {
			int a = (int) Math.sqrt(n);
			for (int i = 2; i <= a; i++) {
				if (n % i == 0) {
					return -1;
				}
			}
			return n;
		}
	}

	private void setData(){
		//在a[]中寻找质数
		for (int i = 0; i < a.length; i++) {
			if(prime(a[i]) != -1 && prime(b[i]) != -1){//成对的质数
				aCopy = a[i];
				bCopy = b[i];
			}
		}
	}

	public void sumWithTheNum(int num) {
		//判断这个数是不是偶数 能被2整除的数 num % 2 == 0 num > 6
		if (num % 2 == 0 && num > 6) {
			a = new int[num];
			b = new int[num];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j <= b.length; j++) {
					if (i + j == num) {
						a[i] = i;
						b[i] = j;
					}
				}
			}
			setData();
			System.out.println(num+"="+getaCopy()+"+"+getbCopy());
			
		}else {
			if (num<=6) {
				System.out.println("输入小于6,再见");
			}else if(num % 2 != 0){
				System.out.println("输入的不是偶数,再见");
			}
			return;
		} 
	}

	public void show() {
		
	}
}
