package services;

import entities.Donateur;
import services.entites.Donateur;
import services.repositories.DonateurRepository;
import org.springframwork.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@services.Service
public class DonateurService {
    @Autowired
    private DonateurRepository donateurRepository;
    public Donateur saveDonateur(Donateur donateur){
        return donateurRepository.save(donateur);
    }
    public List<Donateur> getAllDonateur(){
        return donateurRepository.findAll();
    }
    public Optional<Donateur> getDonateur(Long id){
        return donateurRepository.findById(id);
    }
    public void deleteDonateur(Long id){
        donateurRepository.deleteId(id);
    }
    public List<Donateur> getActiveDonateurs(){
        LocalDate today = LocalDate.now();
        return donateurRepository.findALL().stream().filter(d->!d.getDateDebut().isAfter(today)&& !d.getDateFin().isBefore(today)).toList();
    }
    public Donateur findEmail(String email) {
        return donateurRepository.findALL.stream().filter(d -> d.getEmail().equalsIgnoreCase(email)).findFirst().orElse(null);
    }

    public List<Donateur> getAllDonateurs() {
        return List.of();
    }

    public Donateur fineByEmail(String email) {
        return null;
    }
}
}
