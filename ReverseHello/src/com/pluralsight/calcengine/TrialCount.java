package com.pluralsight.calcengine;


public class TrialCount {
    static Thread[] threads = new Thread[10];
    public static void main(String[] args)
    {
        Count c = new Count(10);
        for(int i=0;i<10;i++)
        {
            threads[i] = new Thread(c);
            threads[i].start();
        }

    }
}

class Count implements Runnable {
    private final long count;
            public Count(long count) {
            this.count=count;

        }
    @Override
    public void run() {
        long sum = 0;
            for (long i = 1; i < count; i++) {
                sum += i;
            }
            System.out.println(sum);
    }


}
//    static Thread[] threads = new Thread[10];
//
//    public static void main(String[] args) {
//
//        Count c = new Count();
//        for (int i = 0; i < 10; i++) {
//            threads[i] = new Thread(c);
//            threads[i].start();
//
////        public void CreateArray () {
////            Thread[] threads = new Thread[10];
////            Count c = new Count(10);
////            for (int i = 0; i < 10; i++) {
////                threads[i] = new Thread(c);
////                threads[i].start();
////
////            }
////        }
//
//        }
//    }
//    static class Count implements Runnable {
//        private final long count;
//        public Count(long count) {
//            this.count=count;
//
//        }
//
//        @Override
//        public void run() {
//            long sum = 0;
//            for (long i = 1; i < count; i++) {
//                sum += i;
//            }
//            System.out.println(sum);
//        }
//    }
//}


