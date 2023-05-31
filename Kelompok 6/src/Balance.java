public class Balance {
   /* john michael chenardy 03081220008 */
    /*  - Didalam check balance terdapat Fungsi getBalance yang Merupakan fungsi yang berguna untuk tidak mengembalikan nilai /void.
            terdapat  dua parameter, yaitu :
            noTelp yang merupakan nomor telepon yang akan dicari saldo-nya.
        data yang merupakan list data no telepon user yang akan didekomposisi.
        - Kerja Fungsi ini menampilkan saldo user dengan cara mengambil data nomor telepon user yang disimpan didalam server.
        - fungsi ini juga menampilkan output berupa no telephon user, nama user dan saldo dari akun tersebut.
        - dalam balance terdapat atribut berupa int, string dan system out
        
      */

  private String noRe;
  private String saldo;


  public String getNoRe() {
    return this.noRe;
  }

  public void setNoRe(String noRe) {
    this.noRe = noRe;
  }

  public String getSaldo() {
    return this.saldo;
  }

  public void setSaldo(String saldo) {
    this.saldo = saldo;
  }

}