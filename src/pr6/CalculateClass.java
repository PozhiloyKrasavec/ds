package pr6;

import java.util.ArrayList;

public class CalculateClass {
    public int calculate(ArrayList<MedPolis> medPolisArrayList, ArrayList<PropPolis> propPolisArrayList, String searchingCompName) {
        int temp = 0;
        for (int i = 0; i < medPolisArrayList.size(); i++) {
            if (propPolisArrayList.get(i).getHolderSurname().equals(searchingCompName)) temp++;
            if (medPolisArrayList.get(i).getHolderSurname().equals(searchingCompName)) temp++;
        }
        return temp;
    }
}
