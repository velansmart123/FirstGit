package application.dao;

import application.entity.Students;

public interface StudentsDao {

	Students insert();
	
	Students retrieve(int a);
	
	void update();
	
	void delete();
	
	
}
