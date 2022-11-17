package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();

    List<Language> add(int id,String Name);

    List<Language> delete(int id);

    List<Language> update(int id,String name);

    Language bring(int id);

}
