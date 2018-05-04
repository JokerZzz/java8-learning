import util.IntElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiajun on 2018/5/3.
 */
public class LambdaTest {

    public static void main(String[] args) {


        List<IntElement> testList = new ArrayList<>();
        testList.add(new IntElement(1, "One"));
        testList.add(new IntElement(4, "Four"));
        testList.add(new IntElement(3, "Three"));
        testList.add(new IntElement(2, "Two"));
        testList.add(new IntElement(9, "Nine"));
        testList.add(new IntElement(8, "Eight"));
        testList.add(new IntElement(5, "Five"));
        testList.add(new IntElement(6, "Six"));
        testList.add(new IntElement(7, "Seven"));

//        System.out.println(testList.stream().filter(i -> i.arabicNumber == 1).findFirst().orElseThrow(()-> new InvalidParameterException()).englishName);

//        System.out.println(testList.stream().filter(i -> i.getArabicNumber() > 5)
//                .sorted(Comparator.comparing(IntElement::getArabicNumber))
//                .mapToInt(IntElement::getArabicNumber)
//                .sum());
//
//        System.out.println(testList.stream().filter(i -> i.getArabicNumber() > 2).mapToInt(IntElement::getArabicNumber).findFirst().orElseThrow(InvalidParameterException::new));

    }


}
