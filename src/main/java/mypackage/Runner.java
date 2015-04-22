package mypackage;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Running...");

        if (args.length > 0 && args[0].equals("fail")) {
            throw new IllegalArgumentException("boooh");
        }
    }
}
