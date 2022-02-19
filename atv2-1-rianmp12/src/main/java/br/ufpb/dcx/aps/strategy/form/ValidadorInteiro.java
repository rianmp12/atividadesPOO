package br.ufpb.dcx.aps.strategy.form;

public class ValidadorInteiro implements ValidadorCampo{

    private int valorMinimo;
    private int valorMaximo;

    public ValidadorInteiro(int minimo, int maximo) {
        this.valorMinimo = minimo;
        this.valorMaximo = maximo;
    }

    public ValidadorInteiro() {
        this(0,0);
    }

    public Resultado validarCampo(String valor) {
        try {
            int valueInt = Integer.parseInt(valor);
            if(this.valorMinimo == 0 && valorMaximo == 0){
                return new Resultado();
            } else if(valueInt < this.valorMinimo)  {
                return  new Resultado(true,"valor menor que "+this.valorMinimo+":"+valor);
            } else if(valueInt > this.valorMaximo) {
                return new Resultado(true,"valor maior que "+this.valorMaximo+":"+valor);
            } else {
                return new Resultado();
            }
        } catch (NumberFormatException e) {
            return new Resultado(true,"valor não é um inteiro:'"+valor+"'");
        }
    }
}
