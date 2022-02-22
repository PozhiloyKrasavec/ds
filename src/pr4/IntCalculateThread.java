package pr4;

import java.util.Vector;

public class IntCalculateThread extends Thread {
    Vector<Polis> polisArray = new Vector<>();
    Thread thread;
    IntCalculateThread(Vector<Polis> polisArray){
        for(int i=0;i<polisArray.size();i++) this.polisArray.add(polisArray.get(i));
        thread = new Thread(this,"IntCalculateThread");
        start();
    }
    public void run(){
        int minPolisNum=1000000;
        try {
            for (int i = 0; i < polisArray.size(); i++) {
                if (polisArray.get(i).getCalculated().getClass().getTypeName().contains("Integer"))
                    if ((int)polisArray.get(i).getCalculated()<minPolisNum)
                        minPolisNum = (int)polisArray.get(i).getCalculated();
            }
        }catch (Exception e){
            System.out.println("Interrupt" + e.getMessage());
        }
        System.out.println("Minimal polis num - "+ minPolisNum + " Thread name - " + thread.getName());
    }
}
