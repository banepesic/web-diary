package com.brolly.diary.service;

import java.util.List;

import com.brolly.diary.domain.DiaryEntry;

/**
 * defines CRUD operations on all domain objects
 * @author Bane
 *
 */

public interface CrudService {

	public String sayHello(String name);
	
	/*DIARY ENTRY section*/

	public DiaryEntry findOne(Integer entryID);

	public List<DiaryEntry> getAllDiaryEntries();

	public Integer saveDiaryEntry(DiaryEntry entry);

	public void updateDiaryEntry(Integer entryID);

	public void deleteDiaryEntry(Integer entryID);

	/*Other resource section*/
	/* 
	 * public SomeDomainObject fineOne(Integer domainObjID); 
	 * ...
	 * */
	
}
