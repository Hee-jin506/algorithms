package com.heejin.programmers;

import java.util.Scanner;

public class No60058 {
    public String solution(String p) {
        return service(p);
    }
    
    public int separateUV(String s) {
        int l = 0;
        int r = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
            	l++;
            } else {
            	r++;
            }
            
            if (l == r && l != 0 && r != 0) {
            	return i;
            }
        }
        
        return s.length() - 1;
    }
    
    public boolean checkU(String u) {
    	while (true) {
    		if (u.contains("()")) {
    			u = u.replace("()", "");
    		} else {
    			break;
    		}
    	}
    	
    	if (u.equals("")) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public String service(String p) {
    	
    	if (p.equals("")) {
    		return "";
    	}
    	
    	String u = p.substring(0, separateUV(p) + 1);
    	String v = p.substring(separateUV(p) + 1);
    	if (checkU(u)) {
    		System.out.println("올바른 괄호 문자열");
    		return u + service(v);
    	} else {
    		System.out.println("올바른 괄호 문자열 X");
    		u = u.substring(1, u.length() - 1);
        	u = u.replace(")", "x");
        	u = u.replace("(", ")");
        	u = u.replace("x", "(");
    		return "(" + service(v) + ")" + u;
    	}

    }
    
    public static void main(String[] args) {
    	No60058 p = new No60058();
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	
    	System.out.println(p.service(s));
    	
    }
}