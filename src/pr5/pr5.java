package pr5;

import java.util.ArrayList;
import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Polis> polisArrayList = new ArrayList<Polis>();
        for (int i=0;i<10;i++)
        {
            polisArrayList.add(new Polis());
            polisArrayList.get(i).show();

        }
        System.out.println("Enter a searching surname");
        String searchSurname = scanner.nextLine();
        int qntSurnames = 0;
        for (Polis el: polisArrayList)
            if (el.getHolderSurname().equals(searchSurname))
                qntSurnames++;
        System.out.println("Quantity of polises wiht searching family: " + qntSurnames);
    }
}
