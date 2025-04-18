package controllers;

import entities.Donateur;
import repositories.DonateurResume;
import services.DonateurService;

import java.util.List;

@RestController
@RequestMapping("/api/donateurs")
public class DonateurController {
    @Autowired
    private DonateurRepository donateurRepository;
    @Autowired
    private DonateurService donateurService;
    @GetMapping("")
    public List<Donateur> getAll(){
        return donateurService.getAllDonateurs();
    }
    @GetMapping("/actifs")
    public List<DonateurResume> getActiveDonateurs(){
        return donateurRepository.findActiveDonateurs();
    }
    @PostMapping
    public Donateur create(@RequestBody @Valid Donateur d){
        return
                donateurService.saveDonateur(d);
    }
    @GetMapping(value = "/search")
    public Donateur searchByEmail(@RequestParam String email){
        return donateurService.fineByEmail(email);
    }

}
