package com.orangehrmlive;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
  
	@BeforeGroups(groups="Admin")
	public void beforeAdminGroup()
	{
		System.out.println("Execute before Admin");
		
	}
	
	@BeforeGroups(groups="leave")
	public void beforeleaveGroup()
	{
		System.out.println("Execute before leave");
		
	}
  
  @Test(groups="Admin")
  public void adminmodule1() 
  {
	  System.out.println("Admin Test1");
  }
  @Test(groups="Admin")
  public void adminmodule2() 
  {
	  System.out.println("Admin Test2");
  }
  @Test(groups="leave")
  public void leavemodule1() 
  {
	  System.out.println("Leave test1");
  }
  @Test(groups="leave")
  public void leavemodule2() 
  {
	  System.out.println("Leave test2");
  }
}
