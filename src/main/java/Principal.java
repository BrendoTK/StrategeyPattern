public class Principal {
    public static void main(String[] args) {
        var leituraRetorno1 = new LeituraRetornoBancoBrasil();
        var leituraRetorno2 = new LeituraRetornoBradesco();
        var processarBoletos1 = new ProcessarBoletos(leituraRetorno1);
        var processarBoletos2 = new ProcessarBoletos(leituraRetorno2);
        processarBoletos1.processar("banco-brasil-1.csv");
        processarBoletos2.processar("bradesco-1.csv");
    }
}
