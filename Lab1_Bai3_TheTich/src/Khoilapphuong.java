public class Khoilapphuong {
    private double canh;

    public Khoilapphuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double tinhTheTich() {
        return Math.pow(canh, 3); 
    }

    public void xuatTheTich() {
        System.out.println("Thể tích của khối lập phương: " + tinhTheTich());
    }
}
