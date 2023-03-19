public class Author extends Person {

    public enum Formation {
        None,
        Specialist,
        Master,
        Doctor,
    }

    public Author(String name, int age, String cityOfBirth, String gender, Formation formation) {
        super(name, age, cityOfBirth);
        this.gender = gender;
        this.formation = formation;
    }

    @Override
    public String toString() {
        return String.format("Author {name=%s, age=%d, cityOfBirth=%s, gender=%s, formation=%s}",
                name, age, cityOfBirth, gender, formation.name());

    }

    private String gender;
    private Formation formation;
    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}
    public Formation getFormation() {return formation;}
    public void setFormation(Formation formation) {this.formation = formation;}

}

