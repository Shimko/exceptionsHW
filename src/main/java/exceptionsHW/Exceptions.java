package exceptionsHW;

public class Exceptions {
    public static void main(String[] args) throws MySizeArrayException, MyArrayDataException {

            checkArray(new String[][]{
                    {"56","4","g","8"},
                    {"78","74","57","83"},

                    {"98","45","h","82"}});


    }
    public static void checkArray(String[][] a) throws MySizeArrayException, MyArrayDataException {

        if (a.length != 4) {
            throw new MySizeArrayException("Ошибка! Размер массива должен быть 4х4");
        }
        int sum = 0;
        for (int i = 0; i < a[i].length; i++) {
            if (a[i].length != 4) {
                throw new MySizeArrayException("Ошибка! Размер массива должен быть 4х4");
            }
            for (int j = 0; j < a.length; j++) {
                try {
                    sum += Integer.parseInt(a[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }
            }
        } System.out.println("Сумма = " + sum);
    }
}
