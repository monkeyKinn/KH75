package pers.JDBC.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pers.JDBC.util.JdbcUtil;

//JDBC的操作模板
public class JdbcTemplate {
	private JdbcTemplate() {
	}

	/**
	 * DQL操作模板
	 * @param sql	 DQL操作具体的SQL,SELECT
	 * @param params SQL中占位符对应的参数
	 * @return	
	 */
	public static <T>T query(String sql, IResultSetHandler<T> rsh,Object... params) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConn();
			ps = conn.prepareStatement(sql);
			// 设置占位符参数
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			rs = ps.executeQuery();
			//处理结果集
			return rsh.handle(rs);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return null;
	}

	/**
	 * DML操作模板
	 * @param sql	DML 操作具体的SQL,可以INSERT,UPDATE,DELETE
	 * @param params	SQL中占位符对应的参数
	 * @return			受影响的行数
	 */
	public static int update(String sql, Object... params) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = JdbcUtil.getConn();
			ps = conn.prepareStatement(sql);
			// 设置占位符参数
			for (int i = 0; i < params.length; i++) {
				ps.setObject(i + 1, params[i]);
			}
			return ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, null);
		}
		return 0;
	}

}
