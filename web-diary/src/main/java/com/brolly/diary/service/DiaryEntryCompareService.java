package com.brolly.diary.service;

import com.brolly.diary.domain.DiaryEntry;
import com.brolly.diary.utils.AppException;

/**
 * Service for comparing DiaryEntries - to be used for 'diff-tool' API
 * @author Bane
 *
 */
public interface DiaryEntryCompareService {

	public boolean compareEntries(DiaryEntry e1, DiaryEntry e2);
	
	public StringBuilder compareEntriesCreateDiffReport(int ent1ID, int ent2ID) throws AppException;
	
}
