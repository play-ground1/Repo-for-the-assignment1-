public class Demo3 {
    public static void main(String[] args) {
        String COLOR = "\033[31m";
        String RESET = "\033[0m";

        System.out.printf("%s(%d)%s %d-%d \n",COLOR,123,RESET,456,7890);

    }

}
