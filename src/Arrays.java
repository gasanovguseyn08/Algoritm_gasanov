import java.util.Comparator;

public class Arrays {

    // Бинарный поиск в массиве byte
    public static int binarySearch(byte[] array, byte key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(byte[] array, int start, int end, byte key) {
        while (start < end) {
            int middle = (start + end) >>> 1;
            if (array[middle] < key) {
                start = middle + 1;
            } else if (array[middle] > key) {
                end = middle;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }

    // Бинарный поиск в массиве char
    public static int binarySearch(char[] array, char key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(char[] array, int start, int end, char key) {
        while (start < end) {
            int middle = (start + end) >>> 1;
            if (array[middle] < key) {
                start = middle + 1;
            } else if (array[middle] > key) {
                end = middle;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }

    // Бинарный поиск в массиве double
    public static int binarySearch(double[] array, double key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(double[] array, int start, int end, double key) {
        while (start < end) {
            int middle = (start + end) >>> 1;
            if (array[middle] < key) {
                start = middle + 1;
            } else if (array[middle] > key) {
                end = middle;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }

    // Бинарный поиск в массиве float
    public static int binarySearch(float[] array, float key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(float[] array, int start, int end, float key) {
        while (start < end) {
            int middle = (start + end) >>> 1;
            if (array[middle] < key) {
                start = middle + 1;
            } else if (array[middle] > key) {
                end = middle;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }

    // Бинарный поиск в массиве int
    public static int binarySearch(int[] array, int key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(int[] array, int start, int end, int key) {
        while (start < end) {
            int middle = (start + end) >>> 1;
            if (array[middle] < key) {
                start = middle + 1;
            } else if (array[middle] > key) {
                end = middle;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }

    // Бинарный поиск в массиве long
    public static int binarySearch(long[] array, long key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(long[] array, int start, int end, long key) {
        while (start < end) {
            int middle = (start + end) >>> 1;
            if (array[middle] < key) {
                start = middle + 1;
            } else if (array[middle] > key) {
                end = middle;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }

    // Бинарный поиск в массиве short
    public static int binarySearch(short[] array, short key) {
        return binarySearch(array, 0, array.length, key);
    }

    public static int binarySearch(short[] array, int start, int end, short key) {
        while (start < end) {
            int middle = (start + end) >>> 1;
            if (array[middle] < key) {
                start = middle + 1;
            } else if (array[middle] > key) {
                end = middle;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }

    // Бинарный поиск в массиве объектов с компаратором
    public static <T> int binarySearch(T[] array, T key, Comparator<? super T> comparator) {
        return binarySearch(array, 0, array.length, key, comparator);
    }

    public static <T> int binarySearch(T[] array, int start, int end, T key, Comparator<? super T> comparator) {
        while (start < end) {
            int middle = (start + end) >>> 1;
            int comparison = comparator.compare(array[middle], key);
            if (comparison < 0) {
                start = middle + 1;
            } else if (comparison > 0) {
                end = middle;
            } else {
                return middle;
            }
        }
        return -(start + 1);
    }
}
