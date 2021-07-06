package java_challenge;

public class BinaryConverter {

    public static void main(String[] args) {
        System.out.println(toBinary(7));
    }


    public static String toBinary(int number){
       String binary = "";
      while(number > 0){
          binary = (number %2) + binary;
          number /= 2;
      }


        return binary;
    }
}
