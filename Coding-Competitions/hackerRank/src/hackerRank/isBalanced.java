package hackerRank;
import java.util.*;

public class isBalanced {
		
		    static String isBalance(String s) {
		        Stack<Character> sc = new Stack<Character>();
		        for(int i = 0 ;i < s.length() ;i++){
		        	if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
		                sc.push(s.charAt(i));    
		            }
		        	else if(s.charAt(i) == ')' ||  s.charAt(i) == ']' || s.charAt(i) == '}' ){
		        			if(s.charAt(i) == ')' && sc.peek() == '(' && !sc.empty() ||
		        					(s.charAt(i) == '}' && sc.peek() == '{' && !sc.empty())
		        					|| (s.charAt(i) == ']' && sc.peek() == '[' && !sc.empty())){
		        				sc.pop();
		        			}
		        			else {
		        				return "NO";
		        			}
		             	}
		        	}
		       return sc.isEmpty()?"YES":"NO"; 
		    }
		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int t = in.nextInt();
		        for(int a0 = 0; a0 < t; a0++){
		            String s = in.next();
		            String result = isBalance(s);
		            System.out.println(result);
		        }
		        in.close();
		    }
	}

