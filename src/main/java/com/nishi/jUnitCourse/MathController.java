package com.nishi.jUnitCourse;

public class MathController {

    public static void main(String[] args){
        Reader reader = new Reader();
        com.nishi.jUnitCourse.Math math = new com.nishi.jUnitCourse.Math(reader);

        System.out.println(math.isUserSelectionEven());

    }
}
