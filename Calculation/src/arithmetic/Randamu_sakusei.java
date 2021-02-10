package arithmetic;

import java.util.Random;

public class Randamu_sakusei {
	
    Random rnd = new Random();
    private int value1 = rnd.nextInt(50)+50;
    private int value2 = rnd.nextInt(50)+1;
    private int value3;
    private int value4;
	private int id;
    
    private int Additionresult;
    private int Subtractionresult;
    
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

    public void setvalue2(int value2) {
        this.value2 = value2;
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
    		
    
    public int getAdditionresult() {
        return Additionresult;
    }
    
    public void setAdditionresult(int Additionresult) {
        this.Additionresult = Additionresult;
    }
    
    public int getSubtractionresult() {
        return Subtractionresult;
    }
    
    public void setSubtractionresult(int Subtractionresult) {
        this.Subtractionresult = Subtractionresult;
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
