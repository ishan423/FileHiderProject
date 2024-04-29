package views;

import dao.DataDAO;
import model.Data;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserView {
    private String email;

    UserView(String email) {
        this.email = email;
    }

    public void home() throws ClassNotFoundException {
      do{
          System.out.println("Welcome to the Home Page" + "   " +  email);
          System.out.println("  Press 1 to Show hidden file");
          System.out.println("  Press 2 to Hide a New  File");
          System.out.println("  Press 3 to UnHide a File");
          System.out.println("  Press 0 to Exit");
          Scanner sc = new Scanner(System.in);
//          int choice = sc.nextInt();
          int ch = Integer.parseInt(sc.nextLine());
          switch(ch) {
            case 1:{
                try {
                    ArrayList<Data> files = DataDAO.getAllFile(this.email);
                    System.out.println("ID - FileName");
                    for(Data file : files) {
                        System.out.println(file.getId() + " - " + file.getFileName());

                    }
                    System.out.println("  No  file found");
                } catch (SQLException | ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }


            }
            case 2:{
                System.out.println("Enter the  File Path");
                String path = sc.nextLine();
                File f = new File(path);
                Data file = new Data(0,f.getName(),path,this.email);
                try {
                    DataDAO.hideFile(file);
                } catch (SQLException | IOException | ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            case 3:{
                ArrayList<Data> files;
                try {
                    files = DataDAO.getAllFile(this.email);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("ID - FileName");
                for(Data file : files) {
                    System.out.println(file.getId() + " - " + file.getFileName());

                }
                System.out.println("Enter the id to Unhide a File");
                int id = Integer.parseInt(sc.nextLine());
                boolean unhide = false;
                for(Data data : files) {
                    if(data.getId() == id) {
                        unhide = true;
                        break;
                    }
                }
                if(unhide){
                    try {
                        DataDAO.unhide(id);
                    } catch (SQLException | IOException | ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }else{
                    System.out.println("Wrong ID");
                }

            }
              case 0:{
                System.exit(0);
              }

          }

      }while(true);
    }





}
