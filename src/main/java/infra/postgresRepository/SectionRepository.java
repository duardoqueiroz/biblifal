package infra.postgresRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import core.entities.Section;
import core.repository.ISectionRepository;
import database.Postgres;

public class SectionRepository implements ISectionRepository {

    @Override
    public void save(Section section) {
        try {
            Connection conn = Postgres.getConnection();
            String sql = "INSERT INTO sections(id, name, description) VALUES(DEFAULT, ?, ?);";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, section.getName());
            pst.setString(2, section.getDescription());
            pst.execute();

            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int sectionId) {
        try {
            Connection conn = Postgres.getConnection();
            String sql = "DELETE FROM sections WHERE id = ?;";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, sectionId);
            pst.execute();
            
            pst.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public Section find(int sectionId) {
        Section section = null;
        try {
            Connection conn = Postgres.getConnection();
            String sql = "SELECT * FROM sections WHERE id = ?;";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, sectionId);
            ResultSet rst = pst.executeQuery();
            
            while (rst.next()){
                int id = rst.getInt("id");
                String name = rst.getString("name");
                String description = rst.getString("description");
                section = new Section(id, name, description);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return section;
    }

    @Override
    public ArrayList<Section> findAll() {
        ArrayList<Section> sections = new ArrayList<>();
        try {
            Connection conn = Postgres.getConnection();
            String sql = "SELECT * FROM sections;";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while(rst.next()) {
                int id = rst.getInt("id");
                String name = rst.getString("name");
                String description = rst.getString("description");
                Section section = new Section(id, name, description);
                sections.add(section);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return sections;
    }
    
}
