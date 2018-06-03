package com.personel;

public class SriniProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME+"Srinivasan");
		System.out.println(ProfileConstants.LAST_NAME+"N");
		System.out.println(ProfileConstants.AGE+"20");
		
	}

	@Override
	public void myHobbies() {
		System.out.println("He's hobby is fishing");
		
	}

}
