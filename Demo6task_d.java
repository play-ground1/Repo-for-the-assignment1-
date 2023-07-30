public class Demo6task_d {

    public static void main(String[] args) {

        String COLOR1= "\033[31m";
        String col_green="\033[32m";
        String RESET= "\033[0m";
        String item1= "Apple";
        String item2="Orange";
        String doller="$";
        String col_blue= "\033[34m";

        System.out.printf("%s+-----------+----------+------+\n", COLOR1);
        System.out.printf("|%1$s ITEM%3$6s%2$s|%1$s QUANTITY%2$s%3$1s|%1$sPRICE%2$s%3$1s| \n", RESET, COLOR1,"");
        
        System.out.printf("%1$s+%2$s-----------%1$s+----------+%2$s------%1$s+\n" , COLOR1,col_green);

        System.out.printf("|%7$s%s%12$6s%9$s| %8$s%d%12$8s%9$s|%10$s%11$s%9$s%s |\n|%7$s%s%12$5s%9$s| %8$s%d%12$7s%9$s|%10$s%11$s%9$s%s |\n",item1,5,0.99,item2,10,1.49,RESET,col_blue,COLOR1,col_green,doller,"");

        System.out.printf("%1$s+%2$s-----------%1$s+----------+%2$s------%1$s+\n" , COLOR1,col_green);


    }
    
}
