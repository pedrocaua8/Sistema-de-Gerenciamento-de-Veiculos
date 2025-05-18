class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", "ABB-555", 2023, 150.0, 4);
        Motocicleta moto = new Motocicleta("Honda Ww", "ABC-4698", 2021, 70.0, "Gasolina");

        System.out.println("Dados do Carro:");
        carro.mostrarDados();
        System.out.printf("Custo por 12 dias: R$%.2f\n\n", carro.calcularCusto(13));

        System.out.println("Dados da Motocicleta:");
        moto.mostrarDados();
        System.out.printf("Custo por 7 dias: R$%.2f\n", moto.calcularCusto(8));
    }
}