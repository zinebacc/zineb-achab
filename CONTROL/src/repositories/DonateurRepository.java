package repositories;

import repositories.entities.Donateur;
import org.springframework.data.Jpa.repository.JpaRepository;
public interface DonateurRepository extends JpaRepository<Donateur, Long> {
}
@Query("SELECT d FROM Donateur d WHERE CURRENT_DATE BETWEEN d.dateDebut AND d.dateFin")
List<DonateurResume> findActiveDonateurs();
