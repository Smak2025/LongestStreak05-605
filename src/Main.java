int findLongestSequenceLength(int[] array) {
    int result = 0;
    int currentLength = 0;
    boolean even = array[0] % 2 == 0;
    for (var elem : array) {
        if (even == (elem % 2 == 0)) {
            currentLength++;
        } else {
            even = !even;
            if (currentLength > result) result = currentLength;
            currentLength = 1;
        }
    }
    return Math.max(result, currentLength);
}
void fillArray(int[] array){
    var r = new Random();
    for (int i = 0; i < array.length; i++) {
        array[i] = r.nextInt(-100,101);
    }
}

void main() {
    System.out.println("Введите размер массива");
    var scan = new Scanner(System.in);
    int size = scan.nextInt();
    int[] arr = new int[size];
    fillArray(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(findLongestSequenceLength(arr));
}