package DataBases;

import java.util.ArrayList;
import java.util.List;


public class Grade {
    long id;
    long index;
    int subjectId;
    ArrayList<Double> grades;

    public Grade(){}

    public Grade(int index, int subjectId, ArrayList<Double> grades) {
        this.index = index;
        this.subjectId = subjectId;
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", index=" + index +
                ", subjectId=" + subjectId +
                ", grades=" + grades +
                '}';
    }
}
