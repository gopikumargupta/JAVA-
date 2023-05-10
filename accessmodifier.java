public class accessmodifier {
    BankAccount b = new BankAccount();
    b.username = "gopi";
    System.out.println(b.username);

}
class BankAccount{
    public String username;
    private String password;
    public void setPas(String pas){
        password=pas;
    }
}
