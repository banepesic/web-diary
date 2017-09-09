package com.brolly.diary.utils;

/*

 			a	b	c	d	a	f
 	----------------------------
 		0	0	0	0	0	0	0													
	a	0	1	1	1	1	1	1
	c	0	1	1	2	2	2	2
	b	0	1	2	2	2	2	2
	c	0	1	2	3	3	3	3
 	f	0	1	2	3	3	3	4
														
		
		0<=						
			1<=							a
				2<=						b
					 3 <=3 <=3<-		c
								4		f 										
																										
	
	if(input1(i) ==  input2(j)){
		T[i,j] = T[i-1,j-1] + 1;
		else 
		T[i,j] = max(T[i-1,j],T[i,j-1])
	
	}

*/


public class  LongestCommonSubsequenceUtil {
    // Returns length of LCS for X[0..m-1], Y[0..n-1]
    public static char[] lcs(String X, String Y, int m, int n) {
        
    	int[][] T = new int[m+1][n+1];
  
        // Following steps build L[m+1][n+1] in bottom up fashion. Note
        // that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] 
        for (int i=0; i<=m; i++) {
            for (int j=0; j<=n; j++) {
                if (i == 0 || j == 0){
                	T[i][j] = 0;
                } else if (X.charAt(i-1) == Y.charAt(j-1)){
                	T[i][j] = T[i-1][j-1] + 1;
                } else{
                	T[i][j] = Math.max(T[i-1][j], T[i][j-1]);
                }
                    
            }
        }
  
        // Following code is used to print LCS
        int index = T[m][n];
  
        // Create a character array to store the lcs string
        char[] lcs = new char[index+1];
        lcs[index] = '\0'; // Set the terminating character
  
        // Start from the right-most-bottom-most corner and
        // one by one store characters in lcs[]
        int i = m, j = n;
        while (i > 0 && j > 0) {
            // If current character in X[] and Y are same, then
            // current character is part of LCS
            if (X.charAt(i-1) == Y.charAt(j-1)) {
                // Put current character in result
                lcs[index-1] = X.charAt(i-1); 
                 
                // reduce values of i, j and index
                i--; 
                j--; 
                index--;     
            }
  
            // If not same, then find the larger of two and
            // go in the direction of larger value
            else if (T[i-1][j] > T[i][j-1]){
            	i--;
            } else{
            	j--;
            }
                
        }
        
        return lcs;
       
    }
     
    
    public static void main (String[] args) 
    {
        String X = "ABCDAF";
        String Y = "ACBCF";
        int m = X.length();
        int n = Y.length();
        
        char[] lcs = lcs(X, Y, m, n);
        
        // Print the lcs
        System.out.print("LCS of " + X +" and "+ Y +" is ");
        for(char c: lcs){
        	System.out.print(c);
        }
    }
}
 