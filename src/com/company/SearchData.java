package com.company;

import java.sql.*;
import java.util.Scanner;

public class SearchData {
    public static void main(String[] args) throws SQLException {
        Scanner dataIn = new Scanner(System.in);
        Connection connection = null;
        System.out.print("Masukan NPM anda ");
        String input = dataIn.nextLine();
        int saveNilai[] = new int[100];
        int jml = 0;
        int y = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/mahasiswa", "root", ""); //db belum ada
            Statement st = connection.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM nilai WHERE npm like " + input + ";");
            System.out.println("npm \t\t\t\t nama \t\t\t\t type \t\t\t\t nilai");
            while ((resultSet.next()) && (y < resultSet.getRow())) {
                System.out.print(resultSet.getString("npm") + "\t\t\t\t");
                System.out.print(resultSet.getString("nm_mhs") + "\t\t\t\t");
                System.out.print(resultSet.getString("type") + "\t\t\t\t");
                saveNilai[y] = (resultSet.getInt("nilai"));
                System.out.print(saveNilai[y]);
                System.out.println();
                y++;
            }
            for (int allJml : saveNilai) {
                jml = jml + allJml;
            }
            //TODO tinggal kondisi if lulus atau tidak
            System.out.println(jml);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
}
