package DataProvider;

import java.io.File;

import java.io.FileInputStream;
import java.util.Properties;

public class configdataProvider {
	
	
	static Properties pro = new Properties() ;
	
	public configdataProvider(){
		//to load properties file
		
		File src=new File("./configuration/config.properties");
		try {
		FileInputStream fis =new FileInputStream(src);
		
		
			pro.load(fis);
		} catch (Exception e) {
			
	     System.out.println("Exception is "+e.getMessage());
	     
		}
		
		
	}

	public static String getappliationURL()
	{
		
		String url=pro.getProperty("url");
		return url;
		
		
	}	
		
	
	public String getchromepath()
	
	{
		
		String chromepath=pro.getProperty("chormePath");
		
		return chromepath ;
		
	}
		
	
public String firefoxPath()
	
	{
		
		String firefoxPath=pro.getProperty("firefoxpath");
		
		return firefoxPath ;
		
	}
		
	

}
