package entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SuiviDonateur {
    @Id  @GeneratedValue
    private Long id;
    @ManyToOne
    private Donateur campagne;
    private String nomDonateur;
    private BigDecimal montant;
    private LocalDate date;


}
