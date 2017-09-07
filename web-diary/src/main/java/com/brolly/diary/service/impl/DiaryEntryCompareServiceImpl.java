package com.brolly.diary.service.impl;

import com.brolly.diary.domain.DiaryEntry;
import com.brolly.diary.service.CrudService;
import com.brolly.diary.service.DiaryEntryCompareService;

public class DiaryEntryCompareServiceImpl implements DiaryEntryCompareService{

	public boolean compareEntries(DiaryEntry e1, DiaryEntry e2) {
		
		return false;
	}

	public String compareEntriesReport(DiaryEntry e1, DiaryEntry e2) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean findAndCompareEntries(int id1, int id2) {

		CrudService crudService = new CrudServiceImpl();
		DiaryEntry entry1 = crudService.findOne(id1);
		DiaryEntry entry2 = crudService.findOne(id2);

		return compareEntries(entry1,  entry2);
	}



}
