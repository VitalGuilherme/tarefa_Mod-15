public abstract class Fabrica {

    public Carro create(String requestedGrade) {
        Carro carro = retrieverCar(requestedGrade);
        carro = prepararCarro(carro);
        return carro;
    }
    private Carro prepararCarro(Carro carro) {
        carro.cavalos();
        carro.mecanica();
        carro.opcional();
        return carro;
    }
    abstract Carro retrieverCar(String requestedGrade);
}
