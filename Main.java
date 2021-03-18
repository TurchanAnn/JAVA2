package Lesson2;

public class main {
    public static void main(String[] args) {

        String[][] stringsOne = {{"2", "3", "4", "5"},
                                {"5", "6", "7", "8"},
                                {"8", "9", "0", "1"},
                                {"1", "3", "4", "5"}};

        String[][] stringsTwo = {{"2", "3", "4", "5"},
                                {"5", "6", "7", "8"},
                                {"8", "9", "b", "1"},
                                {"1", "3", "4", "5"}};

        String[][] stringsThree = {{"5", "6", "7", "8"},
                                    {"8", "9", "0", "1"},
                                    {"1", "3", "4", "5"}};


        try {
            createArr(stringsThree);
            System.out.println("Sum is " + +calcArr(stringsOne));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }


    }


    private static void createArr(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Не правильное количество строк");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Неверное количество столбцов");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");

            }
            System.out.println(" ");
        }
    }

    private static int calcArr(String[][] arr) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;

    }
}
