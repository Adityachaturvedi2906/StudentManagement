package javaConnectorProj2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) throws Exception {

		System.out.println("=== welcome to Student Management Application ===");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Press 1 to Add a field...");
			System.out.println("Press 2 to Delete a field...");
			System.out.println("Press 3 to Display the fields...");
			System.out.println("Press 4 to Exit...");
			
			int toCheck = Integer.parseInt(br.readLine());
			
			if( toCheck == 1 )
			{
				System.out.println("Enter User Id: ");
				int id  = Integer.parseInt(br.readLine());
				
				System.out.println("Enter User Name: ");
				String name  = br.readLine();
				
				System.out.println("Enter Users Phone Number: ");
				String PhoneNum  = br.readLine();
				
				System.out.println("Enter Users City: ");
				String city  = br.readLine();
				
				Student st = new Student(id, name, PhoneNum, city);
				
				boolean answer = StudentDao.insertStudentToDB(st);
				
				if(answer)
				{
					System.out.println("Insertion Completed...");
				}else
				{
					System.out.println("Something went wrong");
				}
				System.out.println(st);
				
			}
				else if( toCheck == 2 )
			{
					System.out.println("Enter the id to delete a field");
				
					int id = Integer.parseInt(br.readLine());
					
					boolean answer = StudentDao.deleteStudent(id);
					
					if(answer)
					{
						System.out.println("Deleted Successfully");
					}else
					{
						System.out.println("Something went wrong");
					}
			}
			
				  else if( toCheck == 3 )
				{
					StudentDao.showAllstudents();
				}
			
				  else if( toCheck == 4 )
				{
					  System.out.println("**************** Thank you for using my Application ****************");
						System.exit(0);
				}
				  else{
					  {
						  System.out.println("Thank you for Using my Application....");
					  }
				  }
		}
		
	}

}
