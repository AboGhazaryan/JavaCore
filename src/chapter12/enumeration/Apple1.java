package chapter12.enumeration;

public enum Apple1 {
    Jonatahn(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple1(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}
