import java.util.Scanner;

class farmer {
    int pa;
    float td;
    static float ri;
    float si;

    static{
         ri=8.5f;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter amount");
        pa=sc.nextInt();
        System.out.println("Please tell time duration");
        td=sc.nextFloat();
    }
    void compute() {
        si=(pa*ri*td)/100f;
    }
    void dis() {
        System.out.println("SI is "+si);
    }
}
public class FarmerApplication {
    public static void main(String[] args) {
        farmer f1=new farmer();
        f1.input();
        f1.compute();
        f1.dis();
        farmer f2=new farmer();
        f2.input();
        f2.compute();
        f2.dis();
        
    }
    
}
