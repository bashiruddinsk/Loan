package org.example.neoteric.service;

import org.example.neoteric.model.Course;
import org.example.neoteric.model.CourseList;
import org.example.neoteric.model.NeotericTechnologies;

import java.util.ArrayList;
import java.util.List;

public class ViewListOfCourses {
    List<Course> courseLists=null;
    public NeotericTechnologies listOfCourses(NeotericTechnologies neotericTechnologies)
    {
        if (neotericTechnologies.login.isLogin) {
            Course course1 = new Course();
            course1.name = "java full stack";
            course1.fee = 50000;
            course1.durations = "6months";
            Course course2 = new Course();
            course2.name = "python full stack";
            course2.fee = 40000;
            course2.durations = "4months";
            Course course3 = new Course();
            course3.name = "selenium";
            course3.fee = 20000;
            course3.durations = "3months";
            courseLists = new ArrayList<>();
            courseLists.add(course1);
            courseLists.add(course2);
            courseLists.add(course3);
            neotericTechnologies.courseList = courseLists;
        }
        return neotericTechnologies;

    }
}
