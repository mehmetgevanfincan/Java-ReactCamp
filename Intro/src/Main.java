public class Main {
    public static void main(String[] args) {
        //camelCase
        //Don't repeat yourself
        String internetSubeButonu ="İnternet Şubeye gir";
        double dollarYesterday = 8.19;
        double dollarNow = 8.19;
        int vade = 36;
        boolean dustuMu = false;

        System.out.println(internetSubeButonu);

        if(dollarNow<dollarYesterday) {
            System.out.println("down.svg");
        }else if(dollarNow>dollarYesterday) {
            System.out.println("up.svg");
        }
        else {
            System.out.println("eql.svg");
        }

        String kredi1 ="Hızlı Kredi";
        String kredi2 ="Mutlu Emekli Kredisi";
        String kredi3 ="Konut Kredisi";
        String kredi4 ="Çiftcçi Kredisi";
        String kredi5 ="MSB Kredi";
        String kredi6 ="MEB Kredi";

        System.out.println(kredi1);
        System.out.println(kredi2);
        System.out.println(kredi3);
        System.out.println(kredi4);
        System.out.println(kredi5);
        System.out.println(kredi6);

        String[] krediler =
                {
                        "Hızlı Kredi",
                        "Mutlu Emekli Kredisi",
                        "Konut Kredisi",
                        "MSB Kredisi",
                        "MEB Kredisi",
                        "Çiftçi Kredisi",
                        "Kültür Bakanlığı Kredisi"

                };

        //foreach döngüsü
        for(String kredi : krediler) {
            System.out.println(kredi);
        }

        for(int i = 0; i<krediler.length;i++) {
            System.out.println(krediler[i]);
        }

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2= 100;
        System.out.println(sayi1);

        int[] sayilar1= {1,2,3,4,5};
        int[] sayilar2= {10,20,30,40,50};
        sayilar1 = sayilar2;
        sayilar2[0]=100;
        System.out.println(sayilar1[0]);

        String city1 = "Ankara";
        String city2 = "İstanbul";
        city1 = city2;
        city2 = "İzmir";
        System.out.println(city1);
    }
}
