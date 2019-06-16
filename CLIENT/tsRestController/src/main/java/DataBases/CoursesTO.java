package DataBases;

import java.util.ArrayList;
import java.util.List;

public class CoursesTO {
    ArrayList<Course> courseList;

    public CoursesTO(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "CoursesTO{" +
                "courseList=" + courseList +
                '}';
    }
}
