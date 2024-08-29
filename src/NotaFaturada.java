public class NotaFaturada extends Fabrica {
    @Override
    Carro retrieverCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new EstoqueA(90, "Branco");
        } else if ("AA".equals(requestedGrade)) {
            return new EstoqueA(120, "Azul Marinho");
        }
        return null;
    }
}
