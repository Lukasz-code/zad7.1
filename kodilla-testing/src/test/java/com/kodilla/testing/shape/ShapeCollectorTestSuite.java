package com.kodilla.testing.shape;


import com.codilla.testing.shape.ShapeCollector;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("All tests are started");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("executing test nr: " + testCounter);
    }

    @Test
    public void addFigureTest (){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure();

    }
    @Test
    public void removeFigureTest(){}
    @Test
    public void  getFigureTest (){}
    @Test
    public void showFiguresTest(){}
}
