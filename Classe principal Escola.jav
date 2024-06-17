import javax.swing.JOptionPane;


public class Escola {
    public static void main(String[] args) {
       
        Aluno aluno1 = new Aluno("Flávio", 7.5, 8.0);
        aluno1.exibirInfo();

        Aluno aluno2 = new Aluno("Lucas", 6.0, 9.0);
        aluno2.exibirInfo();

        Professor professor1 = new Professor("Dr. Michel", "Matemática");
        professor1.exibirInfo();


            
        professor.exibirInfo();

       
        for (int i = 0; i < 4; i++) {
            String disciplina = JOptionPane.showInputDialog("Digite a disciplina " + (i + 1) + ":");
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota de " + disciplina + ":"));
            professor.inserirDisciplinaNota(i, disciplina, nota);
        }

           

     //Exisbindo nome do Aluno e suas 4 notas
        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 de " + nomeAluno + ":"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 de " + nomeAluno + ":"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3 de " + nomeAluno + ":"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4 de " + nomeAluno + ":"));


        Aluno aluno3 = new Aluno(nomeAluno, nota1, nota2, nota3, nota4);
        aluno3.exibirInfo();
    }
}
