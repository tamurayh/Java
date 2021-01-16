package sample;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MeiboBean implements Serializable{
	
	private String name;
	
	public MeiboBean() {
		
	}
	
	public MeiboBean(String name) {
		
		this.name = name;
		
	}


	public void setname(String name ) {

    	this.name = name;	
    }
	
    public String getName() {
    	  
    	  return name;}
}

