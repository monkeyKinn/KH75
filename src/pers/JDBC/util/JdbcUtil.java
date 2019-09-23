package pers.JDBC.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class JdbcUtil {
	private static DataSource dataSource;
	//静态代码块,随着类的加载而加载,且只一次
	static {
		try {
			Properties p = new Properties();
			ClassLoader loader = Thread.currentThread().getContextClassLoader();
			InputStream inStream = loader.getResourceAsStream("db.properties");
			p.load(inStream);// 加载db.properties资源文件
			// Druid连接池
			dataSource = DruidDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	* @Function: JdbcUtil.java
	* @Description: 通过德鲁伊连接池加载数据库并获取连接
	*
	* @param: void
	* @return：连接对象
	* @throws：数据库连接异常
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年9月23日 下午1:15:16 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年9月23日     金聖聰           v1.0.0               修改原因
	 */
	public static Connection getConn() {
		try {
			return dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		throw new RuntimeException("数据库连接异常");
	}

	/**
	 * 
	* @Function: JdbcUtil.java
	* @Description: 关闭打开的资源
	*
	* @param: 链接对象,语句对象,结果集对象
	* @return：void
	* @throws：关闭资源异常
	*
	* @version: v1.0.0
	* @author: 金聖聰
	* @date: 2019年9月23日 下午1:14:11 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2019年9月23日     金聖聰           v1.0.0               修改原因
	 */
	public static void close(Connection conn, Statement st, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	private JdbcUtil() {}
}
