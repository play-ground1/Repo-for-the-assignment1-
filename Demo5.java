public class Demo5 {
    public static void main(String[] args) {
        
        int isbn1 = 978;
        int isbn2 = 3;
        int isbn3 = 16;
        int isbn4 = 1484100;

        String COLOR1= "\033[35m";
        String COLOR2= "\033[34m";
        String COLOR3= "\033[33m";
        String COLOR4= "\033[32m";

        String RESET= "\033[0m";

        System.out.printf("%s%d%s-%s%d%s-%s%d%s-%s%d%s \n", COLOR1,isbn1,RESET,COLOR2,isbn2,RESET,COLOR3,isbn3,RESET,COLOR4,isbn4,RESET );


        

    }

}
