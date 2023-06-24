package devandroid.glaucomv.appgaseta.apoio;

public class UtilGasEta {

    public void metodoEstatico(){}

    public static void metodoNaoEstatico(){}

    public static String mensagem(){
        return "Qualquer mensagem...";
    }

    public static double preco(){
        return 9.99;
    }

    public static String calcularMelhorOpcao(double gasolina, double etanol){

        double precoIdeal = gasolina * 0.7;
        String mensagemDeRetorno;

        if(etanol<=precoIdeal) {
            mensagemDeRetorno = "Abasteça com ETANOL";
        } else {
            mensagemDeRetorno = "Abasteça com GASOLINA";
        }

        return mensagemDeRetorno;
    }

}
