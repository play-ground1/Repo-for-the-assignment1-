public class Demo6task_b {
    public static void main(String[] args) {

        //System.out.print("+");
        //System.out.println("-".repeat(5));

        String COLOR1= "\033[33m";

        String COLOR2= "\033[34;1m";
        String col3="\033[31m";
        String RESET= "\033[0m";
        String LINE="%s+-----------------+-----+ \n";
        
        String name1= "Alice";
        String name2= "Bob";

        int age1= 24;
        int age2=30;
        
        System.out.printf(LINE, COLOR1);
        System.out.printf("|%3$s NAME%1$s%17s|%3$s AGE%1$s%1s| \n", COLOR1,"",COLOR2,"");
        System.out.printf(LINE, COLOR1);


        System.out.printf("|%6$s%s%5$12s%7$s| %8$s%s%5$2s%7$s|\n|%6$s%s%5$14s%7$s| %8$s%s%5$2s%7$s|\n", name1,age1,name2,age2,"",RESET,COLOR1,col3);

        System.out.printf(LINE, COLOR1);        

        
    }

}
