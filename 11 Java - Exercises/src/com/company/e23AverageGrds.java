package com.company;

import java.util.*;

public class e23AverageGrds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        int studentsCount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < studentsCount; i++) {
            String[] tokens = scan.nextLine().split(" ");

            String name = tokens[0];
            Double[] grades = Arrays
                    .stream(tokens)
                    .skip(1)
                    .map(Double::parseDouble)
                    .toArray(Double[]::new);

            Student student = new Student() {{
                setName(name);
                setGrades(Arrays.asList(grades));
            }};

            students.add(student);
        }

        Student[] filteredStudents = students
                .stream()
                .filter(s -> s.getAverageGrade() >= 5.0)
                .sorted((a, b) -> {
            int comparisonResult = a.getName().compareTo(b.getName());

            if (comparisonResult == 0) {
                comparisonResult = Double.compare(b.getAverageGrade(), a.getAverageGrade());
            }

            return comparisonResult;

        })
                .toArray(Student[]::new);

        for (Student student : filteredStudents) {
            System.out.printf("%s -> %.2f", student.getName(), student.getAverageGrade());
            System.out.println();
        }
    }
}

class Student {
    private String name;
    private List<Double> grades;
    private double averageGrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        double averageGrade = this.grades
                .stream()
                .mapToDouble(a -> a)
                .average()
                .getAsDouble();

        return averageGrade;
    }


}