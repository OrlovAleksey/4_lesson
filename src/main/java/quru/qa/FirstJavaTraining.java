package quru.qa;

public class FirstJavaTraining {
    public static void main(String[] args) {

        byte typeByte; // = 0, -128 до 127 включительно, 1 байт
        short typeShort; // = 0, -32 768 до 32,767 включительно, 2 байта
        int typeInt; // = 0, -2147483648 до 2147483647 включительно, 4 байта
        long typeLong; // = 0L, –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807, 8 байт
        float typeFloat; // = 0.0f, -3.4*1038 до 3.4*1038, 4 байта
        double typeDouble; // = 0.0d, ±4.9*10-324 до ±1.7976931348623157*10308, 8 байт
        boolean typeBoolean; // false, 1 бит (но размер не определяется)
        char typeChar; // '\u0000', '\u0000' до '\uffff', один 16-битный символ Unicode

        //Расчет треугольника по трем сторонам
        int x = 3;
        int y = 4;
        int z = 5;
        int P; //периметр
        double S; // площадь

        P = (x+y+z)/2;
        System.out.println("Периметр треугольника равен: "+P);
        S = Math.sqrt(P*(P-x)*(P-y)*(P-z));
        System.out.println("Площадь треугольника равна: "+S);

        if (x == y && y == z) {
            System.out.println("Треугольник равносторонний");
        }
        if (x==y || z==x ||y==z){
            System.out.println("Треугольник равнобедренный");
        }
        else {
            System.out.println("Треугольник разносторонний");
        }
     //Переполнение
        int maxInt = 2147483647;
        System.out.println(maxInt+1);

        //комбинаций типов данных
        int IntRes = 3 * 6;
        double DoubleRes = 2.5 * 3;
        System.out.println(IntRes+DoubleRes);
        System.out.println(IntRes-DoubleRes);
        System.out.println(IntRes*DoubleRes);
        System.out.println(IntRes/DoubleRes);
    }
}
