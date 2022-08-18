package Address_Book;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class AddressBook {

    public static void main(String darsh[]) {
        DataInputStream d = new DataInputStream(System.in);

        try {
            System.out.println("----------SQL Operations------------");
            String dbURL = "jdbc:mysql://localhost/payroll_service";
            System.out.println("DataBase Has Connected");
            String username = "root";
            String password = "yuktadarsh";
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connection Succesfully......");
            Statement stmt = conn.createStatement();

            System.out.println("You Want To Table Display ? ");
            String se_sta = d.readLine();
            if(se_sta.equals("yes"))
            {
                String sql = "select * from employee where date_add between '2021-04-09' and '2021-04-10'  ;";
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("eid   ename   age    salary  city ");
                System.out.println("-----------------------------");
                while (rs.next())
                {
                    int eid = rs.getInt("Id");
                    String ename = rs.getString("Name");
                    int eage = rs.getInt("Age");
                    int salary = rs.getInt("Salary");
                    String ecity = rs.getString("city");
                    System.out.println(+eid+"   "+ename+"   "+eage+"  "+salary+"  "+ecity);
                }
                System.out.println("-----------------------------");
                System.out.println("Display Table  Successfully");
                System.out.println("-----------------------------");
                System.exit(0);

            }
            else if(se_sta.equals("no"))
            {
                System.out.println("Exit Successfully");

            }
            System.out.println("You want Update Some Records");
            String upa_sta = d.readLine();

            if( upa_sta.equals("yes"))
            {
                System.out.println("How Many Rows You Want Update ? ");
                int upa_num = Integer.parseInt(d.readLine());
                for(int y = 0;y < upa_num;y++)
                {
                    System.out.println("Enter You Want Update Name ");
                    String up_name = d.readLine();

                    System.out.println("Enter You Want that update Id    ");
                    int up_id = Integer.parseInt(d.readLine());

                    String update = "update  employee  set Name  = '"+up_name+"'  where Id = " +up_id+";";
                    stmt.executeUpdate(update);
                    System.out.println("Update Record Successfully");
                }

            }
            else if(upa_sta.equals("no"))
            {
                System.out.println("Ok Darsh....");


            }


        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}