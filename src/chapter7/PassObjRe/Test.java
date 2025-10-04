package chapter7.PassObjRe;

//Объекты передаются по ссылке на них

public class Test {
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }
    // передать объект
    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
}
