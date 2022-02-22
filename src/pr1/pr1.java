package pr1;

import java.util.Scanner;
public class pr1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите искомое имя компании");
        String l = in.nextLine();
        int ans = 0;
        Prod g = null;
        for (Prod m: Prod.values())
        {
            System.out.println(m.getProizv() + ": "+ m.getKolvo());
            if (l.equals(m.getProizv())){
                ans+= m.getKolvo();
                g = m;
            }
        }
        if (g.getVers() == 0){
            System.out.println("Ответ: \n" + "\tКоличество товара производителя " + g.getProizv() + " - " + ans + "." + "\n" + "\tДругие характеристики товара (разрядность) - " + g.getRazr());
        }
        else {
            System.out.println("Ответ: \n" + "\tКоличество товара производителя " + g.getProizv() + " - " + ans + "." + "\n" + "\tДругие характеристики товара (версия) - " + g.getVers());
        }
    }
}

