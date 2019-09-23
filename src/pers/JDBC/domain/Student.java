package pers.JDBC.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//学生对象
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("t_student")
public class Student {
	private Long id;// 主键
	@Column("name")
	private String name;// 名称
	@Column("age")
	private Integer age;// 年龄
}
