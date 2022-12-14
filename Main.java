package code.bootcamp.example;
import static org.junit.Assert.*;
public class Main {
    public static void main(String[] args) {
        var square = """
             *****
             *****
             *****
             *****
             *****
             """;

        var pyramid = """
                *
               ***
              *****
              """;

        var rhombus = """
                *
               ***
              *****
               ***
                *
              """;
        assertEquals(square, Shape.square(5));
        assertEquals(pyramid, Shape.pyramid(3));
        assertEquals(rhombus, Shape.rhombus(5));
    }


}
