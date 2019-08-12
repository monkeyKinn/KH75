/**   
 * Copyright © 2019 金聖聰. All rights reserved.
 * 
 * 功能描述：
 * @Package: kh75.day1908010.class_test.test 
 * @author: 金聖聰   
 * @date: 2019年8月10日 下午2:54:10 
 */
package kh75.day1908010.class_test.test;

import java.util.LinkedList;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import kh75.day1908010.class_test.entity.Dog;

/**   
* Copyright: Copyright (c) 2019 金聖聰
* 
* @ClassName: TestAll.java
* @Description: 该类的功能描述
*
* @version: v1.0.0
* @author: 金聖聰
* @date: 2019年8月10日 下午2:54:10 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2019年8月10日     金聖聰           v1.0.0               修改原因
*/
public class TestAll {
	@Test
	public void test01() throws Exception {
		Dog d = new Dog("童童","哈士奇");
		Dog d1 = new Dog("治治","金毛");
		List<Dog> list = new ArrayList<>();
		list.add(d);
		list.add(0,d1);
//		list.remove(d);
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			Dog dog = (Dog)list.get(i);
			System.out.println(dog.toString());
		}
		System.out.println(list.contains(d));
	}
	@Test
	public void test02() throws Exception {
		Dog d = new Dog("童童","哈士奇");
		Dog d1 = new Dog("治治","金毛");
		List<Dog> list = new LinkedList<>();
		LinkedList<Dog> linkList = (LinkedList)list;
		linkList.add(d);
		linkList.addFirst(d1);
		System.out.println(linkList.getLast());
	}
	@Test
	public void test03() throws Exception {
		Dog d1 = new Dog("童童","哈士奇");
		Dog d2 = new Dog("治治","金毛");
		Dog d3 = new Dog("军军","哈士奇");
		Dog d4 = new Dog("野野","金毛");
		Dog d5 = new Dog("毛毛","哈士奇");
		Dog d6 = new Dog("心心","金毛");
		List<Dog> list = new LinkedList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
//		list.add(3, d4);
		LinkedList<Dog> linkList = (LinkedList)list;
//		linkList.addFirst(d5);
		linkList.add(1, d6);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	@Test
	public void test04(){
		//创建对象
		Map map = new HashMap();
		map.put("CN", "中国");
		map.put("HK","香港");
		map.put("USA","美国");
		Set entrySet = map.entrySet();
		System.out.println(entrySet);
		System.out.println(map.get("USA"));
		System.out.println(map.containsKey("USA"));
		map.remove("USA");
		System.out.println(map.size());
		System.out.println(map.values());
		System.out.println(map.keySet());
	}
	@Test
	public void test05() throws Exception {
		Dog ouou = new Dog("欧欧","哈士奇");
		Dog yaya = new Dog("亚亚","阿拉斯加");
		Dog feifei = new Dog("菲菲","萨摩亚");
		Dog meimei = new Dog("美美","萨摩亚");
		Map map = new HashMap();
		map.put(ouou.getName(),ouou);
		map.put(yaya.getName(), yaya);
		map.put(feifei.getName(), feifei);
		
/*		//获取key集合 用迭代器
		Set keySet = map.keySet();
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			//如果有值,进行循环获取key and  value
			String key = (String) it.next();
			//获取value
			Dog dog = (Dog) map.get(key);
			System.out.println(dog.getName()+" "+dog.getStrain());
		}*/
		
		//用fore
		Set keySet = map.keySet();
		for (Object s : keySet) {
			Dog dog = (Dog) map.get(s);
			System.out.println(dog.getName() + " " + dog.getStrain());
		}
		
	}
}
