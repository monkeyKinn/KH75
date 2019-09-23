package pers.JDBC.template.handler;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.sql.ResultSet;

import pers.JDBC.domain.Column;
import pers.JDBC.template.IResultSetHandler;



//把结果集中唯一的一条数据封装成一个JavaBean对象.
public class BeanHandler<T> implements IResultSetHandler<T> {
	//JavaBean对象的类型
	private Class<T> classType;
	public BeanHandler(Class<T> classType) {
		this.classType = classType;
	}
	public T handle(ResultSet rs) throws Exception {
		if(rs.next()){
			T obj = classType.newInstance();
			BeanInfo beanInfo = Introspector.getBeanInfo(classType,Object.class);
			PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
			for (PropertyDescriptor pd : pds) {
				String name = pd.getName();//属性名称(列名)
				
				//==============判断是否有注解=============
				String fieldName = name;
				Field field = classType.getDeclaredField(name);
				//判断是否有注解
				if(field.isAnnotationPresent(Column.class)){
					Column co = field.getAnnotation(Column.class);
					fieldName = co.value();
				}
				//=======================================
				//获取该列的值
				Object value = rs.getObject(fieldName);
				//调用属性的setter方法,给对象设置数据
				pd.getWriteMethod().invoke(obj, value);
			}
			return obj;
		}
		return null;
	}
}
