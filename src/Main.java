public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 1.70f;
        float weight = 77f;
        float index = service.calculate(height, weight);
        System.out.println(index);
    }
}
