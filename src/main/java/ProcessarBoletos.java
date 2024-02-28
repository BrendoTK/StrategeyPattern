import lombok.Setter;

@Setter
public class ProcessarBoletos {
    private LeituraRetorno leituraRetorno;

    public ProcessarBoletos(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(String nomeArquivo) {
        var listaBoletos = leituraRetorno.lerArquivo(nomeArquivo);
        System.out.println(listaBoletos);
    }

    ;
}
