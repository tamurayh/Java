package sample;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MeiboBean implements Serializable{
	
	private int id;
	private String name;
	private String pass;
	
	public MeiboBean() {
		
	}
	
	public MeiboBean(String name, String pass, int id) {

		this.id = id;
		this.name = name;
		this.pass = pass;	
		
	}


	public void setname(String name ) {

    	this.name = name;	
    }
	
    public String getName() {
    	  
    	  return name;
   }
    
	public void setpass(String pass ) {

    	this.pass = pass;	
    }
	
    public String getpass() {
    	  
    	  return pass;
   }
    
	public void setid(int id) {

    	this.id = id;	
    }
	
    public int getid() {
    	  
    	  return id;
   }
    
    
}

