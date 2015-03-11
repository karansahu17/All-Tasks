package in.co.service;

import in.co.dto.EmployeeDTO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeService {
	private static SessionFactory factory = new Configuration().configure()
			.buildSessionFactory();

	public int addEmployee(EmployeeDTO dto) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		int i = (int) session.save(dto);
		transaction.commit();
		session.close();
		return i;
	}

	/*
	 * public List listEmplyoyee() { ArrayList dtos = new ArrayList<>(); Session
	 * session = factory.openSession(); String sql =
	 * "SELECT * FROM employeedto"; SQLQuery query =
	 * session.createSQLQuery(sql); query.addEntity(EmployeeDTO.class); // Query
	 * query = session.createQuery("from EmployeeDTO"); dtos = (ArrayList)
	 * query.list(); return dtos; }
	 */

	public List listEmplyoyee() {
		ArrayList dtos = new ArrayList<>();
		Session session = factory.openSession();
		String sql = "SELECT * FROM employeedto";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(EmployeeDTO.class);
		// Query query = session.createSQLQuery(sql);
		dtos = (ArrayList) query.list();
		return dtos;
	}
}
