package chapter10.exception;

public class ChainExcDemo {
    static void demoproc(){
        //создать исключение
        NullPointerException e = new NullPointerException("вepxний уровень");

        // добавить причину исключения
        e.initCause(new ArithmeticException("пpичинa"));

        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch (NullPointerException e){
            //вывести исключение верхнего уровня
            System.out.println("Пepexвaчeнo исключение: " + e);
            //вывести исключение, послужившее причиной
            // для исключения верхнего уровня
            System.out.println("Пepвoпpичинa: " + e.getCause());
        }
    }
}
