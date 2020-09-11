
public class SaleTicketThread extends Thread {

    private String name;

    /**
     * 定义共享的数据100张票
     */
    static int tickets = 100;

    //创建一个锁对象，这个对象是多个线程对象共享的数据
    static Object obj = new Object();


    public SaleTicketThread(String name) {
        this.name = name;


    }

    @Override
    public void run() {

        //卖票是持续的
        while (true){

            synchronized (obj){
                if(tickets > 0){
                    System.out.println(name+"卖出座位是"+(tickets--)+"号");
                }else{
                    break;
                }
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(name+"卖票结束");
    }
}