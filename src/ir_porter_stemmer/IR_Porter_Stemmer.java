
package ir_porter_stemmer;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Medo
 */
public class IR_Porter_Stemmer {




    public static void main(String args[]) throws InterruptedException{
        details();
        ArrayList<String> t = new ArrayList<>();

        String[] tokens = {"generalizations"};

        for (String x: tokens){
            t.add(x);
        }

        IR_Porter_Stemmer pa = new IR_Porter_Stemmer();
        for (String word : tokens){

            System.out.println(ConsoleColors.PURPLE_BOLD+"The  Word " + word  );
            TimeUnit.SECONDS.sleep(2);

            String s1 = pa.step1(word);
            System.out.println(ConsoleColors.BLUE_BOLD+"step 1:"+s1);
            TimeUnit.SECONDS.sleep(2);

            String s2 = pa.Step2(s1);
            System.out.println(ConsoleColors.RED_BOLD+"step 2:"+s2);
            TimeUnit.SECONDS.sleep(2);

            String s3= pa.Step3(s2);
            System.out.println(ConsoleColors.GREEN_BOLD+"step 3:"+s3);
            TimeUnit.SECONDS.sleep(2);

            String s4= pa.Step4(s3);
            System.out.println(ConsoleColors.YELLOW_BOLD+"Step 4:" + s4);

        }    }

    private static void details() throws InterruptedException {
        System.out.println( ConsoleColors.GREEN+"information retrieval");
        TimeUnit.SECONDS.sleep(1);
        System.out.println( ConsoleColors.BLUE_UNDERLINED+"Porter Stemmer Algorithm");
        TimeUnit.SECONDS.sleep(1);

        System.out.println( ConsoleColors.RED+"Student Name: " + "Mohammed Yehia Ashour");
        TimeUnit.SECONDS.sleep(1);

        System.out.println(ConsoleColors.CYAN+ "Student ID: " + "1301195595");
        TimeUnit.SECONDS.sleep(1);

    }
    public String step1(String input) {

        if (input.endsWith("S")) {
            return input.substring(0, input.length() - 1);

        }else if(input.endsWith("s")){
            return input.substring(0, input.length() - 1);

        }

        return input;
    }
    public String Step2(String input) {

        if (input.endsWith("ATION")) {
            String stem = input.substring(0, input.length() - 5);
            return stem + "E";
        }else if(input.endsWith("ation")){
            String stem = input.substring(0, input.length() - 5);
            return stem + "e";
        }

        return input;
    }
    public String Step3(String input) {

        if (input.endsWith("IZE")||input.endsWith("ize")) {
            return  input.substring(0, input.length() - 3);
        }else if(input.endsWith("ISE")||input.endsWith("ise")){
            return  input.substring(0, input.length() - 3);

        }

        return input;
    }
    public String Step4(String input) {
        if (input.endsWith("AL")) {
            return  input.substring(0, input.length() - 2);
        }else if (input.endsWith("al")){

            return  input.substring(0, input.length() - 2);
        }
        return input;
    }
}

    

