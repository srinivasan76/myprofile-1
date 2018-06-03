package com.personel;

public class StephenProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+"stephenimmanuvel");
		System.out.println(ProfileConstants.LAST_NAME+"J");
		System.out.println(ProfileConstants.AGE+"20");
	}

	@Override
	public void myHobbies() {   
		System.out.println("My hobby is Playing.");
	}
      
}
