public class List {

    Node head;// head adında bir node
    Node tail;// tail adında bir node

    // listenin YAPILANDIRICI sınıfıdır.
    public List() {
        head = null;
        tail = null;
    }

    // Liste başına eleman ekleme
    void listHeadAdd(Node yeni) {//başa ekle
        if (head == null) {//head bo ise
            head = yeni;//yeniyi head yap
            tail = yeni;//yeniyi tail yap
        } else {
            yeni.next = head;//head i yeninin next i yap
            head = yeni;//headi yeni yap
        }
    }

    // Liste sonuna eleman ekleme
    void listTailAdd(Node yeni) {
        if (tail == null) {//tail boş ise
            tail = yeni;//taili yeni yap
            head = yeni;//headi yeni yaparız
        } else {
            tail.next = yeni;//tailin nextini yeni yap
            tail = yeni;//tail yeni yap
        }
    }

    int listSearch(int deger)// Listte aranan elemanın kaçıncı sırada olduğunu verir
    {
        int sayac = 1;//sayacı 1 den başlat
        Node tmp;
        tmp = head;//headi tmp olarak tut
        while (tmp != null)// tmp boş değilse
        {
            if (tmp.data == deger)//tmp nin datası degere eşit ise
                return sayac;// sayaç değerini gönder döngüyü bitir
            tmp = tmp.next;// bir sonraki düğüme geç
            sayac++;
        }
        return -1;// değer bulunmadı
    }

    int listSearch2(int veri){//list arama
        Node tmp;
        tmp = head;
        int sira=1;//sıra degerini 1 al
        while (tmp != null) {//List BOŞ DEĞİLSE
            if(tmp.data==veri)//eşit se veriyi buldu
                return sira;//sıra numarasını gönder
            else{//eşit değilse
                tmp=tmp.next;//bir sonrakine ilerle
                sira++;//sıra noyu 1 artır.
            }
        }
        return -1;//List boş ise veya değer bulunmadıysa -1 gönder
    }



    int listHeadDelete()// Liste başındaki elemanı siler
    {
        int sayi = -1;
        if (head != null)// bir dizimiz varsa
            sayi = head.data;// baştaki elemanın değerini al
        head = head.next;// bir sonraki elemana geç
        if (head == null)// eleman kalmadıysa
            tail = null;// tail'i de null yap
        return sayi;// silinen her sayıyı gönder
    }

    int listTailDelete()//Liste sonundaki elemanı siler
	{
		Node tmp,prev;//bir temp ve prev yani öncekinin adresini tutar
		tmp = head;
		prev = null;
		while(tmp!=tail)
		{
			prev=tmp;//prev i tmp olarak al
			tmp = tmp.next;//tmp in nextini tmp olarak al
		}
		if(prev==null)
			head=null;
		else
			prev.next = null;
		tail=prev;
        return 0;
		
	}

    int listeSondanSil(){//listeyi sondan silme
        System.out.println("Liste sondan silme");
        Node tmp=head;
        System.out.println(tmp.next.next.data);
        //Node prev=null;
        while(tmp.next!=null){
            if(tmp.next.next!=null)
                tmp=tmp.next;
            else
                break;
        }
        tmp.next=null;
        tail=tmp;
        System.out.println("Liste sondan silme2");
        return 0;
    }

    int ortadanSil(int deger){
        int sayi = -1;
        Node tmp,prev;
		tmp = head;
		prev = tmp;
        while (tmp != null)// tmp boş değilse
        {
            if (tmp.data != deger){
                prev=tmp;
                tmp=tmp.next;
            }
            else{
                sayi=tmp.data;
                prev.next=tmp.next;//????
                tmp.next=null;
                return sayi;
            }
        }
        return sayi;// değer bulunmadı

    }

    void ortayaEkle(Node yeni,int sno ){//ortaya eleman eklmeke için kullanılır
        Node tmp;
		tmp = head;
        int sayac=0;
        while (tmp != null)// tmp boş değilse
        {
            if (sayac == sno){
                yeni.next=tmp.next;
                tmp.next=yeni;
            }
            tmp = tmp.next;// bir sonraki düğüme geç
            sayac++;
        }
    }


    void listPrint() {//listi yadırmak için  kullanılır
        System.out.println("------Bağlı Liste------");
        Node tmp;
        tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data);
            System.out.print("-->");
            tmp = tmp.next;
        }
        System.out.println(" ");
        System.out.println("-----------------------");
    }
}

