package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	static ArrayList<Course> Courses = new ArrayList<Course>();
	static ArrayList<Section> Sections = new ArrayList<Section>();
	static ArrayList<Semester> Semesters = new ArrayList<Semester>();
	static ArrayList<Student> Students = new ArrayList<Student>();

	@BeforeClass
	public static void setup() {
		
		//Course Creation
		Course CourseOne = new Course("Physics 207", 4, eMajor.PHYSICS);
		Courses.add(CourseOne);
		
		Course CourseTwo = new Course("English 110", 3, eMajor.NURSING);
		Courses.add(CourseTwo);
		
		Course CourseThree = new Course("Math 242", 4, eMajor.COMPSI);
		Courses.add(CourseThree);
		
		
		//Semester Creation
		Calendar FallStart = Calendar.getInstance();
		FallStart.set(2015, 9, 1);
		
		Calendar FallEnd = Calendar.getInstance();
		FallEnd.set(2015, 12, 19);
		
		Calendar SpringStart = Calendar.getInstance();
		SpringStart.set(2016, 2, 8);
		
		Calendar SpringEnd = Calendar.getInstance();
		SpringEnd.set(2016, 5, 20);
		
		Semester FallSemester = new Semester(UUID.randomUUID(), FallStart.getTime(), FallEnd.getTime());
		Semesters.add(FallSemester);
		
		Semester SpringSemester = new Semester(UUID.randomUUID(), SpringStart.getTime(), SpringEnd.getTime());
		Semesters.add(SpringSemester);
		
		
		//Section Creation
		Section SectionOne = new Section(CourseOne.getCourseID(), FallSemester.getSemesterID(), 1);
		Sections.add(SectionOne);
		
		Section SectionTwo = new Section(CourseTwo.getCourseID(), FallSemester.getSemesterID(), 2);
		Sections.add(SectionTwo);
		
		Section SectionThree = new Section(CourseThree.getCourseID(), FallSemester.getSemesterID(), 3);
		Sections.add(SectionThree);
		
		Section SectionFour = new Section(CourseOne.getCourseID(), SpringSemester.getSemesterID(), 4);
		Sections.add(SectionFour);
		
		Section SectionFive = new Section(CourseTwo.getCourseID(), SpringSemester.getSemesterID(), 5);
		Sections.add(SectionFive);
		
		Section SectionSix = new Section(CourseThree.getCourseID(), SpringSemester.getSemesterID(), 6);
		Sections.add(SectionSix);
		
		
		//Student Creation
		Calendar StudentBirth = Calendar.getInstance();
		StudentBirth.set(1997, 2, 13);
		
		Student s0 = new Student("Garrett", "Michael", "LaCurts", StudentBirth.getTime(), eMajor.COMPSI,
					 "38372 Waters Road", "(302) 238-3990", "glacurts@udel.edu");
		Students.add(s0);
		
		Student s1 = new Student("Jan", "Michael", "Vincent", StudentBirth.getTime(), eMajor.PHYSICS,
				 "38372 Vincent Road", "(302) 238-3990", "jmvincent@udel.edu");
		Students.add(s1);
		
		Student s2 = new Student("Henry", "Jay", "Blip", StudentBirth.getTime(), eMajor.NURSING,
				 "4456 Blop Road", "(203) 238-4686", "blip@udel.edu");
		Students.add(s2);
		
		Student s3 = new Student("Richard", "John", "Stick", StudentBirth.getTime(), eMajor.COMPSI,
				 "38359 Waters Way", "(632) 468-7952", "rstick@udel.edu");
		Students.add(s3);
		
		Student s4 = new Student("John", "Ryan", "Barrett", StudentBirth.getTime(), eMajor.PHYSICS,
				 "4688 Lewis Street", "(302) 554-1136", "jrb@udel.edu");
		Students.add(s4);
		
		Student s5 = new Student("Jose", "Carter", "Kilman", StudentBirth.getTime(), eMajor.PHYSICS,
				 "8 Harvard Reach", "(302) 466-3990", "jose@udel.edu");
		Students.add(s5);
		
		Student s6 = new Student("Joe", "Joseph", "Oro", StudentBirth.getTime(), eMajor.NURSING,
				 "38372 Oro Street", "(302) 238-3990", "joro@udel.edu");
		Students.add(s6);
		
		Student s7 = new Student("Paul", "Michael", "Riddle", StudentBirth.getTime(), eMajor.COMPSI,
				 "66856 Riddle Lane", "(302) 238-0185", "rupaul@udel.edu");
		Students.add(s7);
		
		Student s8 = new Student("Peyton", "Marie", "Carter", StudentBirth.getTime(), eMajor.NURSING,
				 "666 Rehoboth Way", "(302) 845-0666", "pcarter@udel.edu");
		Students.add(s8);
		
		Student s9 = new Student("Richard", "Keith", "Pope-Morrison", StudentBirth.getTime(), eMajor.COMPSI,
				 "462 Quibley Road", "(302) 238-4652", "rkpmwriter@udel.edu");
		Students.add(s9);
		
	}

	@Test
	public void testOne() {
		
		//Enrollments
		Enrollment e0 = new Enrollment(Students.get(0).getStudentID(), Sections.get(0).getSectionID());
		e0.setGrade(89.00);
		
		Enrollment e1 = new Enrollment(Students.get(1).getStudentID(), Sections.get(1).getSectionID());
		e1.setGrade(75.00);
		
		Enrollment e2 = new Enrollment(Students.get(2).getStudentID(), Sections.get(2).getSectionID());
		e2.setGrade(90.00);
		
		Enrollment e3 = new Enrollment(Students.get(3).getStudentID(), Sections.get(3).getSectionID());
		e3.setGrade(93.00);
		
		Enrollment e4 = new Enrollment(Students.get(4).getStudentID(), Sections.get(4).getSectionID());
		e4.setGrade(46.00);
		
		Enrollment e5 = new Enrollment(Students.get(5).getStudentID(), Sections.get(5).getSectionID());
		e5.setGrade(64.00);
		
		Enrollment e6 = new Enrollment(Students.get(6).getStudentID(), Sections.get(0).getSectionID());
		e6.setGrade(99.00);
		
		Enrollment e7 = new Enrollment(Students.get(7).getStudentID(), Sections.get(1).getSectionID());
		e7.setGrade(55.00);
		
		Enrollment e8 = new Enrollment(Students.get(8).getStudentID(), Sections.get(2).getSectionID());
		e8.setGrade(85.00);
		
		Enrollment e9 = new Enrollment(Students.get(9).getStudentID(), Sections.get(3).getSectionID());
		e9.setGrade(78.00);
		
		//GPA Calculations
		double GPA0 = ((e0.getGrade() / 100) * (Courses.get(0).getGradePoints() * 4)) / Courses.get(0).getGradePoints();
		double GPA1 = ((e1.getGrade() / 100) * (Courses.get(1).getGradePoints() * 4)) / Courses.get(1).getGradePoints();
		double GPA2 = ((e2.getGrade() / 100) * (Courses.get(2).getGradePoints() * 4)) / Courses.get(2).getGradePoints();
		double GPA3 = ((e3.getGrade() / 100) * (Courses.get(0).getGradePoints() * 4)) / Courses.get(0).getGradePoints();
		double GPA4 = ((e4.getGrade() / 100) * (Courses.get(1).getGradePoints() * 4)) / Courses.get(1).getGradePoints();
		double GPA5 = ((e5.getGrade() / 100) * (Courses.get(2).getGradePoints() * 4)) / Courses.get(2).getGradePoints();
		double GPA6 = ((e6.getGrade() / 100) * (Courses.get(0).getGradePoints() * 4)) / Courses.get(0).getGradePoints();
		double GPA7 = ((e7.getGrade() / 100) * (Courses.get(1).getGradePoints() * 4)) / Courses.get(1).getGradePoints();
		double GPA8 = ((e8.getGrade() / 100) * (Courses.get(2).getGradePoints() * 4)) / Courses.get(2).getGradePoints();
		double GPA9 = ((e9.getGrade() / 100) * (Courses.get(0).getGradePoints() * 4)) / Courses.get(0).getGradePoints();

		
		assertEquals(3.56, GPA0, 0);
		assertEquals(3.00, GPA1, 0);
		assertEquals(3.60, GPA2, 0);
		assertEquals(3.72, GPA3, 0);
		assertEquals(1.84, GPA4, 0);
		assertEquals(2.56, GPA5, 0);
		assertEquals(3.96, GPA6, 0);
		assertEquals(2.20, GPA7, 0);
		assertEquals(3.40, GPA8, 0);
		assertEquals(3.12, GPA9, 0);
		
		//Course Averages
		double CourseOneAvg = (e0.getGrade() + e3.getGrade() + e6.getGrade() + e9.getGrade()) / 4;
		CourseOneAvg = Math.round(CourseOneAvg * 100.00) / 100.00;
		
		double CourseTwoAvg = (e1.getGrade() + e4.getGrade() + e7.getGrade()) / 3;
		CourseTwoAvg = Math.round(CourseTwoAvg * 100.00) / 100.00;
		
		double CourseThreeAvg = (e2.getGrade() + e5.getGrade() + e8.getGrade()) / 3;
		CourseThreeAvg = Math.round(CourseThreeAvg * 100.00) / 100.00;
		
		assertEquals(89.75, CourseOneAvg, 0);
		assertEquals(58.67, CourseTwoAvg, 0);
		assertEquals(79.67, CourseThreeAvg, 0);
		
	}
	
	@Test
	public void testTwo() {
		
		//Major change
		Students.get(2).setMajor(eMajor.PHYSICS);
		assertTrue(Students.get(2).getMajor() == eMajor.PHYSICS);
		
	}
	
}