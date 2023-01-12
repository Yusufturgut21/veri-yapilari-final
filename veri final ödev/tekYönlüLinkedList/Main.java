import java.util.Scanner;//klavyeden veri almak için 
public class Main {
    public static void main(String[] args) {
        List ogrNo= new List();
        int veri,secim;
        Node e;
        Node etail;
        do {
            System.out.println(" 1-15 arasi komutu giriniz:");
			Scanner oku = new Scanner(System.in);//kullanicidan deger almak için kütüphane çagrilir
			secim = oku.nextInt();
            
            switch(secim){

                case 1:////////liste basına eleman ekleme//////////
                    System.out.println("Liste Basina eknecek ögrenci numarasi giriniz= ");
                    Scanner deger = new Scanner(System.in);//kullanicidan deger almak için kütüphane çagrilir
                    veri = deger.nextInt();// veri alinir
                    e = new Node(veri);//node çevrilir
				    ogrNo.listHeadAdd(e);//liste başına eklenir
                    ogrNo.listPrint();//yazdirma
                    break;

                case 2:////////listenin sonuna eleman ekleme/////////
                    System.out.println("Liste Sonuna eknecek ögrenci numarasi giriniz= ");
                    Scanner deger2 = new Scanner(System.in);//kullanicidan deger almak için kütüphane çagrilir
                    veri = deger2.nextInt();// veri alinir
                    e = new Node(veri);//node çevrilir
                    ogrNo.listTailAdd(e);//liste başına eklenir
                    ogrNo.listPrint();//yazdirma
                    break;

                case 3:///////listede eleman aramak için kullanılır
                    System.out.println("Listede aranacak elemani giriniz= ");
                    Scanner eleman = new Scanner(System.in);//kullanicidan deger almak için kütüphane çagrilir
                    veri = eleman.nextInt();// veri alinir
                    int sonuc=ogrNo.listSearch(veri);
                    if(sonuc==-1)
                        System.out.println("Listede "+veri+" bulunamadi!");
                    else
                        System.out.println("Listede aranan"+veri+" sayisi "+sonuc+". siradadir.");
                    break; 

                case 4://listenin başından eleman silmek için kullanılır//////
                    System.out.println("Liste başından eleman sil");
                    ogrNo.listHeadDelete();//liste başına eklenir
                    ogrNo.listPrint();//yazdirma
                    break;


                case 5://///listenin sonundan eleman silmek için////////
                    System.out.println("Liste sonundan eleman sil");
                    ogrNo.listTailDelete();//liste başına eklenir
                    ogrNo.listPrint();//yazdirma
                    break;

                case 6://////listenin ortasından eleman silmek için kullanılır///////
                    System.out.println("Liste ortasından silinecek elemenı giriniz= ");
                    Scanner eleman2 = new Scanner(System.in);//kullanicidan deger almak için kütüphane çagrilir
                    veri = eleman2.nextInt();// veri alinir
                    int sonuc1=ogrNo.ortadanSil(veri);
                    if(sonuc1==-1)
                        System.out.println("Listede "+veri+" bulunamadi!");
                    else
                        System.out.println("Listede aranan"+veri+" sayisi "+sonuc1+". siradadir.");
                    break; 

                case 7:///////listenin ortasından silinene elemanın sırasını verir/////
                    System.out.println("Liste ortasından silinecek elemenının sırasını giriniz= ");
                    Scanner eleman3 = new Scanner(System.in);//kullanicidan deger almak için kütüphane çagrilir
                    int sira = eleman3.nextInt();// sıra alinir

                    System.out.println("Liste ortasına eknecek ögrenci numarasi giriniz= ");
                    Scanner orta = new Scanner(System.in);//kullanicidan deger almak için kütüphane çagrilir
                    veri = orta.nextInt();// veri alinir
                    e = new Node(veri);//node çevrilir
                    ogrNo.ortayaEkle(e, sira);
                    ogrNo.listPrint();//yazdirma
                    break; 
                default:
            break;
            }
        } while (secim!=20);
    }
}