package org.kh.app;
import java.util.Scanner;

//조건문 다단계 if
public class Condition4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("점수 입력 [0~100] :");
		int point = scan.nextInt();
		String result;
	
		if(point>=90) {
	      /*result = "A++";
		} else if(point>=93) {
			result ="A0";
		} else if(point>=90) {
			result = "A-";
		}*/
			if(point >= 97)
			{
				result = "A++";
			}
			else if(point >= 93)
			{
				result = "A0";
			}
			else 
			{
				result = "A-";
			}
		}
		else if(point>=80) {
//		    result = "B++";
		    if(point >=87) {
		    	result = "B++";
		    }
		    else if(point >=83) {
		    	result ="B0";
		    }
		    else {
		    	result = "B-";
		    }
		}
		else if(point>=70) {
			if(point >=77) {
				result = "C++";
			} 
			else if (point >=73) {
				result = "C0";
			}else {
					result = "C-";					
			}				
			}		
		else if(point>=60)  {
			if(point>=67) 
				result = "D++";
				
		}
			
			
			
			
		 
					
					
				
				
			}
			
			
		}
			
		
		
		
		
		
		
		
		
		
	

}