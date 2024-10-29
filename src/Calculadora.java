public class Calculadora {
    public static double calcularmedia(Aluno aluno) {
        return(aluno.getNota1()+ aluno.getNota2()) / 2;
    }
    public static String determinarstatus(double media) {
        if (media >= 70.0) {
            return "Aprovado";
        }else if (media >=50.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }

    }

}
