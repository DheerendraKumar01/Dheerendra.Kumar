package com.example.springJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.springJdbc.entity.Student;

public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate temp;
	
	public int insert(Student student) {
		
		//insert query
		String query="insert into student(id,name,city)values(?,?,?)";
		int res=this.temp.update(query,student.getId(),student.getName(),student.getCity());
		return res;
	}
	
	public int change(Student student) {
		//update data
		String query="update student set name=?,city=? where id=?";
		int res = this.temp.update(query,student.getName(),student.getCity(),student.getId());
		return res;
	}
	public int delete(int id){
		//delete data
		String query="delete from student where id=?";
		int res=this.temp.update(query,id);
		return res;
	}
	
	
	public JdbcTemplate getTemp() {
		return temp;
	}
	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	

	  
}
