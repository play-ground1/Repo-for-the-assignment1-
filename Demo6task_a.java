public class Demo6task_a {
    public static void main(String[] args) {

        String col1 = "\033[41m";
        String col2 = "\033[42m";
        String col3 = "\033[36";

        String reset = "\033[0m";
        String a="%";

        System.out.printf("%s[%7s5%s%s%s0%7s]%s\n", col1,"",reset, col2,a,"",reset);
    
}    
}
