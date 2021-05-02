package com.heejin.programmers;

public class No49993 {
	 public int solution(String skill, String[] skill_trees) {
	     int answer = 0;
		 for (String skill_tree : skill_trees) {
			if (verify(skill, skill_tree)) {
				answer++;
			}
		 }
	        return answer;
	    }
	 public boolean verify(String skill, String skill_tree) {
		 
		 String mainSkills = "";
		 for (int i = 0; i < skill_tree.length(); i++) {
			 String str = String.valueOf(skill_tree.charAt(i));
			 if (skill.contains(str)) {
				 mainSkills = mainSkills + str;
			 }
		 }
		 
		 if (mainSkills.equals("")) {
			 return true;
		 }
		 
		 if (skill.contains(mainSkills) && skill.charAt(0) == mainSkills.charAt(0)) {
			 return true;
		 } else {
			 return false;	 
		 }
		 
	 }


}
