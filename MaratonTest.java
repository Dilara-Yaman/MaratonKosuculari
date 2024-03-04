public class MaratonTest { //Dilara Yaman 2023141023
    public static void main(String[] args) {

        String[] isimler = {"Kadir","Gökhan","Hakan","Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak"};
        int[] dakikalar = {341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};

        Maraton maratonum = new Maraton(dakikalar,isimler);
        System.out.println("Birinci: " + isimler[maratonum.Birinci()] + " " + dakikalar[maratonum.Birinci()] + "'");
        System.out.println("İkinci: " + isimler[maratonum.Ikinci()] + " " + dakikalar[maratonum.Ikinci()] + "'");
        System.out.println("Üçüncü: " + isimler[maratonum.Ucuncu()] + " " + dakikalar[maratonum.Ucuncu()] + "'");
        maratonum.abc();
    }
}
