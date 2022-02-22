package pr4;

import java.util.Scanner;
import java.util.Vector;

public class pr4_main {
    static String[] surNames = {"Лушин", "Образцов", "Федякок"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qntSurnames = 0, minNumPolis = 2000000;
        System.out.println("Insert a searching surname");
        String insertSurname = scanner.nextLine();
        Vector<Polis> polisArray = new Vector<>();
        int n = (int) Math.round(Math.random() * 20 + 5);
        System.out.println("ArraySize: " + n);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                polisArray.add(new Polis<Integer>((int) Math.round(Math.random() * 200000 + 100000)));
            } else polisArray.add(new Polis<String>(surNames[(int) Math.round(Math.random() * 2)]));
            System.out.println("CHECK: "
                    + polisArray.get(i).getCalculated()
                    + ", Type -  "
                    + polisArray.get(i).getCalculated().getClass().getTypeName().subSequence(10, polisArray.get(i).getCalculated().getClass().getTypeName().length()));
        }
        StringCalculateThread thread1 = new StringCalculateThread(polisArray,insertSurname);
        IntCalculateThread thread2 = new IntCalculateThread(polisArray);
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            System.out.println("Threads interrupts");
        }

    }

}
