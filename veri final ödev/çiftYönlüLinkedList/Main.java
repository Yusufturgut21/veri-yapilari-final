public class Main {
    public static void main(String[] args) {
    
        DBList d=new DBList();
        d.ekle("elif");   
        d.ekle("serhat");
        d.ekle("ömer");
        d.ekle("kader");
        d.ekle("ismail");
        d.listele();
        d.sil("ibrahim");
        System.out.println();
        d.listele();
    }
}