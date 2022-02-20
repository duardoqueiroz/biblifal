package core.services;

import java.util.ArrayList;

import core.entities.Section;
import core.repository.ISectionRepository;

public class SectionsService {
    private ISectionRepository sectionRepository;

    public SectionsService(ISectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    public void save(Section section) {
        Section alreadyExists = this.sectionRepository.find(section.getId());
        if(alreadyExists != null) {
            return;
        }
        sectionRepository.save(section);
    }

    public void remove(int sectionId) {
        Section doesNotExists = this.sectionRepository.find(sectionId);
        if(doesNotExists == null){
            return;
        }
        sectionRepository.remove(sectionId);
    }

    public Section find(int sectionId) {
        Section section = this.sectionRepository.find(sectionId);
        return section;
    }

    public ArrayList<Section> findAll() {
        ArrayList<Section> sections = this.sectionRepository.findAll();
        return sections;
    }


}
