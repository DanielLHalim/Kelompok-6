public class User {
    public String nomorRekening;
    public String username;
    public String password;
    

    public User() {
    }
    public User(String nomorRekening, String username, String password) {
    this.nomorRekening = nomorRekening;
    this.username = username;
    this.password = password;
      
  }
  public void setnomorRekening(String nomorRekening) {
      this.nomorRekening = nomorRekening;
  }
  public String getnomorRekening() {
      return nomorRekening;
  }
  public void setusername(String username) {
      this.username = username;
  }
  public String getusername() {
      return username;
  }
  public void setpassword(String password) {
      this.password = password;
  }
  public String getpassword() {
      return password;
  }


    @Override
    public String toString() {
        return "{" +
            " " + getnomorRekening() + "'" +
            " " + getusername() + "'" +
            " " + getpassword() + "'" +
            "}";
    }
    public static void add(User user) {
    }
    public Object getNomorRekening() {
        return null;
    }


}