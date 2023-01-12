public class Main {
    public static void main(String[] args) {
        // 5 elemanlık kuyruğumuz yani boyutu 5 dir.
        kuyruk kuyrugumuz = new kuyruk(5);
        
        // insertme ve gözatma testleri 2
        kuyrugumuz.insert(15);
        //kuyrukNerede fonksiyonu çağrılarak önceki elemanın yerini tespit eder
        System.out.println("\nÖndeki eleman: " + kuyrugumuz.kuyrukNerde());
        kuyrugumuz.insert(25);
        kuyrugumuz.insert(35);
        kuyrugumuz.insert(45);
        kuyrugumuz.insert(85);

        // çıkarma ve gözatma testleri 2
        //remove ile eleman çıkartılır
        System.out.println("\nÇıkan eleman: " +kuyrugumuz.remove());
        System.out.println("Öndeki eleman: " +kuyrugumuz.kuyrukNerde());
        System.out.println("Çıkan eleman: " +kuyrugumuz.remove());
        System.out.println("Çıkan eleman: " +kuyrugumuz.remove());
        System.out.println("Çıkan eleman: " +kuyrugumuz.remove());
        System.out.println("Öndeki eleman: " +kuyrugumuz.kuyrukNerde());
    }
}