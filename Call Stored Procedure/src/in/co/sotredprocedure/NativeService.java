package in.co.sotredprocedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NativeService {
		public void getlist() throws SQLException{
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.getNamedQuery("sachin");
			Connection connection=session.connection();
			//Statement query=connection.createStatement();
			CallableStatement callStmt=connection.prepareCall("{CALL mark(?)}");
			callStmt.registerOutParameter(1, Types.INTEGER);
			 
			callStmt.execute();
			int count = callStmt.getInt(1);
			System.out.println(count);
	}
}
