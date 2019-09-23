package pers.JDBC.dao.impl;

import java.util.List;

import pers.JDBC.dao.IStudentDAO;
import pers.JDBC.domain.Student;
import pers.JDBC.template.JdbcTemplate;
import pers.JDBC.template.handler.BeanHandler;
import pers.JDBC.template.handler.BeanListHandler;



public class StudentDAOImpl implements IStudentDAO {
	public void save(Student student) {
		String sql = "INSERT INTO t_student(name,age) VALUES(?,?)";
		Object[] params = { student.getName(), student.getAge() };
		int i = JdbcTemplate.update(sql, params);
		System.out.println(i == 1 ? ("保存成功,影响行数:" + i) : ("保存失败"));
	}

	public void delete(Long id) {
		String sql = "DELETE FROM t_student WHERE id = ?";
		int i = JdbcTemplate.update(sql, id);
		System.out.println(i == 1 ? ("删除成功,影响行数:" + i) : ("删除失败,无此id"));
	}

	public void update(Long id, Student student) {
		String sql = "UPDATE t_student SET name = ?,age = ? WHERE id = ?";
		Object[] params = { student.getName(), student.getAge(), id };
		int i = JdbcTemplate.update(sql, params);
		System.out.println(i == 1 ? ("更新成功,影响行数:" + i) : ("更新失败,无此id"));
	}

	public Student get(Long id) {
		String sql = "SELECT * FROM t_student WHERE id = ?";
		return JdbcTemplate.query(sql, new BeanHandler<>(Student.class), id);
	}

	public List<Student> list() {
		String sql = "SELECT * FROM t_student";
		return JdbcTemplate.query(sql, new BeanListHandler<>(Student.class));
	}
}
