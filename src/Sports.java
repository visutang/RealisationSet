public class Sports {
    String sport ;

    public Sports(String sport) {
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "sport='" + sport + '\'' +
                '}';
    }
}
