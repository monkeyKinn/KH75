package pers.JDBC.template;

import java.sql.ResultSet;

//指定结果集处理器的规范
public interface IResultSetHandler<T> {
	/**
	 * 处理结果集
	 * @param rs		结果集对象
	 * @return			处理结果集之后返回的对象(单个对象/集合对象)
	 */
	T handle(ResultSet rs) throws Exception;
}
