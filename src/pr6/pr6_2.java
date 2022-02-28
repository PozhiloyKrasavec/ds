package pr6;

import java.util.ArrayList;
import java.util.Scanner;

public class pr6_2 {
    static String[] surnames = {"Lushin","Repin","Fedyakok","Obrazcov","Belkov","Berlykov","Burets","Vakilov","Vlasenko"};
    static String[] compNames = {"SoGaz","RosGos","VTB","SBER"};
    static String[] propType = {"Flat","Single-Family","Condomonium","Apartment","Co-Op"};
    static int calculate(Calculator2 func,ArrayList<MedPolis> medPolisArrayList,ArrayList<PropPolis> propPolisArrayList, String searchingCompName){
        return func.calculate(medPolisArrayList,propPolisArrayList,searchingCompName);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a searching surname");
        String searchingCompName = in.nextLine();
        int n = (int)Math.round(Math.random()*2+3), qntSurnames=0;
        ArrayList<MedPolis> medPolisArrayList = new ArrayList<>();
        CalculateClass calcCls = new CalculateClass();
        ArrayList<PropPolis> propPolisArrayList = new ArrayList<>();
        for (int i=0;i<n;i++) {
            medPolisArrayList.add(new MedPolis(
                    (int)Math.round(Math.random()*100000+100000)
                    ,surnames[(int)Math.round(Math.random() * 8)]
                    ,compNames[(int)Math.round(Math.random()*3)]));
            System.out.println("CHECK:\n\tSurname: "
                    + medPolisArrayList.get(i).getHolderSurname()
                    + "\n\tID: " + medPolisArrayList.get(i).getId()
                    + "\n\tCompany Name: "
                    + medPolisArrayList.get(i).getCompanyName());
        }
        for (int i=0;i<n;i++)
        {
            propPolisArrayList.add(new PropPolis(
                    (int)Math.round(Math.random()*100000+100000)
                    ,surnames[(int)Math.round(Math.random() * 8)]
                    ,propType[(int)Math.round(Math.random()*4)]));
            System.out.println("CHECK:\n\tSurname: "
                    + propPolisArrayList.get(i).getHolderSurname()
                    + "\n\tID: " + propPolisArrayList.get(i).getId()
                    + "\n\tCompany Name: "
                    + propPolisArrayList.get(i).getPropType());
        }

        System.out.println("Quantity of polis with searching surnames: " + calculate(calcCls::calculate,medPolisArrayList,propPolisArrayList,searchingCompName));
    }

}
