package com.pack.test1;

import org.testng.annotations.DataProvider;

public class DataProviders {

	

	    
	    @DataProvider(name="Login")
	    public Object[][] getData()
	    {
	        return new Object[][] { {"Admin","admin123"}
	            
	            
	        };
	    }
	    @DataProvider(name="Newuser")
	    public Object[][] getdata2(){
	        return new Object[][] { {"Admin","Linda Anderson","l.anderson123","Enabled","Automation@123","Automation@123" }
	            
	            
	        };
	        
	    }
	    @DataProvider(name="SearchUser")
	    public Object[][] getData1(){
	        return new Object [][] {{"l.anderson123"}};
	        
	    }

	}


