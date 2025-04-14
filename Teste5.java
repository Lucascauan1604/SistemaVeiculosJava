public class Teste {
    public static void main(String[] args) {
        
        Veiculo v1 = new Veiculo("ABC1234", "Fiat", "Uno", "Vermelho", 160.0f, 4, 4, 85);
        Veiculo v2 = new Veiculo("XYZ5678", "Ford", "Ka", "Preto", 180.0f, 4, 3, 95);
        Veiculo v3 = new Veiculo("DEF9012", "Volkswagen", "Gol", "Branco", 170.0f, 4, 4, 100);
        Veiculo v4 = new Veiculo("GHI3456", "Chevrolet", "Onix", "Prata", 190.0f, 4, 3, 110);
        Veiculo v5 = new Veiculo("JKL7890", "Toyota", "Corolla", "Azul", 200.0f, 4, 4, 150);

        
        imprimirVeiculo(v1, 1);
        imprimirVeiculo(v2, 2);
        imprimirVeiculo(v3, 3);
        imprimirVeiculo(v4, 4);
        imprimirVeiculo(v5, 5);
    }

    public static void imprimirVeiculo(Veiculo v, int numero) {
        System.out.println("************************************************************");
        System.out.println("                   VEÍCULO " + numero + "                     ");
        System.out.println("************************************************************");
        System.out.println("| Placa: " + v.lerPlaca());
        System.out.println("| Marca: " + v.getMarca());
        System.out.println("| Modelo: " + v.getModelo());
        System.out.println("| Cor: " + v.getCor());
        System.out.println("| Velocidade Máxima: " + v.getVelocMax() + " km/h");
        System.out.println("| Quantidade de Rodas: " + v.getQtdRodas());
        System.out.println("| Motor - Pistões: " + v.getMotor().getQtdPist());
        System.out.println("| Motor - Potência: " + v.getMotor().getPotencia() + " cv");
        System.out.println("************************************************************");
        System.out.println();
    }
}