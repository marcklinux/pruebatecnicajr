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
    public static void main(String[] args) {
        App app = new App();
        //app.m1InvertedString("marcos");
        app.m2IsCapicua(525);
    }
}
