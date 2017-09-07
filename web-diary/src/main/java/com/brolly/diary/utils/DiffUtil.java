package com.brolly.diary.utils;
/**

 Substrings are consecutive subsequences.
 
 For a n-element sequence of pairwise distinct letters you have:
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

       a b c d f g h j q z

       a b c d e f g i j k r x y z

and we want to find a longest sequence of items that is present in both original sequences in the same order. 
That is, we want to find a new sequence which can be obtained from the first original sequence by deleting some items,
 and from the second original sequence by deleting other items.
  We also want this sequence to be as long as possible. In this case it is

       a b c d f g  j  z

From a longest common subsequence it is only a small step to get diff-like output:
 if an item is absent in the subsequence but present in the first original sequence,
  	it must have been DELETED (as indicated by the '–' marks, below).
 
  If it is absent in the subsequence but present in the second original sequence,
   	it must have been ADDED (as indicated by the '+' marks).

       e   h i   q   k r x y
       +   - +   -   + + + +


 * @author 804427
 *
 */

public class DiffUtil {
	String s;
}
