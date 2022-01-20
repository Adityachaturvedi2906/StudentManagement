package javaConnectorProj2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean insertStudentToDB(Student st) throws Exception
	{
		boolean bl = false;
	
		Connection cct = ConnectionClass.connect();
		String insert = "insert into Student(id, name, phone_Num, city) values(?,?,?,?)";  
		
		//prepared statement
		
		PreparedStatement ppst = cct.prepareStatement(insert);
		
		//set the values of parameter
		ppst.setInt(1, st.getId());
		ppst.setString(2, st.getName());
		ppst.setString(3, st.getPhoneNum());
		ppst.setString(4, st.getCity());
		
		ppst.executeUpdate();
		
		bl = true;
		
		return bl;
	}
	
	public static boolean deleteStudent(int id) throws Exception
	{
		boolean bl = false;
		Connection con = ConnectionClass.connect();
		String delete = "delete from Student where id = ?";
		
		PreparedStatement ppst = con.prepareStatement(delete);
		ppst.setInt(1, id);
		
		ppst.executeUpdate();
		bl = true;
		
		return bl;
		
	}
	
	public static void showAllstudents() throws Exception {
		boolean f = false;
			
		
				Connection con = ConnectionClass.connect();
				String show = "select * from Student";
				Statement stmt = con.createStatement();
				ResultSet set = stmt.executeQuery(show);
				
				while(set.next())
				{
				   	int id = set.getInt(1);
					String name = set.getString(2);
					String phone = set.getString(3);
					String city = set.getString(4);
					
					System.out.println("ID:" + id);
					System.out.println("Name :" + name);
					System.out.println("Phone:-" + phone);
					System.out.println("City:-" + city);
					System.out.println("++++++++++++++++++++++++++++");
					
				}
			}
	}
			
			
			
