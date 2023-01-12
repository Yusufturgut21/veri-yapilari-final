public class agac
{
    public static void main(String[] args)
    {
        DengeliAgac agac = new DengeliAgac();
        System.out.println("Dengeli Ağaç \n");

        agac.insert(5);
        agac.insert(4);
        agac.insert(10);
        agac.insert(8);
        agac.insert(11);
        agac.insert(12);
        agac.insert(15);

        System.out.println("\nPre-order  :");
        agac.preorder();
        System.out.println("\nIn-order   :");
        agac.inorder();
        System.out.println("\nPost-order :");
        agac.postorder();
        //scan.close();
    }
}