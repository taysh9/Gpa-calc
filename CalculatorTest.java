package GPAcalc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    void setUp() throws Exception {
        calc = new Calculator();
        
    }


    @Test
    void testGetGradesList() {
        fail("Not yet implemented");
    }


    @Test
    void testGetHoursList() {
        fail("Not yet implemented");
    }


    @Test
    void testGetConvert() {
        fail("Not yet implemented");
    }
    
    @Test
    void testaddHours()
    {
        calc.addHours(3);
        calc.addHours(4);
        System.out.println(calc.totalHours());
    }
    
    @Test
    void testgpa()
    {
        calc.addGrade("A", 3);
        calc.addGrade("A", 3);
        calc.addGrade("A", 3);
       System.out.println( calc.gpa());
        
        
    }
    


    @Test
    void testConvert() {
        calc.getGradesList().add("A");
        calc.getGradesList().add("B");
        calc.getGradesList().add("C");
        calc.getGradesList().add("D");
        calc.getGradesList().add("B+");
        calc.getGradesList().add("C-");
        calc.getGradesList().add("F");
        calc.convert(calc.getGradesList());
        System.out.println(calc.getConvert().toString());
    }

}
