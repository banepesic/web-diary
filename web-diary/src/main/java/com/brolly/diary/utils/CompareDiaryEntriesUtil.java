package com.brolly.diary.utils;

import com.brolly.diary.domain.DiaryEntry;
/**
 * HELP DOC: 
 *  <BR>
 * 	Lexicographic ordering: 
 * 			If two strings are different, then either 
 * 				they have different characters at some index that is a valid index for both strings,
 * 				 or their lengths are different, or both.
 *	<BR>
 * STRING SPLIT:
 * 		
 * 		SYSTEM LINE SEPARATOR:  String separator = System.getProperty("line.separator");
		
		SKIP EMPTY LINES: String.split("[\\r\\n]+")  
 * 
 * @author Bane
 *
 */

public class CompareDiaryEntriesUtil {

	static DiffActions diffActions;

	public static String compareEntriesCreateDiff(DiaryEntry e1, DiaryEntry e2){

		StringBuilder sb = new StringBuilder();

		System.out.println(diffSimpleTest(e1.getTags(), e2.getTags()));

		return sb.toString();
	}
	/*

	 */ 
	private static int diffSimpleTest (String s1, String s2){

		int res = -99;

		if(s1 == null || s1 == null){
			return res;
		}

		//boolean eof = true;
		//while(eof == false){
		res = s1.compareTo(s2);

		switch (res) {
		case -1:
			System.out.println("s1 < s2");
			break;
		case 1:
			System.out.println("s1 > s2");
			break;	
		default: //0
			System.out.println("s1 equals s2");
			break;
		}
		//}

		return res;

	}


	public static void actionDetails(DiffActions act, int lineNum) {
		
		switch (act) {
		case ADD :
			System.out.println(act.ADD.getAction() + " #" + lineNum );
			break; 

		case CHANGE:
			System.out.println(act.CHANGE.getAction() + " #" + lineNum );
			break;

		case DELETE:
			//case :
			System.out.println(act.DELETE.getAction() + " #" + lineNum );
			break;

		default: 
			System.out.println(act.IDENTICAL.getAction() + " #" + lineNum );
			break;
		}
	}

	public static String compareLineByLine(String[] mutlineStr1, String[] mutlineStr2){
		
		StringBuilder sb = new StringBuilder();
		for(String line1: mutlineStr1){
			for(String line2 : mutlineStr2){
				int diffSimpleTest = diffSimpleTest(line1, line2);
				sb.append(String.valueOf(diffSimpleTest));
				sb.append("|");
			}
		}
		
		//TODO map output
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		//System.out.println(str);
		
		diffSimpleTest("b", "a");
		
		/**********/
		actionDetails(DiffActions.ADD, 2);
		actionDetails(DiffActions.CHANGE, 32);
		actionDetails(DiffActions.DELETE, 33);
		actionDetails(DiffActions.IDENTICAL, 44);
		
		/*************/
		String separator = System.getProperty("line.separator");
		
		String str1 = "The quick brown " + separator +  "fox jumps over" + separator + "the lazy dog";
		System.out.println(str1);
		String str2 = "The slow brown " + separator +  "fox jumps over" + separator + "the lazy dog" + separator + "every day";
		
		
		//Use: String.split("[\\r\\n]+")  to skip empty lines
		String[] strArr1 = str1.split(separator);
		String[] strArr2 = str2.split(separator);
		
		System.out.println(compareLineByLine(strArr1,strArr2));
		
		/**/
		//str1.contentEquals(sb))
		
		//TODO consider Comparable Interface
		
		/* IDENTICAL CHECK OF String
		 *  private boolean nonSyncContentEquals(AbstractStringBuilder sb) {
        char v1[] = value;
        char v2[] = sb.getValue();
        int n = v1.length;
        if (n != sb.length()) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (v1[i] != v2[i]) {
                return false;
            }
        }
        return true;
    }
		 */
		
	}
}
