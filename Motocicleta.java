class Motocicleta extends Veiculo {
    private String tipoDeCombustivel;

    public Motocicleta(String modelo, String placa, int ano, double precoDiaria, String tipoDeCombustivel) {
        super(modelo, placa, ano, precoDiaria);
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo de combustível: " + tipoDeCombustivel);
    }

    @Override
    public double calcularCusto(int dias) {
        double custo = super.calcularCusto(dias);
        if (dias > 5) {
            custo *= 0.97;
        }
        return custo;
    }
}