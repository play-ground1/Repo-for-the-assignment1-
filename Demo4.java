public class Demo4 {
    public static void main(String[] args) {
        
        String COLOR1 = "\033[31m";
        String COLOR2 = "\033[32m";
        String COLOR3 = "\033[33m";
        String COLOR4 = "\033[34m";
        String COLOR5 = "\033[35m";
        String COLOR6 = "\033[36m";
        String RESET = "\033[0m";


        System.out.printf("%s%d%s/%s%d%s/%s%d%s %s%d%s:%s%d%s:%s%d%s \n",COLOR1,12,RESET,COLOR2,28,RESET,COLOR3,2023,RESET,COLOR4,23,RESET,COLOR5,59,RESET,COLOR6,59,RESET);

    }
    
}
