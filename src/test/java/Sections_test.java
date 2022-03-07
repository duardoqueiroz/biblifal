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

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {/*
                          * try {
                          * Connection conn = Postgres.getConnection();
                          * String sql =
                          * "INSERT INTO sections (id, name, description) VALUES (1, 'Nacional', 'Seção de livros nacionais.');"
                          * +
                          * "INSERT INTO sections (id, name, description) VALUES (2, 'Infantil', 'Seção de livros para crianças.');"
                          * ;
                          * PreparedStatement pst = conn.prepareStatement(sql);
                          * pst.execute();
                          * 
                          * pst.close();
                          * conn.close();
                          * } catch (Exception e) {
                          * e.printStackTrace();
                          * }
                          */
    }

    @After
    public void tearDown() {
    }

    @Test
    public void find_ShouldBringAnObject() {

        Section sectionExpected = new Section(1, "Nacional ", "Seção de livros nacionais.");
        Section section = sectionRepository.find(1);
        Section sectionS = sectionsService.find(1);
        Section sectionC = sectionsController.find(1);

        assertEquals(sectionExpected, section);
    }

    @Test
    public void find_ShouldBringAnArray() {
        ArrayList<Section> sections = sectionRepository.findAll();
        ArrayList<Section> sectionsS = sectionsService.findAll();
        ArrayList<Section> sectionsC = sectionsController.findAll();

        assertEquals(2, 2);

    }

}
