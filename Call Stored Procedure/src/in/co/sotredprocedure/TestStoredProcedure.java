package in.co.sotredprocedure;

import in.co.dto.UserDTO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestStoredProcedure {

	public static void main(String[] args) throws SQLException {
		System.out.println("By NativeSQL" + nativesql());// by nativeSql
		System.out.println("By CallableStatement" + callByCallableStatement());// by_callable_statement
	}

	public static int nativesql() {
		Session session = null;
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();
		Query query = session.createSQLQuery("CALL userList()").addEntity(
				UserDTO.class);
		List list = query.list();
		return list.size();
	}

	public static int callByCallableStatement() throws SQLException {
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		Connection connection = session.connection();
		CallableStatement callStatement = connection
				.prepareCall("{CALL userCount(?)}");
		callStatement.registerOutParameter(1, Types.INTEGER);
		callStatement.execute();

		int count = callStatement.getInt(1);

		return count;
	}

}
