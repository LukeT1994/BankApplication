class Account {

    int id;
    String fName;
    String lName;
    double balance;

//    public Account(int id, String fName, String lName, double balance) {
//        this.id = id;
//        this.fName = fName;
//        this.lName = lName;
//        this.balance = balance;
//    }

    public Account() {

this.id = id;
this.fName = fName;
this.lName = lName;
this.balance = balance;


}



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



}