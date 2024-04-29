package model;

public class Data {
    private int id;
    private  String FileName;
    private String path;
    private String email;

    public Data(int id, String fileName, String path) {
        this.id = id;
        FileName = fileName;
        this.path = path;
    }

    public Data(int id, String fileName, String path, String email) {
        this.id = id;
        this.FileName = fileName;
        this.path = path;
        this.email = email;




    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
