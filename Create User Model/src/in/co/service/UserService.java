package in.co.service;

import in.co.dto.UserDTO;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.mysql.jdbc.CallableStatement;
import com.sun.org.apache.regexp.internal.recompile;

public class UserService {
	private static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();

	public void add(UserDTO dto) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
	}

	public void update(UserDTO studentDTO) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(studentDTO);
		transaction.commit();
		session.close();
	}

	public void delete(UserDTO dto) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(dto);
		transaction.commit();
		session.close();
	}

	public UserDTO get(Integer rollNo) {
		Session session = sessionFactory.openSession();
		UserDTO dto = (UserDTO) session.get(UserDTO.class, rollNo);
		session.close();
		return dto;
	}

	public List getList() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from UserDTO");
		List userList = query.list();
		session.close();
		return userList;
	}

	public List search(UserDTO dto) {
		Session session = null;
		List list = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(UserDTO.class);
			if (dto != null) {
				if (dto.getId() > 0) {
					criteria.add(Restrictions.eq("id", dto.getId()));
				}
				if (dto.getFirstName() != null
						&& dto.getFirstName().length() > 0) {
					criteria.add(Restrictions.like("firstName",
							dto.getFirstName() + "%"));
				}

				if (dto.getLastName() != null && dto.getLastName().length() > 0) {
					criteria.add(Restrictions.like("lastName",
							dto.getLastName() + "%"));
				}
				if (dto.getEmail() != null && dto.getEmail().length() > 0) {
					criteria.add(Restrictions.like("email", dto.getEmail()
							+ "%"));
				}
				list = criteria.list();
			} else {
				list = getList();
			}

		} catch (HibernateException e) {

			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public UserDTO authenticate(String login, String password) {
		Session session = null;
		UserDTO dto = null;
		session = sessionFactory.openSession();
		Query q = session
				.createQuery("from UserDTO where email=? and password=? ");
		q.setString(0, login);
		q.setString(1, password);
		List list = q.list();
		if (list.size() > 0) {
			dto = (UserDTO) list.get(0);
		} else {
			dto = null;
		}

		return dto;
	}

	public Boolean changePassword(int id, String oldPassword, String newPassword)
			throws Exception {
		boolean b = false;
		try {
			UserDTO userDTO = get(id);
			if (oldPassword.equals(userDTO.getPassword())) {
				userDTO.setPassword(newPassword);
				update(userDTO);
				b = true;
			} else {
				System.out.println("old password: " + oldPassword
						+ " is not correct");
				System.out.println("please enter the correct password");
				// b = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

	public void lock(int id) throws Exception {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, 20);
		try {
			UserDTO userDTO = get(id);
			userDTO.setId(id);
			userDTO.setLastLoginDate(new Timestamp(new Date().getTime()));
			userDTO.setLockk(true);
			userDTO.setStatus(0);
			update(userDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
