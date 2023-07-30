public class Demo6task_c {
    public static void main(String[] args) {


        String COLOR1= "\033[31m";
        String RESET= "\033[0m";
        String col2="\033[32m";
        String CONSTANT1="%4$d%2$s,%3$s%5$d%2$s,%3$s%6$d" ;

        String LINE="%s+-----------------+-------------+-------------+\n";
        
        System.out.printf(LINE, COLOR1);
        System.out.printf("|%1$sCITY%3$13s%2$s|%1$sSTATE%2$s%3$8s|%1$sPOPULATION%2$s%3$3s| \n", RESET, COLOR1,"");
        System.out.printf(LINE, COLOR1);


        System.out.printf("|%2$sLos Angeles %3$s     |%2$sCalifornia %3$s  |   %4$d%2$s,%3$s%5$d%2$s,%3$s%6$d | \n", col2,RESET,COLOR1,3,966,936);
        System.out.printf("|%1$sNew %2$sYork %3$s        |%1$sNew %2$sYork %3$s    |   %4$d%2$s,%3$s%5$d%2$s,%3$s%6$d | \n", col2,RESET,COLOR1,8,336,817);
        
        System.out.printf(LINE, COLOR1);




    }

}
