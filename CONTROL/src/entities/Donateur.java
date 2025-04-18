package entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Donateur {
    public Long getId() {

        String nom;
        return 0L;
    }

    public <bigdecimal> bigdecimal getObjectifMontant() {
        return (bigdecimal) objectifMontant;
    }

    public void setObjectifMontant(BigDecimal objectifMontant) {
        this.objectifMontant = objectifMontant;
    }

    private BigDecimal objectifMontant;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String email;
    private String telephone;
}
