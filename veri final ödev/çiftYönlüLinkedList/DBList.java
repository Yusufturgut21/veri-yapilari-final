public class DBList {
    Nod head;
    public void ekle(String isim)
    {
        Nod yeniNod=new Nod();
        yeniNod.setIsim(isim);
        if(head==null)//head boşssa yani ilk node boş ise
        {
            head=yeniNod;//yeni node yi head yap
            head.setSonraki(yeniNod);//yeni nodun sonraki degerini tutar
            head.setOnceki(yeniNod);//yeni nodun önceki degerini tutar
            return;
        }
        Nod temp=head.getOnceki();//headin önceki degerini temp olarak tutar
        temp.setSonraki(yeniNod);
        yeniNod.setOnceki(temp);
        yeniNod.setSonraki(head);
        head.setOnceki(yeniNod);
    }


    public void sil(String ad)
    {
        if(head==null)//head boşsa
        {
            System.out.println("Liste boş"); return;//liste boş yazdır
        }
        Nod temp=head;//headı nod tmp olarak tutar
        while(temp.getIsim()!=ad)
        {
            temp=temp.sonraki; //tempin sonrası tmp tutar
        }
        temp.onceki.setSonraki(temp.sonraki);
        temp.sonraki.setOnceki(temp.onceki);
    
    }
    public void listele()
    {
        if(head==null)//head boşssa
        {
        System.out.println("liste boş");//liste boş yazdırır
        return;
        }

        System.out.println("Listesi: ");
        System.out.print(head.isim+" <--> ");//headin ismini yazdırır
        Nod temp=head.sonraki;
        while(temp!=head)
        {
            System.out.print(temp.isim+" <--> ");
            temp=temp.sonraki;
            if(temp.sonraki==null)
                System.out.print("dddddd");
        }
    }
    
}