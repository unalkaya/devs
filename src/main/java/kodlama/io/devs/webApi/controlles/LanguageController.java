package kodlama.io.devs.webApi.controlles;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class LanguageController {

    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<Language> getAll() {
        return languageService.getAll();
    }

    @GetMapping("/add")
    public List<Language> add() {
        return languageService.add(1,"");
    }

    @GetMapping("/delete")
    public List<Language> delete() {
        return languageService.delete(1);
    }

    @GetMapping("/update")
    public List<Language> update() {
        return languageService.update(2,"Php");
    }

    @GetMapping("/bring")
    public Language bring() {
        return languageService.bring(2);
    }


}
