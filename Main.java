import controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        Controller controller = new Controller(sc);
        while(true){
            controller.selectMode();
        }
    }
}
