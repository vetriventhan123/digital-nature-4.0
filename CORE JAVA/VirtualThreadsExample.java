public class VirtualThreadsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> {
                // Virtual thread work (printing can be commented out for performance)
                // System.out.println("Virtual thread running.");
            });
        }
        System.out.println("Launched 100,000 virtual threads.");
    }
}