package grades;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String ns = in.nextLine();
	        int n = Integer.parseInt(ns);
	        for(int a0 = 0; a0 < n; a0++){
	        	String ngrade = in.nextLine();
	            int grade = Integer.parseInt(ngrade);
	            if (grade < 38) {	            
	            	System.out.println(grade);
	            } else {
	            	int k = grade % 5;
	            	if (k < 3) {
	            		System.out.println(grade);
	            	} else {
	            		k = 5 - k;
			    		grade = grade + k;
			    		System.out.println(grade);
	            	}
		            
		    		
	            }
	            
	    		
	        }
		
	}
	

}
