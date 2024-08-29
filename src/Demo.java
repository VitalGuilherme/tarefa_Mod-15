public class Demo {

    public static void main(String args[]) {
        Cliente cliente = new Cliente("A", true);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.create(cliente.getCliente());
    }

    private static Fabrica getFabrica(Cliente cliente) {
        if (cliente.notaFiscal()) {
            return new NotaFaturada();
        } else {
            return new NotasPendentes();
        }
    }

}
