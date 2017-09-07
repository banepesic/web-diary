package com.brolly.diary.service;

import com.brolly.diary.domain.DiaryEntry;

/**
 * Service for comparing DiaryEntries - to be used for 'diff-tool' API
 * @author Bane
 *
 */
public interface DiaryEntryCompareService {

	public boolean compareEntries(DiaryEntry e1, DiaryEntry e2);
	
	public boolean findAndCompareEntries(int entry1ID, int entry2ID);
	
	public String compareEntriesReport(DiaryEntry e1, DiaryEntry e2);
}
