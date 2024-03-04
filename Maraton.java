public class Maraton { //Dilara Yaman 2023141023

    private final int[] dakikalar;
    private final String[] isimler;

    public Maraton(int[] dakikalar, String[] isimler) {
        this.dakikalar = dakikalar;
        this.isimler = isimler;
    }

    public int Birinci() {
        int minimum1 = 0;
        for (int i = 0; i < dakikalar.length ; i++) {
            if (dakikalar[minimum1] > dakikalar[i]) {
                minimum1 = i;
            }
        }
        return minimum1;
    }

    public int Ikinci() {
        int minimum2 = 0;
        int minimum1 = Birinci();
        for (int i = 0; i < dakikalar.length; i++) {
            if (dakikalar[minimum2] > dakikalar[i] && dakikalar[i] > dakikalar[minimum1]){
                minimum2 = i;
            }
        }
        return minimum2;
    }

    public int Ucuncu() {
        int minimum3 = 0;
        int minimum2 = Birinci();
        int minimum1 = Ikinci();
        for (int  i = 0;  i < dakikalar.length ;  i++) {
            if (dakikalar[minimum3] > dakikalar[i] && dakikalar[i] > dakikalar[minimum1] && dakikalar[i] > dakikalar[minimum2])
                minimum3 = i;
        }
        return minimum3;

    }

    public void abc() {
        int A = 0;
        int B = 0;
        int C = 0;
        for (int i = 0; i < dakikalar.length ; i++) {
            if (dakikalar[i] < 300 && dakikalar[i] >= 200)
                A++;
            else if (dakikalar[i] < 400)
                B++;
            else
                C++;
        }

        System.out.println("A -> " + A);
        System.out.println("B -> " + B);
        System.out.println("C -> " + C);


    }
}
