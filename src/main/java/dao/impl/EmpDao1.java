package dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import dao.EmpDao;
import pojo.Emp1;

@Repository
public class EmpDao1 implements EmpDao {

	@Autowired
	private SessionFactory sf;
	

	@Override
	public List<Emp1> selectAll() {
		Session session = sf.getCurrentSession();
		SQLQuery query = session.createSQLQuery("select * from emp1").addEntity(Emp1.class);
		List list = query.list();
		return list;
	}


}
