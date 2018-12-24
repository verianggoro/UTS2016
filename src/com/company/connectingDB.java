package com.company;

import java.sql.*;

public class connectingDB {
    public static void main(String[] args) throws SQLException { //Kondisi dimana amount > 7000000 perform jika < 7000000 not perform
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/penjualan", "root", "");
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT salesman, amount FROM sales ");
            System.out.println("Salesman \t\t  amount \t\t Result");
            while (rs.next()) {
                if((rs.getString("amount").equals("7000000"))&& (rs.getString("amount").equals("7000000"))){
                    System.out.print(rs.getString("salesman") + "\t\t\t");
                    System.out.print(rs.getString("amount") + "\t\t\t");
                    System.out.print("Perform");
                    System.out.println();
                }else{
                    System.out.print(rs.getString("salesman")+ "\t\t\t");
                    System.out.print(rs.getString("amount") + "\t\t\t");
                    System.out.print("Not Perform");
                    System.out.println();
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (connection!= null){
                connection.close();
            }
        }
    }
}
