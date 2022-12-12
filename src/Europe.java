public class Europe {
    public String country;
    public String country1;
    public String country2;
    public String language;

    public Europe(String country, String country1, String country2, String language) {
        this.country = country;
        this.country1 = country1;
        this.country2 = country2;
        this.language = language;

    }


    public String toString() {
        return "Europe[country=" + country + " country=1" + country1 + "country2=" + country2 + ", language=" + language + "]";
    }


    //public String getCountry() {
    //return country;
    //}

    public String getCountry1() {
        return country1;
    }

    public String getCountry2() {
        return country2;
    }


    public String getLanguage() {
        return language;
    }

    public void sayHi() {
        System.out.println("Hello!");
    }


}
