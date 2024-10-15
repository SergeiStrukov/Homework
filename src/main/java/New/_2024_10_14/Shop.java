package New._2024_10_14;

public class Shop {
    private int itemCount = 0;
    private int orderedCount = 0;

    public synchronized void getItem() throws InterruptedException {
        while (orderedCount <= 0) {
            wait();
        }
        orderedCount--;
        System.out.println("GET ITEM");
        notifyAll();
    }

    public synchronized void putItem() throws InterruptedException {
        while (itemCount >= 5) {
            wait();
        }
        itemCount += 5;
        System.out.println("PUT 5 ITEMS");
        notifyAll();
    }

    public synchronized void deliverItem() throws InterruptedException {
        while (itemCount <= 0) {
            wait();
        }
        itemCount--;
        orderedCount++;
//        itemCount++;
        System.out.println("DELIVER ITEM");
        notifyAll();
    }

    public static void main(String[] args) {
        Shop shop = new Shop();

        Producer producer = new Producer(shop);
        Consumer consumer = new Consumer(shop);
        Deliver deliverer = new Deliver(shop);

        Thread pT = new Thread(producer);
        Thread dT = new Thread(deliverer);
        Thread cT = new Thread(consumer);

        pT.start();
        dT.start(); // Запустите доставщика до потребителя
        cT.start();
    }
}

class Producer implements Runnable {
    Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                shop.putItem();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {
    Shop shop;

    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                shop.getItem();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Deliver implements Runnable {
    Shop shop;

    public Deliver(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                shop.deliverItem();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
