package exceptionsHW;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int row, int col) {
        super(String.format(" Ошибка! Символ   в массиве[в %d строке,%d столбце] не является числом", row,col) );
    }
}
