
public class ThreadTest {

    public static void main(String[] args) {

        SaleTicketThread t1 = new SaleTicketThread("窗口1");
        SaleTicketThread t2 = new SaleTicketThread("窗口2");
        SaleTicketThread t3 = new SaleTicketThread("窗口3");
        SaleTicketThread t4 = new SaleTicketThread("窗口4");
        SaleTicketThread t5 = new SaleTicketThread("窗口5");
        System.out.println("test");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
