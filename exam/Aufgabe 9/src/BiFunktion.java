import java.util.function.BiFunction;

public class BiFunktion <T,U,R> {
    public BiFunktion<Integer, Integer, Integer> summe = (x,y) -> x + y; //a)

//    public R apply(T x, U y){
//        int i = (R) x + y;
//        return i;
//    }

    summe.apply(5,6); // b)




}
