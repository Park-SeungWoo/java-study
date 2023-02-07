public class Singleton {
    private static Singleton singleton;
    private static int cnt;

    private Singleton() {
        cnt = 0;
        System.out.println("Singleton call");
    }

    public int getCnt() {
        return cnt;
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void count() {
        cnt++;
    }
}
