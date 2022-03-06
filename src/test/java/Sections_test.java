/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import core.entities.Section;
import core.services.SectionsService;
import infra.controllers.SectionsController;
import infra.postgresRepository.SectionRepository;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 *
 * @author guilherme
 */
public class Sections_test {
    public Sections_test() {

    }

    SectionRepository sectionRepository = new SectionRepository();
    SectionsService sectionsService = new SectionsService(sectionRepository);
    SectionsController sectionsController = new SectionsController();

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    public void find_ShouldBringAnObject() {

        Section section = sectionRepository.find(1);
        Section sectionS = sectionsService.find(1);
        Section sectionC = sectionsController.find(1);
        assertNotNull(section);
        assertNotNull(sectionS);
        assertNotNull(sectionC);
    }

    @Test
    public void find_ShouldBringAnArray() {
        ArrayList<Section> sections = sectionRepository.findAll();
        ArrayList<Section> sectionsS = sectionsService.findAll();
        ArrayList<Section> sectionsC = sectionsController.findAll();

        assertEquals(2, sections.size());
        assertEquals(2, sectionsS.size());
        assertEquals(2, sectionsC.size());

    }

}
