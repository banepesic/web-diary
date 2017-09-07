package com.brolly.diary.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.brolly.diary.dao.hibernate.HibernateUtil;
import com.brolly.diary.domain.DiaryEntry;
import com.brolly.diary.service.CrudService;

/**
 * DiaryEntry CRUD operations impl. 
 * @author Bane
 *
 */
@WebService(endpointInterface = "com.brolly.diary.service.CrudService")
public class CopyOfCrudServiceImpl implements CrudService{

	/*TODO - if needed
	@Inject
    private CrudRepository CrudRepositoryImpl;
	*/
	
	public CopyOfCrudServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String sayHello(String name) {
		return "1Hello dear: " + name;
	}
	
	public DiaryEntry findOne(Integer entryID) {
		System.out.println("****");
		Session session = HibernateUtil.getSessionFactory().openSession();
		DiaryEntry entry = null;
		entry = (DiaryEntry)session.get(DiaryEntry.class, entryID);
		return entry;
	}

	public List<DiaryEntry> getAllDiaryEntries() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<DiaryEntry> entryList = null;

		try {
			transaction = session.beginTransaction();
			entryList = session.createQuery("FROM DiaryEntry d order by date DESC").list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return entryList;

	}

	public Integer saveDiaryEntry(DiaryEntry entry) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		Integer entID= null;

		try {
			transaction = session.beginTransaction();
			entID = (Integer) session.save(entry);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return entID;
	}



	public void updateDiaryEntry(Integer entryID) {
		// use save-update

	}

	public void deleteDiaryEntry(Integer entryID) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			DiaryEntry entry = (DiaryEntry) session.get(DiaryEntry.class, entryID);
			session.delete(entry);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	

}
