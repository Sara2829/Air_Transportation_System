public  class User {
    protected int userId ;
    protected String name ;
    protected String email;
    protected String password;
    protected String phoneNumber;




    public User(int userId,String name,String email,String password,String phoneNumber) {
        this.userId = userId;
        this.name=name;
        this.email=email;
        this.password=password;
        this.phoneNumber=phoneNumber;
    }


}
