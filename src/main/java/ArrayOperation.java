import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.*;

public class ArrayOperation {

    public static int[] getRandomIntegerArrays(int maxValue, int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValue);
        }
        return array;
    }

    public static int[] getRandomIntegerArrays(int size) {
        return getRandomIntegerArrays(100, size);
    }

    public static double[] getRandomDoubleArrays(int size) {
        double[] array = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }


    public static int[][] getRandomIntegerMatrix(int rowCount, int colCount, int maxValue) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            int[] randomIntegerArrays = getRandomIntegerArrays(colCount, maxValue);
            list.add(randomIntegerArrays);
        }
        return list.toArray(new int[0][]);
    }

    public static double[][] getRandomDoubleMatrix(int rowCount, int colCount) {
        List<double[]> list = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            double[] randomDoubleArrays = getRandomDoubleArrays(colCount);
            list.add(randomDoubleArrays);
        }
        return list.toArray(new double[0][]);
    }


    public static double[] toPreemptiveDoubleArray(Double[] arrays) {
        double[] out = new double[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static int[] toPreemptiveIntegerArray(Integer[] arrays) {
        int[] out = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static long[] toPreemptiveLongArray(Long[] arrays) {
        long[] out = new long[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static char[] toPreemptiveCharacterArray(Character[] arrays) {
        char[] out = new char[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static boolean[] toPreemptiveBooleanArray(Boolean[] arrays) {
        boolean[] out = new boolean[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static byte[] toPreemptiveByteArray(Byte[] arrays) {
        byte[] out = new byte[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static float[] toPreemptiveFloatArray(Float[] arrays) {
        float[] out = new float[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static short[] toPreemptiveShortArray(Short[] arrays) {
        short[] out = new short[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }


    public static Double[] toObjectDoubleArray(double[] arrays) {
        Double[] out = new Double[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static Integer[] toObjectIntegerArray(int[] arrays) {
        Integer[] out = new Integer[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static Long[] toObjectLongArray(long[] arrays) {
        Long[] out = new Long[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static Character[] toObjectCharacterArray(char[] arrays) {
        Character[] out = new Character[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static Boolean[] toObjectBooleanArray(boolean[] arrays) {
        Boolean[] out = new Boolean[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static Byte[] toObjectByteArray(byte[] arrays) {
        Byte[] out = new Byte[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static Float[] toObjectFloatArray(float[] arrays) {
        Float[] out = new Float[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }

    public static Short[] toObjectShortArray(short[] arrays) {
        Short[] out = new Short[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            out[i] = arrays[i];
        }
        return out;
    }


    public static String primitiveArrayToString(double[] arrays, String dot) {
        StringBuilder out = new StringBuilder();
        for (double b : arrays) {
            out.append(b).append(dot);
        }
        return out.toString();
    }

    public static String primitiveArrayToString(double[] arrays) {
        return primitiveArrayToString(arrays, " ");
    }

    public static String primitiveArrayToString(int[] arrays, String dot) {
        StringBuilder out = new StringBuilder();
        for (int b : arrays) {
            out.append(b).append(dot);
        }
        return out.toString();
    }

    public static String primitiveArrayToString(int[] arrays) {
        return primitiveArrayToString(arrays, " ");
    }

    public static String primitiveArrayToString(long[] arrays, String dot) {
        StringBuilder out = new StringBuilder();
        for (long b : arrays) {
            out.append(b).append(dot);
        }
        return out.toString();
    }

    public static String primitiveArrayToString(long[] arrays) {
        return primitiveArrayToString(arrays, " ");
    }

    public static String primitiveArrayToString(boolean[] arrays, String dot) {
        StringBuilder out = new StringBuilder();
        for (boolean b : arrays) {
            out.append(b).append(dot);
        }
        return out.toString();
    }

    public static String primitiveArrayToString(boolean[] arrays) {
        return primitiveArrayToString(arrays, " ");
    }

    public static String primitiveArrayToString(byte[] arrays, String dot) {
        StringBuilder out = new StringBuilder();
        for (byte b : arrays) {
            out.append(b).append(dot);
        }
        return out.toString();
    }

    public static String primitiveArrayToString(byte[] arrays) {
        return primitiveArrayToString(arrays, " ");
    }

    public static String primitiveArrayToString(float[] arrays, String dot) {
        StringBuilder out = new StringBuilder();
        for (float b : arrays) {
            out.append(b).append(dot);
        }
        return out.toString();
    }

    public static String primitiveArrayToString(float[] arrays) {
        return primitiveArrayToString(arrays, " ");
    }

    public static String primitiveArrayToString(short[] arrays, String dot) {
        StringBuilder out = new StringBuilder();
        for (short b : arrays) {
            out.append(b).append(dot);
        }
        return out.toString();
    }

    public static String primitiveArrayToString(short[] arrays) {
        return primitiveArrayToString(arrays, " ");
    }


    public static String objectArrayToString(Object[] arrays, String dot) {
        StringBuilder out = new StringBuilder();
        for (Object b : arrays) {
            out.append(b).append(dot);
        }
        return out.toString();
    }

    public static String objectArrayToString(Object[] arrays) {
        return objectArrayToString(arrays, " ");
    }


    public static String objectArrayToStringGson(Object[] arrays, Type type) {
        Gson gson = new Gson();
        return gson.toJson(arrays, type);
    }

    public static String objectMatrixToStringGson(Object[][] arrays, Type type) {
        Gson gson = new Gson();
        return gson.toJson(arrays, type);
    }


    public static Object[] stringGsonToArrayObject(String gson, Type type) {
        Gson gs = new Gson();
        return gs.fromJson(gson, type);
    }

    public static Object[][] stringGsonToMatrixObject(String gson, Type type) {
        Gson gs = new Gson();
        return gs.fromJson(gson, type);
    }


    public static double[] stringToPrimitiveDoubleArray(String str) {
        Scanner scanner = getScanner(str);
        List<Double> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextDouble());
        }
        Double[] arr = list.toArray(new Double[0]);
        return toPreemptiveDoubleArray(arr);
    }

    public static int[] stringToPrimitiveIntegerArray(String str) {
        Scanner scanner = getScanner(str);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        Integer[] arr = list.toArray(new Integer[0]);
        return toPreemptiveIntegerArray(arr);
    }

    public static long[] stringToPrimitiveLongArray(String str) {
        Scanner scanner = getScanner(str);
        List<Long> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextLong());
        }
        Long[] arr = list.toArray(new Long[0]);
        return toPreemptiveLongArray(arr);
    }

    public static boolean[] stringToPrimitiveBooleanArray(String str) {
        Scanner scanner = getScanner(str);
        List<Boolean> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextBoolean());
        }
        Boolean[] arr = list.toArray(new Boolean[0]);
        return toPreemptiveBooleanArray(arr);
    }

    public static byte[] stringToPrimitiveByteArray(String str) {
        Scanner scanner = getScanner(str);
        List<Byte> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextByte());
        }
        Byte[] arr = list.toArray(new Byte[0]);
        return toPreemptiveByteArray(arr);
    }

    public static float[] stringToPrimitiveFloatArray(String str) {
        Scanner scanner = getScanner(str);
        List<Float> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextFloat());
        }
        Float[] arr = list.toArray(new Float[0]);
        return toPreemptiveFloatArray(arr);
    }

    public static short[] stringToPrimitiveShortArray(String str) {
        Scanner scanner = getScanner(str);
        List<Short> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextShort());
        }
        Short[] arr = list.toArray(new Short[0]);
        return toPreemptiveShortArray(arr);
    }


    public static Double[] stringToObjectDoubleArray(String str) {
        Scanner scanner = getScanner(str);
        List<Double> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextDouble());
        }
        return list.toArray(new Double[0]);
    }

    public static Integer[] stringToObjectIntegerArray(String str) {
        Scanner scanner = getScanner(str);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        return list.toArray(new Integer[0]);
    }

    public static Long[] stringToObjectLongArray(String str) {
        Scanner scanner = getScanner(str);
        List<Long> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextLong());
        }
        return list.toArray(new Long[0]);
    }

    public static Boolean[] stringToObjectBooleanArray(String str) {
        Scanner scanner = getScanner(str);
        List<Boolean> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextBoolean());
        }
        return list.toArray(new Boolean[0]);
    }

    public static Byte[] stringToObjectByteArray(String str) {
        Scanner scanner = getScanner(str);
        List<Byte> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextByte());
        }
        return list.toArray(new Byte[0]);
    }

    public static Float[] stringToObjectFloatArray(String str) {
        Scanner scanner = getScanner(str);
        List<Float> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextFloat());
        }
        return list.toArray(new Float[0]);
    }

    public static Short[] stringToObjectShortArray(String str) {
        Scanner scanner = getScanner(str);
        List<Short> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextShort());
        }
        return list.toArray(new Short[0]);
    }


    public static double[][] stringToPrimitiveDoubleMatrix(String[] str) {
        double[][] array = new double[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToPrimitiveDoubleArray(str[i]);
        }
        return array;
    }

    public static int[][] stringToPrimitiveIntegerMatrix(String[] str) {
        int[][] array = new int[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToPrimitiveIntegerArray(str[i]);
        }
        return array;
    }

    public static long[][] stringToPrimitiveLongMatrix(String[] str) {
        long[][] array = new long[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToPrimitiveLongArray(str[i]);
        }
        return array;
    }

    public static boolean[][] stringToPrimitiveBooleanMatrix(String[] str) {
        boolean[][] array = new boolean[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToPrimitiveBooleanArray(str[i]);
        }
        return array;
    }

    public static byte[][] stringToPrimitiveByteMatrix(String[] str) {
        byte[][] array = new byte[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToPrimitiveByteArray(str[i]);
        }
        return array;
    }

    public static float[][] stringToPrimitiveFloatMatrix(String[] str) {
        float[][] array = new float[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToPrimitiveFloatArray(str[i]);
        }
        return array;
    }

    public static short[][] stringToPrimitiveShortMatrix(String[] str) {
        short[][] array = new short[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToPrimitiveShortArray(str[i]);
        }
        return array;
    }


    public static Double[][] stringToObjectDoubleMatrix(String[] str) {
        Double[][] array = new Double[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToObjectDoubleArray(str[i]);
        }
        return array;
    }

    public static Integer[][] stringToObjectIntegerMatrix(String[] str) {
        Integer[][] array = new Integer[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToObjectIntegerArray(str[i]);
        }
        return array;
    }

    public static Long[][] stringToObjectLongMatrix(String[] str) {
        Long[][] array = new Long[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToObjectLongArray(str[i]);
        }
        return array;
    }

    public static Boolean[][] stringToObjectBooleanMatrix(String[] str) {
        Boolean[][] array = new Boolean[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToObjectBooleanArray(str[i]);
        }
        return array;
    }

    public static Byte[][] stringToObjectByteMatrix(String[] str) {
        Byte[][] array = new Byte[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToObjectByteArray(str[i]);
        }
        return array;
    }

    public static Float[][] stringToObjectFloatMatrix(String[] str) {
        Float[][] array = new Float[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToObjectFloatArray(str[i]);
        }
        return array;
    }

    public static Short[][] stringToObjectShortMatrix(String[] str) {
        Short[][] array = new Short[str.length][];
        for (int i = 0; i < str.length; i++) {
            array[i] = stringToObjectShortArray(str[i]);
        }
        return array;
    }


    public static boolean equalsObjectArray(Object[] array1, Object[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsObjectMatrix(Object[][] array1, Object[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!equalsObjectArray(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }


    public static boolean equalsDoubleArray(double[] array1, double[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsIntegerArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsLongArray(long[] array1, long[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsCharacterArray(char[] array1, char[] array2) {
        return new String(array1).equals(new String(array2));
    }

    public static boolean equalsBooleanArray(boolean[] array1, boolean[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteArray(byte[] array1, byte[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsFloatArray(float[] array1, float[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsShortArray(short[] array1, short[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }


    public static boolean equalsDoubleMatrix(double[][] array1, double[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!equalsDoubleArray(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsIntegerMatrix(int[][] array1, int[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!equalsIntegerArray(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsLongMatrix(long[][] array1, long[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!equalsLongArray(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsCharacterMatrix(char[][] array1, char[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!equalsCharacterArray(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsBooleanMatrix(boolean[][] array1, boolean[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!equalsBooleanArray(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteMatrix(byte[][] array1, byte[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!equalsByteArray(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsFloatMatrix(float[][] array1, float[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!equalsFloatArray(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsShortMatrix(short[][] array1, short[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!equalsShortArray(array1[i], array2[i])) {
                return false;
            }
        }
        return true;
    }


    private static Scanner getScanner(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        return scanner;
    }
}