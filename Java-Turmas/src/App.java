public class App {
    public static void main(String[] args) throws Exception {

        Professor prof1 = new Professor();
        prof1 = new Professor(2000, "Luis", "Santos", 12345, "programação");
        System.out.println(prof1.getNomeCompleto());

        Turma turma1 = new Turma();
        turma1 = new Turma("CX12345", "Programador de Informática", 2025, 2028);
        System.out.println(turma1.getInfoTurma());

        Aluno aluno1 = new Aluno();

    }
}
