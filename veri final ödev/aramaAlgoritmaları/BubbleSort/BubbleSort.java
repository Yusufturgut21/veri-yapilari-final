class BubbleSort //bigo notasyonu n^2/2  n^2
{ 
    void bubbleSort(int dizi[]) 
    { 
        int n = dizi.length; //dizi boyutunu alıp n değerine atarız
        //bir for döngüsü kurarak i'yi 0'dan başlatarak dizi boyutunun bir eksiğine kadar arttırırz
        for (int i = 0; i < n-1; ++i) 
            for (int j = 0; j < n-i-1; ++j) 
                if (dizi[j] > dizi[j+1]) 
                {  // swap işlemi dizi[j+1] ve dizi[j] ile dizi[j] ve dizi[j+1] ve temp değerini sürekli güncelleriz
                    int temp = dizi[j]; //geçici değişkene ata
                    dizi[j] = dizi[j+1]; //değişimi yap
                    dizi[j+1] = temp; //geçici değişkene al
                    
                    for (int m=0; m<n; m++) { //anlık güncellenen ve değişimi yapılan diziyi yazırmak için kul.
                        System.out.print(dizi[m] + " ");
                }
                System.out.println(i+1+". aşama ");
            }
    } 
    // Algortimayı Test etme 
    public static void main(String args[]) 
    {
        BubbleSort ob = new BubbleSort(); 
        int dizi[] = {20, 34, 13, 5, 9, 80, 1, 3}; 
        ob.bubbleSort(dizi); 
        System.out.println("Sıralı Dizi: "); 
        ob.diziyiYazdir(dizi); 
    } 


      
    /* diziyi yazdırmak için kullanılır*/
    void diziyiYazdir(int dizi[]) 
    { 
        int n = dizi.length; 
        for (int i=0; i<n; i++) 
            System.out.print(dizi[i] + " "); 
        System.out.println(); 
    } 
} 