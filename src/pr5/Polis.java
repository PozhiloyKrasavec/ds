package pr5;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@interface MyAnno{
    String className();
}
public class Polis {
    static String[] surnames = {"Lushin","Repin","Fedyakok","Obrazcov","Belkov","Berlykov","Burets","Vakilov","Vlasenko"};
    static String[] compNames = {"SoGaz","RosGos","VTB","SBER"};
    static String[] propTypes = {"Flat","Single-Family","Condomonium","Apartment","Co-Op"};


    int id;
    String holderSurname;
    MedPolis medPolis;
    PropPolis propPolis;

    Polis(){
        id = (int)(Math.round(Math.random()*200000+100000));
        holderSurname = surnames[(int)(Math.round(Math.random()*8))];
        medPolis = new MedPolis();
        propPolis = new PropPolis();
    }
    public void show()
    {
        System.out.println("Holder surname - " + holderSurname + "\nID - " + id);
        propPolis.show();
        medPolis.show();
    }
    @MyAnno(className = "MedPolis")
    class MedPolis{
        String companyName;
        MedPolis(){
            this.companyName = compNames[(int)(Math.round(Math.random()*3))];
        }
        public void show(){
            System.out.println("\tCompanyName - " + companyName);
        }
    }
    @MyAnno(className = "PropPolis")
    class PropPolis{
        String propType;
        PropPolis(){
            this.propType = propTypes[(int)(Math.round(Math.random())*4)];
        }
        public void show(){
            System.out.println("\tPropertyType - " + propType);
        }
    }

    public int getId() {
        return id;
    }

    public String getHolderSurname() {
        return holderSurname;
    }
}
