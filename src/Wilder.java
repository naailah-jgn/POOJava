class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public Wilder(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String whoAmI() {
        return "Je m'appelle " + this.getFirstname() + " et je suis " + (this.isAware() ? "aware" : "non aware");
    }
}