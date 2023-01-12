public class kuyruk {
  // private değişkenler
  private int maxBoyut;
  private long[] kuyrukDizi;
  private int front;//ön
  private int rear;//arka
  private int elemanSayisi;
   

  // kuyruk degisken_ismi = new kuyruk (eleman_sayisi);
  public kuyruk (int boyut){
    maxBoyut = boyut;
    kuyrukDizi = new long [maxBoyut];
    front = 0;
    rear = -1;
    elemanSayisi = 0;
  }



  // ----------------------FONKSİYONLAR---------------------//


  // kuyruk boş mu?----------------------
  public boolean bosMu() {
    if (elemanSayisi == 0) return true;//kuyrukta eleman yoksa yani 0'a eşit ise kuyruk boş yani true döndürür
    else return false;//eleman sayısı 0'a eşit değilse kuyrukta eleman olduğunu gönderir yani false
  }


  ///////////// kuyruk dolu mu?/////////////////
  public boolean doluMu() {
    if (elemanSayisi == maxBoyut) return true;//eleman sayhısı maxboyuta eşitse yani kuyruktaki yerin tamamı doluysa true gönderir
    else return false;//değilse false gönderir
  }



 //////////// kuyruğa eleman ekleme///////////
  public void insert (long eklenecekEleman){
    if (rear == maxBoyut -1)//kuyruk dolduysa 
        rear = -1;
    rear++;
    kuyrukDizi [rear] = eklenecekEleman;
    elemanSayisi++;
  }


  /////////// kuyruktan eleman silme////////////
  public long remove(){
    long cikarilacak = kuyrukDizi [front++];
    if (front == maxBoyut) //maxboyutu fronta eşit ise 
      front = 0;//front 0 olur
    elemanSayisi--;//eleman sayısını bir azaltır
    return cikarilacak;//diziden hangi eleman çıkartılmış ise onu return  ile dönderir
  }



  ///////////kuyruğun sonundaki eleman////////////
  //kuyruğun nerde olduğunu bulur
  public long kuyrukNerde() {
    return kuyrukDizi[front];
  }
   


  public long cikart() {
    if (front >= rear) { // kuyruk bitmediyse
        // çıkartılacak değeri geçici değişkenimize atıyoruz.
        long d = kuyrukDizi[rear++];
        // çıkartılacak değerin yerini 0'a eşitliyoruz.
        kuyrukDizi[rear - 1] = 0;

        if(rear > front) // son elemana kadar çıkarttığımızda
        {
            // yeni eleman ekleyebilmemiz için
            // ön ve rearyı sıfırlıyoruz.
            rear = 0;
            front = -1;
        }
      return d; // geçici değişkenimizi gönderiyoruz.
    }
        return elemanSayisi;
}

   
  // kuyruğun boyutu
  public int kuyrukBoyutu() {
    return elemanSayisi;
  }
}