public class Card {
    private String firstname;
    private String lastname;
    private long cardnumber;
    protected double balans;
    private int pasword;



    public Card(String firstname,String lastname,long cardnumber,double balans,int pasword) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cardnumber = cardnumber;
        this.balans = balans;
        this.pasword = pasword;
    }

    public Card() {

    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }

    public long getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(long cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPasword() {
        return pasword;
    }

    public void setPasword(int pasword) {
        this.pasword = pasword;
    }


}
