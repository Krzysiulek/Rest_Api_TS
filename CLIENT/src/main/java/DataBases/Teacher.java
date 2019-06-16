package DataBases;

import java.util.ArrayList;
import java.util.List;


public class Teacher {
    long id;
    String title;
    String name;
    String email;

    ArrayList<Integer> courseIds;
    ArrayList<Integer> subjectIds;

    public Teacher(String title, String name, String email, ArrayList<Integer> courseIds, ArrayList<Integer> subjectIds) {
        this.title = title;
        this.name = name;
        this.email = email;
        this.courseIds = courseIds;
        this.subjectIds = subjectIds;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Integer> getCourseIds() {
        return courseIds;
    }

    public void setCourseIds(ArrayList<Integer> courseIds) {
        this.courseIds = courseIds;
    }

    public List<Integer> getSubjectIds() {
        return subjectIds;
    }

    public void setSubjectIds(ArrayList<Integer> subjectIds) {
        this.subjectIds = subjectIds;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", courseIds=" + courseIds +
                ", subjectIds=" + subjectIds +
                '}';
    }
}
