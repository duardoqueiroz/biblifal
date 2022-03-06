package infra.controllers;

import java.util.ArrayList;

import core.entities.Section;
import core.entities.Shelf;
import core.services.SectionsService;
import infra.postgresRepository.SectionRepository;

public class SectionsController {
    private SectionRepository sectionRepository;
    private SectionsService sectionsService;

    public SectionsController() {
        this.sectionRepository = new SectionRepository();
        this.sectionsService = new SectionsService(sectionRepository);
    }

    public void save(Section section) {
        this.sectionsService.save(section);

    }

    public void remove(int sectionId) {
        this.sectionsService.remove(sectionId);

    }

    public Section find(int sectionId) {
        Section section = this.sectionsService.find(sectionId);
        return section;
    }

    public ArrayList<Section> findAll() {
        ArrayList<Section> sections = this.sectionsService.findAll();
        return sections;
    }

    public ArrayList<Shelf> findShelfs(int sectionId) {
        ArrayList<Shelf> sections = this.sectionsService.findShelfs(sectionId);
        return sections;
    }

    public void removeShelf(int sectionId, int shelfId) {
        this.sectionsService.removeShelf(sectionId, shelfId);
    }

}
