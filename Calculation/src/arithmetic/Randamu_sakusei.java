package arithmetic;

import java.util.Random;

public class Randamu_sakusei {
	
    Random rnd = new Random();
    private int value1 = rnd.nextInt(99)+1;
    private int value2 = rnd.nextInt(99)+1;
    
    private int Additionresult = value1 + value2;
    private int Subtractionresult = value1 - value2;
    private int Multiplicationresult = value1 * value2;
    private int Divisionresult = value1 / value2;
    
    private int Answer = 0;
    
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
    
    public int getAdditionresult() {
        return Additionresult;
    }
    
    public int getSubtractionresult() {
        return Subtractionresult;
    }
    
    public int getMultiplicationresult() {
        return Multiplicationresult;
    }
    
    public int getDivisionresult() {
        return Divisionresult;
    }
    
    public int getAnswer() {
        return Answer;
    }

    public void setAnswer(int Answer) {
        this.Answer = Answer;
    }
    
    

}
