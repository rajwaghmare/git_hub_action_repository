package java_programs;

public class reverse_string {
    public static void main(String[] args){

        String str = "Devils World";
        StringBuilder sb = new StringBuilder();

        for(int i = str.length() -1; i >=0; i--){

            sb.append(str.charAt(i));
        }

        System.out.println("Reverse String: " + sb.toString());
    }
}
