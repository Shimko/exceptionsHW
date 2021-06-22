package exceptionsHW;

public class Exceptions {
    public static void main(String[] args) throws MySizeArrayException, MyArrayDataException {
        String [] [] arr = new String[][]{
                {"56","4","5","8"},
                {"78","74","57","83"},
                {"78","74","57","83"},
                {"98","45","d","82"}
        };
        try {
            checkArray(arr);
        }catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println(" Невозможно подсчитать сумму, введены некорректные данные!!!");
        }catch (MySizeArrayException e){
            e.printStackTrace();
        }
    }
    public static void checkArray(String[][] a) throws MySizeArrayException, MyArrayDataException {
        if (a.length != 4) {
            throw new MySizeArrayException("Ошибка! Размер массива должен быть 4х4");
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (a[i].length != 4) {
                throw new MySizeArrayException("Ошибка! Размер массива должен быть 4х4");
            }
            for (int j = 0; j < 4; j++) {
                    try {
                        sum += Integer.parseInt(a[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
            }
            System.out.println(sum);
        }
    }
}
