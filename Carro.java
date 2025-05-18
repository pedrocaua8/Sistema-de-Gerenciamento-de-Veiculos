public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String modelo, String placa, int ano, double precoDiaria, int numeroDePortas) {
        super(modelo, placa, ano, precoDiaria);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de portas: " + numeroDePortas);
    }

    @Override
    public double calcularCusto(int dias) {
        double custo = super.calcularCusto(dias);
        if (dias > 10) {
            custo *= 0.95; 
        }
        return custo;
    }
}