package DataBases;


public class Subject {
    long id;

    String name;
    String type; //wykl, lab, cw, proj
    int ects;

    public Subject() {}

    public Subject(String name, String type, int ects) {
        this.name = name;
        this.type = type;
        this.ects = ects;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", ects=" + ects +
                '}';
    }
}
