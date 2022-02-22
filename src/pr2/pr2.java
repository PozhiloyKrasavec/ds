package pr2;

import java.util.Scanner;
import java.util.Vector;

public class pr2 {
    static String[] surNames = {"Лушин", "Образцов", "Федякок"};

    static class Polis<Dk> {
        private String type = "medicine";
        private Dk calculated;

        Polis(Dk calculated) {
            this.calculated = calculated;
            if (calculated.getClass().getTypeName().contains("Integer")) type = "pension";
        }

        public String getType() {
            return type;
        }

        public Dk getCalculated() {
            return calculated;
        }
        public String show(int index)
        {
            String str = "\n\tPolis num: " + index + "\n\tpolis type: " + this.getType();
            return  str;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qntSurnames = 0, minNumPolis = 2000000,ans=0;
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
        for (int i = 0; i < n; i++) {
            if (polisArray.elementAt(i).getCalculated().getClass().getTypeName().contains("Integer")) {
                if (minNumPolis > (int) polisArray.elementAt(i).getCalculated())
                {
                    minNumPolis = (int) polisArray.elementAt(i).getCalculated();
                    ans = i;
                }
            } else if (polisArray.elementAt(i).getCalculated().equals(insertSurname)) qntSurnames++;
        }
        System.out.println("Surnames quantity - " + qntSurnames + "\nMinimal polis number - " + minNumPolis + "\nPolis: " + polisArray.get(ans).show(ans));
    }

}
