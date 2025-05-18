public class Veiculo {
    protected String modelo;
    protected String placa;
    protected int ano;
    protected double precoDiaria;

    public Veiculo(String modelo, String placa, int ano, double precoDiaria) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.precoDiaria = precoDiaria;
    }

    public void mostrarDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println("Preço da diária: R$" + precoDiaria);
    }

    public double calcularCusto(int dias) {
        return precoDiaria * dias;
    }
}