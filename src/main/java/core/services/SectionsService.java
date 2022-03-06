package core.services;

import java.util.ArrayList;

import core.entities.Section;
import core.entities.Shelf;
import core.repository.ISectionRepository;

public class SectionsService {
    private ISectionRepository sectionRepository;

    public SectionsService(ISectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    public void save(Section section) {
        sectionRepository.save(section);
    }

    public void remove(int sectionId) {
        Section doesNotExists = this.sectionRepository.find(sectionId);
        if (doesNotExists == null) {
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

    public ArrayList<Shelf> findShelfs(int sectionId) {
        Section section = this.sectionRepository.find(sectionId);

        if (section == null) {
            return null;
        }

        ArrayList<Shelf> shelfs = this.sectionRepository.findShelfs(sectionId);
        return shelfs;
    }

    public void removeShelf(int sectionId, int shelfId) {
        Shelf shelf = this.sectionRepository.findShelf(sectionId, shelfId);

        if (shelf == null) {
            return;
        }

        this.sectionRepository.removeShelf(sectionId, shelfId);
    }

}
