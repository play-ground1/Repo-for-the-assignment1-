public class Demo4 {
    public static void main(String[] args) {
        
        String color1 = "\033[31m";
        String color2 = "\033[32m";
        String color3 = "\033[33m";
        String color4 = "\033[34m";
        String color5 = "\033[35m";
        String color6 = "\033[36m";
        String reset = "\033[0m";


        System.out.printf("%s%d%s/%s%d%s/%s%d%s %s%d%s:%s%d%s:%s%d%s \n",color1,12,reset,color2,28,reset,color3,2023,reset,color4,23,reset,color5,59,reset,color6,59,reset);

    }
    
}
