public class Cliente {

    private String cliente;

    private boolean notaFiscal;

    public Cliente(String cliente, boolean notaFiscal) {
        this.cliente = cliente;
        this.notaFiscal = notaFiscal;
    }
    public boolean notaFiscal() {
        return notaFiscal;
    }
    public String getCliente() {
        return cliente;
    }
}
