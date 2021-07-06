package java_challenge;

public class StringReverse {


    public static void main(String[] args) {
        System.out.println(reverse("hello there"));
        System.out.println(reverseWithStringBuilder("HELLO THERE"));
        System.out.println(fib(6));
    }


    public static  String reverse(String message){
        String reverseWord ="";
        char [] arr = new char[message.length()];
        //arr = message.toCharArray();
        for(int i = arr.length-1;i >= 0 ;i--){
           arr[i] = message.charAt(i);
            reverseWord += arr[i];
//            System.out.println("hashcode for reverseWord string at index: " + i +" ");
//            System.out.println(reverseWord.hashCode());
        }
        return reverseWord;
    }


    //much more efficient than using strings because strings are immutable,
    //rather than create a new string object at each iteration
    //we're simply just adding to the current character sequence, e.g incrementing the char length by 1 .

    public static StringBuilder reverseWithStringBuilder(String message){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = message.length()-1; i >=0;i--){
            stringBuilder.append(message.charAt(i));
//            System.out.println("\nHashcode for string builder at index: "+ i +":");
//            System.out.println(stringBuilder.hashCode());
        }
        return  stringBuilder;
    }


    public static int fib(int n){
        return n <2 ? n : (fib(n-1) + fib(n-2));
    }
}

