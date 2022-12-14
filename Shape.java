package code.bootcamp.example;

public class Shape {

    public static void main(String[] args) {
        int r = (int) 2.5;
        System.out.println(rhombus(3));

    }

    public static String square() {
        return square(3);
    }

    public static String square(int size) {
        var character = "*";
        var square = new StringBuilder();
        for (int row = 1; row <= size; ++row) {
            square.append(character.repeat(size)).append(System.lineSeparator());//String.format("%n")
        }
        System.out.println(square);
        return square.toString();
    }

    public static String pyramid() {
        return pyramid(3);
    }

    public static String pyramid(int size){
        var pyramid = new StringBuilder();
        var character = "*";
        var space = " ";
        var numberOfSpaces = size - 1;
        var numberOfCharacters = 1;
        for (int row = 1; row <= size; ++row) {
            pyramid.append(space.repeat(numberOfSpaces)).append(character.repeat(numberOfCharacters)).append(System.lineSeparator());
            --numberOfSpaces;
            numberOfCharacters = numberOfCharacters + 2;
        }
        return pyramid.toString();
    }

    public static String rhombus(){
        return rhombus(5);
    }

    public static String rhombus(int size){
        var rhombus = new StringBuilder();
        var character = "*";
        var space = " ";
        for (int topRow = 1; topRow <= ((int) size/2) + 1; topRow++) {
            rhombus.append(space.repeat((int) (size/2) - topRow + 1)).append(character.repeat(1 + (2 * (topRow - 1)))).append(System.lineSeparator());
        }

        System.out.println(rhombus);

        for (int bottomRow = 1; bottomRow <= ((int) size/2); ++bottomRow) {
            rhombus.append(space.repeat(bottomRow)).append(character.repeat(size - (2 * bottomRow))).append(System.lineSeparator());
        }
        return rhombus.toString();
    }

}
