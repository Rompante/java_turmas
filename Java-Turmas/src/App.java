public class App {
    public static void main(String[] args) throws Exception {

        Professor prof1 = new Professor();
        prof1 = new Professor(2000, "Luis", "Santos", 12345, "programação");
        System.out.println(prof1.getNomeCompleto());

        Turma turma1 = new Turma();
        turma1 = new Turma("CX12345", "Programador de Informática", 2025, 2028);
        System.out.println(turma1.getInfoTurma());

        Aluno aluno1 = new Aluno();
        aluno1 = new Aluno("AL12345", "Maria", "Silva", 2005, turma1);
        System.out.println(aluno1.getNomeCompleto());   
        System.out.println(aluno1.getIdade());
        Aluno aluno2 = new Aluno("AL54321", "João", "Pereira", 2003, turma1);
        System.out.println(aluno2.getNomeCompleto());
        System.out.println(aluno2.getIdade());
        Aluno aluno3 = new Aluno("AL67890", "Ana", "Costa", 2004, turma1);
        System.out.println(aluno3.getNomeCompleto());
        System.out.println(aluno3.getIdade());  
    }
}
    