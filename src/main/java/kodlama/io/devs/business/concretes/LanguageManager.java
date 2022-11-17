package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.List;
import java.util.Objects;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public List<Language> add(int id, String name) {

        try {
            if (id > 0 && !Objects.equals(name, "")) {
                return languageRepository.add(id, name);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public List<Language> delete(int id) {
        return languageRepository.delete(id);
    }

    @Override
    public List<Language> update(int id, String name) {
        return languageRepository.update(id,name);
    }

    @Override
    public Language bring(int id) {
        return languageRepository.bring(id);
    }
}
