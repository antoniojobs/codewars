import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java8Streams {

    public Java8Streams() {
    }

    private Double multiplica(Integer e, Double mult) {
        return e * mult;
    }

    public static void main(String[] args) {
        //lista de inteiros
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 9, 10, 10, 11, 11);

/*
        //java 4
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            Integer integer = (Integer) iterator.next();
            System.out.println(integer + "\n");
        }

        //java 5
        for (Integer integer : list) {
            System.out.println(integer);
        }
*/
        Java8Streams obj = new Java8Streams();

        //javav8
        //operação intemediária
        list.stream()
/*                .skip(0)
                .limit(7)
                .distinct()*/
                .filter(x -> x % 2 == 0)
                .map(e -> {
                    return obj.multiplica(e, 0.9);
                })
                .forEach(e -> System.out.println("[" + e + "]"));
    }
}
