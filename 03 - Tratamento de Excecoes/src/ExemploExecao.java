import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExecao {
    public static void main(String[] args) {
        // Number valor = Double.valueOf("a1.75");
        // java.lang.NumberFormatException

        Number valor;
        try {
            valor = NumberFormat.getIntegerInstance().parse("a1.75");
            // java.text.ParseException
            System.out.println(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
