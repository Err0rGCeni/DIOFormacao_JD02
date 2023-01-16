public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >=7 ? "Bom" : "Ruim";

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >=5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        System.out.println(resultado);
    }
}
