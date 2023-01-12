public class main {
    public static void Main(String[] args) {

        stack yigin = new stack(10);//dizinin boyutunu belirledik 10 yazdık
        //push ile stacke eleamn eklenir
        yigin.push(5);
        yigin.push(10);
        yigin.push(24);
        yigin.push(15);
        
        yigin.push(43);
        yigin.push(65);
        yigin.push(12);
        //pop ile stackte son giren ilk çıkar mantığıyla silinir
        System.out.println("eleman:"+ yigin.pop());
        System.out.println("eleman:"+ yigin.pop());
        yigin.push(50);

        System.out.println("eleman:"+ yigin.pop());
        System.out.println("eleman:"+ yigin.pop());
        System.out.println("eleman:"+ yigin.pop());
        yigin.push(75);
        System.out.println("peek:"+ yigin.peek());

        while(yigin.isEmpty())
        {
            System.out.print(+yigin.pop()+"-->");
            System.out.print("");


        }
        System.out.print("");
        
}
}