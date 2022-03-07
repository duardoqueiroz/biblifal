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

import database.Postgres;
import infra.controllers.SectionsController;
import infra.postgresRepository.SectionRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;

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


    static ArrayList<Section> sectionsArrayExpected = new ArrayList<Section>();
    static Section sectionExpected;

    @BeforeClass
    public static void setUpClass() {

        sectionExpected = new Section(1, "Nacional", "Seção de livros nacionais.");

        sectionsArrayExpected.add(new Section(1, "Nacional", "Seção de livros nacionais."));
        sectionsArrayExpected.add(new Section(2, "Infantil", "Seção de livros para crianças."));

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        try {
            Connection conn = Postgres.getConnection();
            String sql = "TRUNCATE sections CASCADE;";

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();

            String sql2 = "INSERT INTO sections (id, name, description) VALUES (1, 'Nacional', 'Seção de livros nacionais.');"
                    +
                    "INSERT INTO sections (id, name, description) VALUES (2, 'Infantil', 'Seção de livros para crianças.');";
            PreparedStatement pst2 = conn.prepareStatement(sql2);

            pst2.execute();

            pst2.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @After
    public void tearDown() {
    }

    @Test
    public void find_ShouldBringAnObject() {

        Section section = sectionRepository.find(1);
        Section sectionS = sectionsService.find(1);
        Section sectionC = sectionsController.find(1);

        assertEquals(sectionExpected.toString(), section.toString());
        assertEquals(sectionExpected.toString(), sectionS.toString());
        assertEquals(sectionExpected.toString(), sectionC.toString());

    }

    @Test
    public void find_ShouldBringANullObjectWhenIsNotFound() {

        Section section = sectionRepository.find(10);
        Section sectionS = sectionsService.find(10);
        Section sectionC = sectionsController.find(10);
        assertNull(section);
        assertNull(sectionS);
        assertNull(sectionC);
    }

    @Test
    public void findAll_ShouldBringAnArray() {

        ArrayList<Section> sectionsArray = sectionRepository.findAll();
        ArrayList<Section> sectionsArrayS = sectionsService.findAll();
        ArrayList<Section> sectionsArrayC = sectionsController.findAll();

        assertEquals(sectionsArrayExpected.toString(), sectionsArray.toString());
        assertEquals(sectionsArrayExpected.toString(), sectionsArrayS.toString());
        assertEquals(sectionsArrayExpected.toString(), sectionsArrayC.toString());

    }

    @Test
    public void findAll_ShouldBringAnEmptyArrayWhenTableDontHaveElements() {
        try {
            Connection conn = Postgres.getConnection();
            String sql = "TRUNCATE sections CASCADE;";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<Section> sections = sectionRepository.findAll();
        assertTrue(sections.isEmpty());
    }

}
