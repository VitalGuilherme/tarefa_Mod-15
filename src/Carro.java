public abstract class Carro {

    private int horsePower;
    private String color;
    public Carro(int horsePower, String color) {
        this.horsePower = horsePower;
        this.color = color;
    }
    public void cavalos() {
        System.out.println(getClass().getSimpleName());
        System.out.println("Modelo " + horsePower + " cv.");
    }
    public void opcional() {

        System.out.println(color.toLowerCase() + " Escolhida pelo cliente.");
    }
    public void mecanica() {
        System.out.println("Mecânica verificada");
    }

}
