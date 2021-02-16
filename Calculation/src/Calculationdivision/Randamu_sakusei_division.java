package Calculationdivision;

import java.util.Random;

public class Randamu_sakusei_division{
	
	   Random rnd = new Random();
	     
	    private int[] value = {2,3,4,6,8,9,10,20,30,33};
	   
	    private int value1 = value [rnd.nextInt(10)];
	    private int value2;
	    private int value3;
	    private int value4;
		private int id;
	    
	    private int Multiplication;
	    
	    private int Answer = 0;
	    private int Acceptance = 0;
	    
	    public int getvalue1() {
	    return value1;

	    }

	    public void setvalue1(int value1) {
	        this.value1 = value1;
	    }
	    
	    public int getvalue2() {
	    return value2;

	    }

	    public int setvalue2(int value2) {
	        return this.value2 = value2;
	    }
	        
	    public int getvalue3() {
	        return value3;
	    }

	    public void setvalue3(int value3) {
	        this.value3 = value3;
	    }
	    public int getvalue4() {
	        return value4;
	    }

	    public void setvalue4(int value4) {
	        this.value4 = value4;
	    }
	    		
	    
	    public int getMultiplication() {
	        return Multiplication;
	    }
	    
	    public void setMultiplication(int Multiplication) {
	        this.Multiplication = Multiplication;
	    }
	    
	    
	    public int getAnswer() {
	        return Answer;
	    }

	    public void setAnswer(int Answer) {
	        this.Answer = Answer;
	    }
	    
	    public int getAcceptance() {
	        return Acceptance;
	    }

	    public void setAcceptance(int Acceptance) {
	        this.Acceptance = Acceptance;
	    }
		public void setid(int id) {

	    	this.id = id;	
	    }
		
	    public int getid() {
	    	  
	      return id;
	   }

}
