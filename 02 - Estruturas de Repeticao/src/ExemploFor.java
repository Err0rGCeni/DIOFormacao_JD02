public class ExemploFor {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {
            System.out.println(count);
        }
        System.out.println("Fim da contagem.");

        String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("Aluno " + x + ": " + alunos[x]);
        }
        System.out.println("Fim do for para Arrays");

        for (String aluno: alunos){
            System.out.println("Nome do aluno: " + aluno);
        }
        System.out.println("Fim do for/each para Arrays");
    }
}
