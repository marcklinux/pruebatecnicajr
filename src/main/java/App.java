import java.time.LocalDate;
import java.util.*;

public class App {

    private void m1InvertedString(String text){
       /* String[] array = text.split("");
        StringBuilder newText = new StringBuilder();

        for(int i = array.length; i>0 ; i--){
            newText.append(array[i-1]);
        }
        System.out.println(newText);*/
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }

    private void m2IsCapicua(int number){
        String numberText = String.valueOf(number);
        String reverseNUmber = new StringBuilder(numberText).reverse().toString();

        if(numberText.equals(reverseNUmber)){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }

    private void m3CounterCharacterTimes(String text){
        int i , length , counter[] = new int[256];

        length = text.length();
        for(i = 0; i < length; i++){
            counter[text.charAt(i)]++;
        }

        for(i = 0; i < 256; i++){
            if(counter[i] != 0){
                System.out.println((char)i + ": " +  counter[i]);
            }

        }
    }

    private void m4RepeatCharacter(String text){
        int i , length , counter[] = new int[256];

        length = text.length();
        for(i = 0; i < length; i++){
            counter[text.charAt(i)]++;
        }

        for(i = 0; i < 256; i++){
            if(counter[i] > 1){
                System.out.println((char)i + ": " +  counter[i]);
            }

        }
    }

    private void m5IsMultiploOf2(int number){
        if(number % 2 == 0){
            System.out.println("Es multiplo");
        }else {
            System.out.println("No es multiplo");
        }
    }

    private void m6IsLeapYear(int year){
       boolean isleapYear= LocalDate.of(year,1,1).isLeapYear();
        System.out.println(isleapYear);

    }

    private void m7RandomOrderString(String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }

    private void m8GetOnlyNotDuplicatesList(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::println);
    }

    private void m9CheckIfVowalIsPresent(String text){
        String[] array = text.split("");
        boolean ispresent = false;
        for(String s:array){
            if(s.equals("a")|| s.equals("e")|| s.equals("i")|| s.equals("o")|| s.equals("u")){
                ispresent = true;
                break;
            }
        }
        System.out.println(ispresent);
    }
    public static void main(String[] args) {
        App app = new App();
        //app.m1InvertedString("marcos");
        //app.m2IsCapicua(525);
        //app.m3CounterCharacterTimes("conena");
        //app.m4RepeatCharacter("conena");
        //app.m5IsMultiploOf2(11);
        //app.m6IsLeapYear(2024);
        //app.m7RandomOrderString("marcos");
        //app.m8GetOnlyNotDuplicatesList(Arrays.asList(1,2,3,4,5,5,1,2,3,7,9));
        app.m9CheckIfVowalIsPresent("mr");
    }
}
