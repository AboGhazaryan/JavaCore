package homework.homework7.BraceCheckerGPT;

public class Stack {
    private int[] indexes = new int[100];
    private char[] symbols = new char[100];
    private int size = 0;

    public void push(char symbol, int index) {
        symbols[size] = symbol;
        indexes[size] = index;
        size++;
    }

    public char popSymbol() {
        if (isEmpty()) return '\0';
        return symbols[--size];
    }

    public int popIndex() {
        if (isEmpty()) return -1;
        return indexes[size];
    }

    public char peekSymbol() {
        if (isEmpty()) return '\0';
        return symbols[size - 1];
    }

    public int peekIndex() {
        if (isEmpty()) return -1;
        return indexes[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
