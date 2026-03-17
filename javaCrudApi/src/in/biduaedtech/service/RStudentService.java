package in.biduaedtech.service;

public interface RStudentService {

	public String addStudent(String sname, Integer sage, String saddress) throws Exception;

	public String searchStudent(Integer sid) throws Exception;

	public String updateStudent(String sname, Integer sage, String saddress) throws Exception;

	public String deleteStudent(Integer sid) throws Exception;
}