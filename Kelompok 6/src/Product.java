public class Product {
    private String namaProduct;
    private String totalBayar;
    private String saldo;


    public Product() {
    }


    public Product(String namaProduct, String totalBayar, String saldo) {
        this.namaProduct = namaProduct;
        this.totalBayar = totalBayar;
        this.saldo = saldo;
    }


    public String getNamaProduct() {
        return this.namaProduct;
    }

    public void setNamaProduct(String namaProduct) {
        this.namaProduct = namaProduct;
    }

    public String getTotalBayar() {
        return this.totalBayar;
    }

    public void setTotalBayar(String totalBayar) {
        this.totalBayar = totalBayar;
    }

    public String getSaldo() {
        return this.saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "{" +
            " namaProduct='" + getNamaProduct() + "'" +
            ", totalBayar='" + getTotalBayar() + "'" +
            ", saldo='" + getSaldo() + "'" +
            "}";
    }

}