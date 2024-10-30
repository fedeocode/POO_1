import java.time.LocalDate;

public class Cheque {

    private Double monto;
    private String bancoEmisor;
    private LocalDate fechaDeEmision;

    public Cheque(Double monto, String bancoEmisor, LocalDate fechaDeEmision) {
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fechaDeEmision = fechaDeEmision;
    }

   public String mostrarInfo(){


        System.out.println("cheque depositado"+this.monto);

        return mostrarInfo();



   }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
