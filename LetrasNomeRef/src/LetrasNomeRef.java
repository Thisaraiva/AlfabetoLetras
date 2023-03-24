public class LetrasNomeRef {

    public static void main(String[] args) {

        char[][] arrT = letraT();
        escrever(arrT);

        char[][] arrH = letraH();
        escrever(arrH);

        char[][] arrI = letraI();
        escrever(arrI);

        char[][] arrA = letraA();
        escrever(arrA);

        char[][] arrG = letraG();
        escrever(arrG);

        char[][] arrO = letraO();
        escrever(arrO);

    }

    public static char[][] letraT() {
        char[][] arr = {
                {'T', 'T', 'T', 'T', 'T'},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '},
                {' ', ' ', 'T', ' ', ' '}
        };
        return arr;
    }

    public static char[][] letraH() {
        char[][] arr = {
                {'H', ' ', ' ', ' ', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
                {'H', 'H', 'H', 'H', 'H'},
                {'H', ' ', ' ', ' ', 'H'},
                {'H', ' ', ' ', ' ', 'H'}
        };
        return arr;
    }

    public static char[][] letraI() {
        char[][] arr = {
                {'I', 'I', 'I', 'I', 'I'},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {' ', ' ', 'I', ' ', ' '},
                {'I', 'I', 'I', 'I', 'I'}
        };
        return arr;
    }

    public static char[][] letraA() {
        char[][] arr = {
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', 'A', 'A', 'A', 'A'},
                {'A', ' ', ' ', ' ', 'A'},
                {'A', ' ', ' ', ' ', 'A'}
        };
        return arr;
    }

    public static char[][] letraG() {
        char[][] arr = {
                {'G', 'G', 'G', 'G', 'G'},
                {'G', ' ', ' ', ' ', ' '},
                {'G', ' ', 'G', 'G', 'G'},
                {'G', ' ', ' ', ' ', 'G'},
                {'G', 'G', 'G', 'G', 'G'}
        };
        return arr;
    }

    public static char[][] letraO() {
        char[][] arr = {
                {'O', 'O', 'O', 'O', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', ' ', ' ', ' ', 'O'},
                {'O', 'O', 'O', 'O', 'O'}
        };
        return arr;
    }

    public static void escrever(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " " );

            }

            System.out.println();

        }

    }
}