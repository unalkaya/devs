package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {

    List<Language> getAll();

    List<Language> add(int id, String name);

    List<Language> delete(int id);

    List<Language> update(int id,String name);
    Language bring(int id);


}
