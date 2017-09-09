package com.brolly.diary.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.brolly.diary.service.DiaryEntryCompareService;
import com.brolly.diary.service.impl.DiaryEntryCompareServiceImpl;

/**

 Substrings are consecutive subsequences.

 For a n-element sequence of pairwise distinct letters there will be:
  	n(n+1)/2	 non-empty substrings 
  	2n^n-1 		 non-empty subsequences.

For example, for sequence abc we have

    substrings:   a, ab, abc, b, bc, c, and the empty substring;
    subsequences: a, b, ab, c, ac, bc, abc, and the empty subsequence.  (notice ac element)

When the letters are repeated, some substrings and subsequences will look the same,
 however, make sure to check with the definition you were given if the author considers them the same or not.
<BR>

 *****
 LCS
 *****	
	 The longest common subsequence (LCS) problem is the problem of finding the longest subsequence
	  common to all sequences in a set of sequences (often just two sequences). 

	  It differs from problems of finding common substrings: unlike substrings, 
	  subsequences are not required to occupy consecutive positions within the original sequences.

 **********
PROBLEM
 **********
 *
 *
 *In this problem, given two sequences of items:

       I	a b c d f g h j q z

       II	a b c d e f g i j k r x y z

and we want to find a longest sequence of items that is present in both original sequences in the same order. 
That is, we want to find a new sequence which can be obtained from the first original sequence by deleting some items,
 and from the second original sequence by deleting other items.
  We also want this sequence to be as long as possible: 

	LCS		a b c d f g 	j 	  z

       I	a b c d f g [h] j [q] z					--

     II	a b c d [e] f g [i] j [k] [r] [x] [y] z		++

From a longest common subsequence it is only a small step to get diff-like output:
 if an item is absent in the subsequence but present in the first original sequence,
  	it must have been DELETED (as indicated by the '–' marks, below).


  If it is absent in the subsequence but present in the second original sequence,
   	it must have been ADDED (as indicated by the '+' marks).


       e   h i   q   k r x y
       +   - +   -   + + + +

**********
 
 
 Problem: INSERATION -   In line containing several sentences, a new sentence has been inserted between 2 existing.
   
  For example for the following two documents:
		
	S1:	Apples are green. Bananas are not cheap. 

			and

	S2: Apples are green. Kiwi is really fresh. Bananas are not cheap.

	Solution should be able to look ahead to recognise that in the second (S2), 
						 "Bananas are not cheap"
						 ...has NOT been replaced by.. 
						 "Kiwi is really fresh"
	... but instead is untouched, and a new sentence inserted before it.
	 i.e. it should report the insertion of a sentence, not the changing of four words followed by a new sentence:
	 
	 Report : ++ 
	 			Apples are green. [Kiwi is really fresh.] Bananas are not cheap.

 * @author Bane
 *
 */

public class DiffUtil {

	public static String diff(String s1, String s2){
		char[] lcs = LongestCommonSubsequenceUtil.lcs(s1, s2, s1.length(), s2.length());
		
		for(int i = 0; i < s1.length(); i++ ){
			boolean found = false;
			for(int j =0; j < lcs.length; j++){
				if( s1.charAt(i) == lcs[j]){
					found = true;
					break;
				}
			}//for
			
			if(!found){
				System.out.println("missing: " + s1.charAt(i) + " at index: " + i );
			}
		}
		
		

		for(int i = 0; i < s2.length(); i++ ){
			boolean found = false;
			for(int j =0; j < lcs.length; j++){
				if( s2.charAt(i) == lcs[j]){
					found = true;
					break;
				}
			}//for
			
			if(!found){
				System.out.println("added char: " + s2.charAt(i) + " at index: " + i );
			}
		}
		
		//result array will have size : (s1.len - lcs.len) + (s1.len - lcs.len)
		
		
		return null;
	}
	
	
	/**
	 * 
	 * @param s1
	 * @param s2
	 * @param lineSeparator can be used as regex or simply empty String " "
	 */
	public static void diffSentence(final String s1, final String s2, final String wordSeparator){
		
		//System.getProperty("line.separator");
		String[] words1Arr = s1.split(wordSeparator);
		String[] words2Arr = s2.split(wordSeparator);
		
		for(int i = 0; i < words1Arr.length; i++ ){
			
			boolean found = false;
			for(int j = 0; j < words2Arr.length; j++){
				if( words1Arr[i].equals(words2Arr[j])){
					found = true;
					break;
				}
			}//for
			
			if(!found){
				System.out.println("missing word: " + words1Arr[i] + " at index: " + i );
			}
		}
		
		
		for(int i = 0; i < words2Arr.length; i++ ){
			
			boolean found = false;
			for(int j = 0; j < words1Arr.length; j++){
				if( words2Arr[i].equals(words1Arr[j])){
					found = true;
					break;
				}
			}//for
			
			if(!found){
				System.out.println("added word: " + words2Arr[i] + " at index: " + i );
			}
		}
	}
	
	public static void diffSentence2(final String s1, final String s2, final String separator){
		
		System.out.println("\nFinding diff between:\n " + s1 + "\n...and:\n" + s2);
		System.out.println("...using separator: " + 
		(separator.equals(DiffSeparator.EMPTY.getSeparator()) ? "empty string separator" : separator));
		System.out.println("");
		
		String[] words1Arr = s1.split(separator);
		String[] words2Arr = s2.split(separator);
		
		Set<String> set1 = new HashSet<String>();
		set1.addAll(Arrays.asList(words1Arr));
		
		Set<String> set2 = new HashSet<String>();
		set2.addAll(Arrays.asList(words2Arr));
		
		//set1.removeAll(set2);
		
		set2.removeAll(set1);
		
		
		for(int i = 0; i < words1Arr.length; i++ ){
			
			boolean found = false;
			for(int j = 0; j < words2Arr.length; j++){
				if( words1Arr[i].equals(words2Arr[j])){
					found = true;
					break;
				}
			}//for
			
			if(!found){
				//System.out.println("missing word: " + words1Arr[i] + " at index: " + i );
				System.out.println(DiffActions.DELETE.getAction() + words1Arr[i] + " at index: " + i );
			}
		}
		
		
		for(int i = 0; i < words2Arr.length; i++ ){
			
			boolean found = false;
			for(int j = 0; j < words1Arr.length; j++){
				if( words2Arr[i].equals(words1Arr[j])){
					found = true;
					break;
				}
			}//for
			
			if(!found){
				//System.out.println("added word: " + words2Arr[i] + " at index: " + i );
				System.out.println(DiffActions.ADD.getAction() + words2Arr[i] + " at index: " + i );
			}
		}
	}
	
public static void main(String[] args) throws AppException {
		
		/*Comparing single dummy strings*/
		//String s1 = "abcdfghjqz";
		//String s2 = "abcdefgijkrxyz";
		//new DiffUtil().diff(s1, s2);
		
		/*Comparing 1 line sentences*/
		//new DiffUtil().diffSentence("ponedeljak sreda petak nedelja","sreda cetvrtak petak nedelja");
		
		/*Comparing 1 line sentences using HashSet */
		//new DiffUtil().diffSentence2("ponedeljak sreda petak nedelja","sreda cetvrtak petak nedelja", DiffSeparator.EMPTY.getSeparator());
		//new DiffUtil().diffSentence2("Apples are green. Bananas are not cheap. ",
		//		"Apples are green. Kiwi is really fresh. Bananas are not cheap.");
		
	
		/******Comparing Diary entries: TEXT******/
		
		/*
		DiaryEntryCompareService compareService = new DiaryEntryCompareServiceImpl(DiffSeparator.EMPTY);
		*/
		
		/*test non-existing*/
		//compareService.compareEntriesCreateDiffReport(100, 4);
		
		/*test identical*/
		/*
		compareService.compareEntriesCreateDiffReport(4, 10); //TODO create identical report
		*/
		
		/*test different*/
		/*
		compareService.compareEntriesCreateDiffReport(2, 10);
		*/
	
		/** Comparing Diary entries: TAGS */
	DiaryEntryCompareService compareService = new DiaryEntryCompareServiceImpl(DiffSeparator.SEMICOLON);
	compareService.compareEntriesCreateDiffReport(2, 10);
	
	}
}
