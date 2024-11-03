import java.time.LocalDate;
import java.util.Date;

public class Cheque {

    private Double monto;
    private String bancoEmisor;
    private Date fechaDeEmision;

    public Cheque(Double monto, String bancoEmisor, Date fechaDeEmision) {
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

    @Override
    public String toString() {
        return "Cheque{" +
                "monto=" + monto +
                ", bancoEmisor='" + bancoEmisor + '\'' +
                ", fechaDeEmision=" + fechaDeEmision +
                '}';
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }


}


