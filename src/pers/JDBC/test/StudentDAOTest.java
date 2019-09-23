package pers.JDBC.test;

import java.util.List;

import org.junit.Test;

import pers.JDBC.dao.IStudentDAO;
import pers.JDBC.dao.impl.StudentDAOImpl;
import pers.JDBC.domain.Student;


public class StudentDAOTest {

	// 依赖DAO对象
	private IStudentDAO dao = new StudentDAOImpl();

	@Test
	public void testSave() {
		Student student = new Student();
		student.setName("虚竹子");
		
		student.setAge(17);
		dao.save(student);
	}

	@Test
	public void testDelete() {
		dao.delete(2L);
	}

	@Test
	public void testUpdate() {
		Student student = new Student();
		student.setName("公主5");
		student.setAge(18);
		dao.update(1L, student);
	}

	@Test
	public void testGet() {
		Student stu = dao.get(1L);
		System.out.println(stu);
	}

	@Test
	public void testList() {
		List<Student> list = dao.list();
		for (Student s : list) {
			System.out.println(s);
		}
	}	
}
