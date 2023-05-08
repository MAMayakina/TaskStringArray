public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"aa", "bb", "cc", "aa", "dd", "aa"};
        String myString = null;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (myString == null) {
                    myString = array[i];
                } else {
                    myString = myString + " " + array[i];
                }

                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null && array[i].equals(array[j])) {
                        array[j] = null;
                    }
                }
            }
        }

        System.out.println(myString);


    }
}