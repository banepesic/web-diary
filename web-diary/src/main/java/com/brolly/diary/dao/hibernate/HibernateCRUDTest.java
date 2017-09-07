package com.brolly.diary.dao.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.brolly.diary.domain.DiaryEntry;

/**
 * CRUD operations tests on DB diary, table diary_entry with Hibernate API's
 * 
 */
public class HibernateCRUDTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		System.out.println("Hibernate version: " + org.hibernate.Version.getVersionString());
		HibernateCRUDTest appDemo = new HibernateCRUDTest();

		/* Save few entries */
		DiaryEntry e1 = new DiaryEntry(new Date(), "school;books; learning", "some tex #1 \n some text#1 some tex #1 \n some text#1");
		DiaryEntry e2 = new DiaryEntry(new Date(), "vacation;visa", "some tex #2 \n some text#2 some tex #2 \n some text#2");
		DiaryEntry e3 = new DiaryEntry(null, "car;insurance;bday", "some tex #3 \n some text#3 some tex #3 \n some text#3");
		
		int e1_ID = appDemo.saveDiaryEntry(e1);
		int e2_ID = appDemo.saveDiaryEntry(e2);
		int e3_ID = appDemo.saveDiaryEntry(e3);
		
		/* Retrieve and print all entry values - after deletion*/
		List<DiaryEntry> entries = appDemo.getAllEntries();
		String listAllMsg = "Listing all diary entries";
		printEntries(entries,listAllMsg);
		
		/* Update an entry */
		final String newDiaryText = "...now diary entry has fresh value"; 
		appDemo.updateDiaryEntry(e2_ID, newDiaryText);

		/* Deletes an object */
		appDemo.deleteDiaryEntry(e2_ID);

		/* Retrieve and print all entry values - after deletion*/
		List<DiaryEntry> remaingEntries = appDemo.getAllEntries();
		String listAfterDelMsg = "List of all remained entries";
		printEntries(remaingEntries, listAfterDelMsg);

	}

	/** save Diary Entry */
	public final int saveDiaryEntry(final DiaryEntry entry) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		int id = (Integer) session.save(entry);
		session.getTransaction().commit();
		return id;
	}
	

	/**
	 * get all Diary enteries in DESC order of date
	 * @return
	 */
	public List<DiaryEntry> getAllEntries() {
		
		Session session = null;
		Transaction tx = null;
		try {
			 session = HibernateUtil.getSessionFactory().openSession();
			 tx = session.beginTransaction();
			
			List<DiaryEntry> entryList = session.createQuery("FROM DiaryEntry d order by date DESC").list();
			return entryList;
		} finally {
			tx.commit();
			session.close();
			
		}
		
	}

	/** update Diary entry - text */
	public void updateDiaryEntry(int id, String entryText) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DiaryEntry entry = (DiaryEntry) session.get(DiaryEntry.class, id);
		System.out.println("Entry text before update: " + entry.getText()); 
		//update text of entry
		entry.setText(entryText);
		//session.update(entry);//No need to update manually as it will be updated automatically on transaction close.
		session.getTransaction().commit();
	}
	

	/**Deletes a DiaryEntry*/
	public void deleteDiaryEntry(Integer id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		DiaryEntry entry = (DiaryEntry) session.get(DiaryEntry.class, id);
		session.delete(entry);
		session.getTransaction().commit();
	}

	private static void printEntries(final List<DiaryEntry> entries, String msg) {
		System.out.println(msg);
		
		if(entries != null && entries.size() > 0){
			System.out.println("There are: " + entries.size() + " diary entries");
		}
		for (DiaryEntry entry : entries) {
			System.out.println("Persisted Entries :" + entry);
		}
		
	}
}
