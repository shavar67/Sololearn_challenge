package java_challenge.bowling;

import java.util.*;

public class Bowling {

    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner(){
        int max = (Collections.max(players.values()));
        for(Map.Entry<String,Integer> entry : players.entrySet()){
            if(entry.getValue() == max){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }

        }

    }

}


class Program{

    public static void main(String[] args) {
        Bowling bowling = new Bowling();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name and points");
        for(int i =0; i < 3;i++){
            if(sc.hasNext()){

                String input = sc.nextLine();
                String [] value = input.split(" ");
                String name = value[0];
                int points = Integer.parseInt(value[1]);
                bowling.addPlayer(name,points);

            }

        }
        bowling.getWinner();
    }
}