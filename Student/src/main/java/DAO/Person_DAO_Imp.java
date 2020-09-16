package DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import Model.Person;
@Repository
public class Person_DAO_Imp implements Person_DAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean savePerson(Person person) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(person);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	

	@Override
	public List<Person> getPersons() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Person> query=currentSession.createQuery("from Person", Person.class);
		List<Person> list=query.getResultList();
		return list;
	}
	@Override
	public boolean deletePerson(Person person) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(person);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	

	@Override
	public List<Person> getPersonByID(Person person) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Person> query=currentSession.createQuery("from Tier where idTier=:idTier", Person.class);
		query.setParameter("idTier", person.getIdTier());
		List<Person> list=query.getResultList();
		return list;
	}
	@Override
	public boolean updatePerson(Person person) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(person);
			status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	@Override
	  public Person findById(Integer id) {
	        Session session = this.sessionFactory.getCurrentSession();
	        return session.get(Person.class, id);
	    }
}
