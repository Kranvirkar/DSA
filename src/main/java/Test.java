import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    /*
    Write a Java program to find the Second non-repeated character in a given string.

    Example:
    Input String: Alexander
    Output String: x
    */

    public static void main(String[] args) {
        String str="Alexander";

        System.out.println(secondNonRepeatedCharacter1(str));;
    }

    private static Character secondNonRepeatedCharacter(String str) {
        Map<Character,Integer> mapCount =new LinkedHashMap<>();
        int count=0;
        for (char ch:str.toLowerCase().toCharArray()){
            mapCount.put(ch,mapCount.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry: mapCount.entrySet()){
            if(entry.getValue()==1){
                count++;
            }
            if(count==2){
                return entry.getKey();
            }
        }
        return null;
    }

    private static String secondNonRepeatedCharacter1(String str) {
        String[] cha=str.split("");
        System.out.println(Arrays.toString(cha));
        String s = Arrays.stream(cha)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .skip(1)
                .findFirst().get().getKey();
        return s;
    }
}
