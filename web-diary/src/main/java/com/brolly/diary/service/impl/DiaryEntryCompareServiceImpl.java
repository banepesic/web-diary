package com.brolly.diary.service.impl;

import com.brolly.diary.domain.DiaryEntry;
import com.brolly.diary.service.CrudService;
import com.brolly.diary.service.DiaryEntryCompareService;
import com.brolly.diary.utils.AppException;
import com.brolly.diary.utils.DiffSeparator;
import com.brolly.diary.utils.DiffUtil;

public class DiaryEntryCompareServiceImpl implements DiaryEntryCompareService{

	private DiffSeparator diffSeparator;

	public DiaryEntryCompareServiceImpl(DiffSeparator diffSeparator) {
		//super();
		this.diffSeparator = diffSeparator;
	}
	
	public boolean compareEntries(DiaryEntry e1, DiaryEntry e2) {
		// TODO Auto-generated method stub
		return false;
	}

	public StringBuilder compareEntriesCreateDiffReport(int ent1id, int ent2id) throws AppException {
		
		CrudService crudService = new CrudServiceImpl();
		DiaryEntry entry1 = crudService.findOne(ent1id);
		DiaryEntry entry2 = crudService.findOne(ent2id);

		if(entry1 == null || entry2 == null){
			throw new AppException("Compare service error: cannot compare non existing diary entries!");
		} else{
			//DiffUtil.diffSentence2(entry1.getText(), entry2.getText(), getDiffSeparator().getSeparator());
			DiffUtil.diffSentence2(entry1.getTags() , entry2.getTags(), getDiffSeparator().getSeparator());
		}

		//TODO
		return null;
	}

	
	
	
	public DiffSeparator getDiffSeparator() {
		return diffSeparator;
	}

	public void setDiffSeparator(DiffSeparator diffSeparator) {
		this.diffSeparator = diffSeparator;
	}
	
	


}
