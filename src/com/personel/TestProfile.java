package com.personel;

public class TestProfile {
     public static void printProfile(IProfile profile){
    	 profile.myBasicInfo();
    	 profile.myHobbies();
     }	 
 public static void main(String[] args) {
	 IProfile myprofile = new SriniProfile();
	 printProfile(myprofile);
	
   
	
 }
     
}
