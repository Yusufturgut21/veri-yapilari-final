class Node
{  
    Node left;//düğüm sol
    Node right;//düğüm sağ
    int data;//düğüm verisi
    int height;//düğüm yüksekliği
    public Node()//nodun yapıcı fonksiyonu
    {
        left = null;//düğümün solunu nulla eşitleriz
        right = null;//düğümün sağını nulla eşitleriz
        data = 0;
        height = 0;
    }
    public Node(int n)//yeni eleman gelince node dönüşmesi için kullanılır
    {
        left = null;
        right = null;
        data = n;
        height = 0;
    }
}
