package in.biduaedtech.persistance;

import java.sql.SQLException;

public interface RStudentDao {

    public String addStudent(String sname, Integer sage, String saddress) 
            throws SQLException, ClassNotFoundException;

    public String searchStudent(Integer sid) 
            throws SQLException, ClassNotFoundException;

    public String updateStudent(String sname, Integer sage, String saddress) 
            throws SQLException, ClassNotFoundException;

    public String deleteStudent(Integer sid) 
            throws SQLException, ClassNotFoundException;
}