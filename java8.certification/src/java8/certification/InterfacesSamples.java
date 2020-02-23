package java8.certification;

import java.util.GregorianCalendar;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class InterfacesSamples {

    public static void main(String ... arguments){
        Supplier<java.util.Date> today = GregorianCalendar.getInstance()::getTime;
        System.out.println(today.get());

        StringBuffer hello =new StringBuffer();
        Consumer<StringBuffer> addGreetings = (thing) -> thing.append("Hello");
        addGreetings.accept(hello);
        System.out.println(hello);

        BiPredicate<Double, Integer> biPredicate = (t, u)->t.intValue()==u;
        System.out.println(biPredicate.test(5.0,5));
        System.out.println(biPredicate.test(5.0,1));

        Function<Integer, String> toStringInt = (t)->t.toString();
        System.out.println(toStringInt.apply(8));



    }
}
