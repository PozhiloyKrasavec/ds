package pr1;

public enum Prod {
    OS1((int) Math.round(Math.random() * 44 + 8),"Meta",64),
    OS2((int) Math.round(Math.random() * 44 + 8),"ChelEnt",64),
    OS3((int) Math.round(Math.random() * 44 + 8),"Hoyovers",32),
    Textred1((int) Math.round(Math.random() * 40 + 8),"Microsoft",1.2),
    Textred2((int) Math.round(Math.random() * 40 + 8),"Huawei",1.4),
    Textred3((int) Math.round(Math.random() * 40 + 8),"Samsung",1.6);
    private int kolvo;
    private String proizv;
    private double vers;
    private int razr;
    Prod(int x,String s,double vers) {
        kolvo = x;
        proizv = s;
        this.vers = vers;
    }
    Prod(int x,String s,int razr) {
        kolvo = x;
        proizv = s;
        this.razr = razr;
    }
    int getKolvo() {
        return kolvo;
    }
    public String getProizv() {
        return proizv;
    }
    public double getVers() {
        return vers;
    }
    public int getRazr() {
        return razr;
    }
}