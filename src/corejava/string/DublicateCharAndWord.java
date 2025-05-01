package corejava.string;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DublicateCharAndWord {

    public static void main(String[] args) {

       String str = "this is the java and java is the best program";
       String[] starr =str.split(" ");
       Map<String,Long> map= Arrays.stream(starr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println("map=="+map);

        List<String> filters = Arrays.stream(starr).filter(f->f.equals("the")).collect(Collectors.toList());

        System.out.println("filters="+filters);
    }
}
