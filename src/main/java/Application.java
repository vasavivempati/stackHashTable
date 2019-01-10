/**
 * Created by vasavivempati on 1/10/19.
 */
public class Application {
    public static void main(String[] args){
        String[] input = new String[13];
        input[0] = "12";
        input[1] = "push 4";
        input[2] = "pop";
        input[3] = "push 3";
        input[4] = "push 5";
        input[5] = "push 6";
        input[6] = "inc 2 1";
        input[7] = "push 5";
        input[8] = "push 6";
        input[9] = "pop";
        input[10] = "inc 2 2";
        input[11] = "push 7";
        input[12] = "pop";
        stkHashTable stack  = new stkHashTable();
        stack.process_input(input);
    }
}
