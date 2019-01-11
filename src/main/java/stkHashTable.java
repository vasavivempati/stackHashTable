import java.util.Hashtable;

/**
 * Created by vasavivempati on 1/10/19.
 */
public class stkHashTable {
    public void process_input(String[] input){
        Hashtable<Integer,Integer> output = new Hashtable<Integer, Integer>();
        for(int i =1; i<input.length;i++){
            if(input[i].contains("push")){
                String[] number = input[i].split(" ");
                output.put(i,Integer.valueOf(number[1]));
            }
            else if(input[i].contains("pop") && (output.isEmpty() == false)){
                //int index = output.size() -1;
                output.remove(output.size());

            }
            else if(input[i].contains("inc")){
                String[] number = input[i].split(" ");
                int add_on = Integer.valueOf(number[2]);
                int number_of_values_to_change =  Integer.valueOf(number[2]);
                for(int j=output.size()-1;j>output.size()-number_of_values_to_change;j--){
                    int val = output.get(j);
                    output.put(j,val+add_on);
                }
            }
            for (Integer key : output.keySet()) {
                System.out.print(output.get(key) + " ");
            }
            System.out.println();
        }
    }
}
