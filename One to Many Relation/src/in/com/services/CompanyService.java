/*Create CompanyDTO and VendorDTO and make one to many relation.
Create a CompanyService and perform CRUD operation.
Apply Optimizing Data Access using lazy fetching.*/

package in.com.services;

import in.com.dto.CompanyDTO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CompanyService {

	public void add(CompanyDTO dto) {
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(dto);
		tx.commit();
		s.close();
	}

	public void update(CompanyDTO dto) {
		System.out.println(dto.getId());
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(dto);
		transaction.commit();
		session.close();
	}

	public void delete(CompanyDTO dto) {
		int i = dto.getId();
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(dto);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		ArrayList arrayList = new ArrayList();
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		Query query = session.createQuery("from CompanyDTO");
		arrayList = (ArrayList) query.list();
		return arrayList;
	}

	public CompanyDTO get(int id) {
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		CompanyDTO dto = (CompanyDTO) session.get(CompanyDTO.class, id);
		dto.getVendors().size();
		session.close();
		return dto;
	}

}