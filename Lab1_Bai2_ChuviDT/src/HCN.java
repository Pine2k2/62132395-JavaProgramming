public class HCN {
    private double canhDai;
    private double canhRong;

    public HCN(double canhDai, double canhRong) {
        this.canhDai = canhDai;
        this.canhRong = canhRong;
    }

    public double getCanhDai() {
        return canhDai;
    }

    public void setCanhDai(double canhDai) {
        this.canhDai = canhDai;
    }

    public double getCanhRong() {
        return canhRong;
    }

    public void setCanhRong(double canhRong) {
        this.canhRong = canhRong;
    }

    public double tinhChuVi() {
        return 2 * (canhDai + canhRong);
    }

    public double tinhDienTich() {
        return canhDai * canhRong;
    }

    public double timCanhNho() {
        return Math.min(canhDai, canhRong);
    }

    public void xuatThongTin() {
        System.out.println("Chu vi của hình chữ nhật: " + tinhChuVi());
        System.out.println("Diện tích của hình chữ nhật: " + tinhDienTich());
        System.out.println("Cạnh nhỏ của hình chữ nhật: " + timCanhNho());
    }
}
