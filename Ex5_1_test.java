
package ex5_1_test;

public class Ex5_1_test {

    
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


    }
}
   