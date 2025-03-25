public class Autodromo extends Veiculo{

    //Exemplo de encapsulamento - nem tudo deve estar visivel;
    public void ligar(){
        conferindoCmbustivel();
        System.out.println("Carro Ligado");
    }
    private void conferindoCmbustivel(){
        System.out.println("Conferindo o combustivel");
    }
}
