package kodlama.io.devs.dataAccess.concretes;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"C"));
        languages.add(new Language(2,"Java"));
        languages.add(new Language(3,"C#"));
        languages.add(new Language(4,"C++"));


    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public List<Language> add(int id,String name) {
        languages.add(new Language(id,name));
        return languages;
    }

    @Override
    public List<Language> delete(int id) {
        languages.remove(id-1);
        return languages;
    }

    @Override
    public List<Language> update(int id, String name) {

        languages.set((id-1),(new Language(id,name)));

        return languages;
    }

    @Override
    public Language bring(int id) {
        return languages.get(id-1);
    }
}
