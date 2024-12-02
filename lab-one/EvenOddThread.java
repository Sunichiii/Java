public class EvenOddThread {
    static class PrintEvenOdd {
        private int number = 1;

        public synchronized void printOdd() throws InterruptedException {
            while (number <= 20) {
                if (number % 2 == 0) {
                    wait();
                }
                if (number <= 20) {
                    System.out.println("Odd: " + number);
                    number++;
                    notify();
                }
            }
        }

        public synchronized void printEven() throws InterruptedException {
            while (number <= 20) {
                if (number % 2 != 0) {
                    wait();
                }
                if (number <= 20) {
                    System.out.println("Even: " + number);
                    number++;
                    notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        PrintEvenOdd obj = new PrintEvenOdd();
        Thread t1 = new Thread(() -> {
            try {
                obj.printOdd();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                obj.printEven();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();
    }
}
