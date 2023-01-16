public class FormatterCep {
    public static void main(String[] args) {
        try {
            String formattedCEP = formatarCep("2376506");
            // Por ser uma exception, exige utilizar try catch
            System.out.println(formattedCEP);
        } catch (InvalidExcept e) {
            System.out.println("O CEP não corresponde com as regras.");
        }
    }

    static String formatarCep(String cep) throws InvalidExcept {
        if (cep.length() != 8) {
            throw new InvalidExcept();
        }
        // Simulando
        return "23.765-064";
    }

}
