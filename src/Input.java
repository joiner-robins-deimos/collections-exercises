import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        String in = scanner.nextLine();
        return in;
    }
    public boolean yesNo(){
        System.out.print("Enter yes or no");
        String in = this.scanner.nextLine();
        if (in.equalsIgnoreCase("Y") | in.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }
    public int getInt(int min, int max){
        int in;
        do {
            System.out.printf("Enter a number between %s and %s \n", min, max);
            in = Integer.parseInt(this.scanner.nextLine());

        } while (!( in > min & in < max));
        return in;
    }
    public int getInt(){
        int in;
        in = Integer.parseInt(this.scanner.nextLine());
        return in;
    }

    public double getDouble(double min, double max){
        double in;
        do {
            System.out.printf("Enter a number between %s and %s \n", min, max);
            in = Double.parseDouble(this.scanner.nextLine());

        } while (!( in > min & in < max));
        return in;
    }
    public double getDouble(){
        Double in;
        in = Double.parseDouble(this.scanner.nextLine());
        return in;
    }
}
