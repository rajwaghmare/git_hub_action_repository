package java_programs;

public class find_number_given_string {

    public static void main(String[] args){

        String input = "This is devil number 999.99";
        String numberStr  = input.replaceAll("[^\\d.]", "");

        if(!numberStr.isEmpty()){

            double number = Double.parseDouble(numberStr);
            System.out.println("Number found into the string: " + number);

        }  else {
            System.out.println("No number found into the string");
        }

    }
}
