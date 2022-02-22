package pr4;

import java.util.Vector;

public class StringCalculateThread extends Thread{
    Vector<Polis> polisArray = new Vector<>();
    String insertSurname;
    Thread thread;
    StringCalculateThread(Vector<Polis> polisArray,String insertSurname){
        for(int i=0;i<polisArray.size();i++) this.polisArray.add(polisArray.get(i));
        this.insertSurname = insertSurname;
        thread = new Thread(this,"StringCalculate");
        start();
    }
    public void run(){
        int qntSurname=0;
        try {
            for (int i = 0; i < polisArray.size(); i++) {
                if (polisArray.get(i).getCalculated().getClass().getTypeName().contains("String"))
                    if (polisArray.get(i).getCalculated().equals(insertSurname))
                        qntSurname++;
            }
        }catch (Exception e){
            System.out.println("Interrupt" + e.getMessage());
        }
        System.out.println("Surnames quantity - "+ qntSurname + " Thread name - " + thread.getName());
    }
}
