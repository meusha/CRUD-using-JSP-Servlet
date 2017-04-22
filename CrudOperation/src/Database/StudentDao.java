package Database;

import Module.Student;

import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 4/10/2017.
 */
public class StudentDao {
    private Connection con;

    public StudentDao(){
        con = DbController.getConnection();
    }

    public void addStudent(Student s){

        try {
            PreparedStatement ps = con.prepareStatement("insert into studentdetail(id,name, address, email) value(?,?,?,?)");
            ps.setInt(1, s.getStudentId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getAddress());
            ps.setString(4,s.getEmail());
            ps.executeUpdate();
//            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteStd(int studentId) {
        try {
            PreparedStatement ps = con.prepareStatement("delete from studentdetail where id=?");
            ps.setInt(1,studentId);
            ps.executeUpdate();
//            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public void updateStd(Student s) throws ParseException{
            System.out.println(s.getStudentId());

            try {
                PreparedStatement ps = con.prepareStatement("update studentdetail set name=?, address=?, email=?" +"where id=?" );
                ps.setString(1,s.getName());
                ps.setString(2,s.getAddress());
                ps.setString(3,s.getEmail());
                ps.setInt(4,s.getStudentId());
                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        public List<Student> getAllStudent() {
            List<Student> students;
            students = new ArrayList<Student>();
            try {
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery("select * from studentdetail");
                while (rs.next()) {
                    students.add(new Student(rs.getInt("id"), rs.getString("name"),
                            rs.getString("address"), rs.getString("email")));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return students;
        }
}