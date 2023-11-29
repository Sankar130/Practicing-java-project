package com.kn.oops.encapsulation;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1= new Student(01,"Sankar",99,"BBA");
		Student s2= new Student(02,"Sankarnarayanan",100,"BCA");
		Student s3= new Student(03,"Deepika",99);
		System.out.println("Student ID ="+s1.getId());
		System.out.println("Student NAME ="+s1.getName());
		System.out.println("Student MARK ="+s1.getMark());
		System.out.println("Student BRANCH ="+s1.getBranch());
		System.out.println("*******************");
		System.out.println("Student ID ="+s2.getId());
		System.out.println("Student NAME ="+s2.getName());
		System.out.println("Student MARK ="+s2.getMark());
		System.out.println("Student BRANCH ="+s2.getBranch());
		System.out.println("*******************");
		System.out.println("Student ID ="+s3.getId());
		System.out.println("Student NAME ="+s3.getName());
		System.out.println("Student MARK ="+s3.getMark());
		System.out.println("Student BRANCH ="+s3.getBranch());
		System.out.println("*******************");
		
	}

}
