
package ex5_1;


public class Ex5_1 {
 private int count;
    private int limmit;
    public  Ex5_1 (int limmit){
        count=0;
        this.limmit=limmit;
    }

    public void click(){
        if (count<2)
        count++;
    }

    public void reset(){
        count=0;
    }

    public void undo(){
        if (count>0)
            count--;
    }

    public void setLimmit(int limmit){
       this.limmit=limmit;
    }
    public int getCount(){
        return count;
    }
public static void main(String[] args) {
         Ex5_1 tallycounter=new Ex5_1(2);
        tallycounter.click();
        tallycounter.click();
        tallycounter.click();
        System.out.println(tallycounter.getCount());
        tallycounter.undo();
        tallycounter.undo();
        tallycounter.undo();
        tallycounter.undo();
        tallycounter.undo();
        System.out.println(tallycounter.getCount());


//}}