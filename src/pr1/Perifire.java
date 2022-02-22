package pr1;

public enum Perifire {
        Printer1((int) Math.round(Math.random() * 100 + 50),"LG","ffffe"),
        Printer2((int) Math.round(Math.random() * 100 + 50),"HP","ffffe"),
        Printer3((int) Math.round(Math.random() * 100 + 50),"Xerox","fffef"),
        Monitor1((int) Math.round(Math.random() * 100 + 50),"Asus",12),
        Monitor2((int) Math.round(Math.random() * 100 + 50),"Dell",23),
        Monitor3((int) Math.round(Math.random() * 100 + 50),"Honor",12);
        private int price;
        private String type;
        private int diag;
        private String color;


        Perifire(int x,String s,int diag) {
            price = x;
            type = s;
            this.diag = diag;
        }
        Perifire(int x,String s,String color) {
            price = x;
            type = s;
            this.color = color;
        }

        int getPrice() {
            return price;
        }

        public String getType() {
            return type;
        }

        public int getDiag() {
            return diag;
        }

        public String getColor() {
            return color;
        }
    }
