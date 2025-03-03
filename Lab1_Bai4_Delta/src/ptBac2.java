public class ptBac2 {
    private double a;
    private double b;
    private double c;

    public ptBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double tinhDelta() {
        return (b * b) - (4 * a * c);
    }

    public void xuatCanDelta() {
        double delta = tinhDelta();
        if (delta >= 0) {
            System.out.println("Căn delta: " + Math.sqrt(delta));  // Xuất căn delta
        } else {
            System.out.println("Delta âm, không thể tính căn delta.");
        }
    }
}
