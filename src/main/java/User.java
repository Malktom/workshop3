public class User {

    private int id;
    private String userName;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id: "+this.id+", imie: "+this.userName+", email: "+this.email;
    }
    public boolean checkPassword(String password) {     // sprawdzenie hasla, porownanie
        return BCrypt.checkpw(password, this.password);
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
