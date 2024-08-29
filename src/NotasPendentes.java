public class NotasPendentes extends Fabrica {
    Carro retrieverCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new EstoqueB(90, "Preto");
        } else if ("AA".equals(requestedGrade)) {
            return new EstoqueB(120, "Branco, teto preto.");
        } else {
            return null;
        }
    }
}
