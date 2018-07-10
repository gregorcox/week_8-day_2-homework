import db.DBFolder;
import db.DBHelper;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Folder programming = new Folder("Programming");
        DBHelper.save(programming);

        Folder pictures = new Folder("Pictures");
        DBHelper.save(pictures);

        File file1 = new File("file", ".rb", 10, programming);
        DBHelper.save(file1);

        File file2 = new File("Java", ".java", 13, programming);
        DBHelper.save(file2);

        File file3 = new File("Pic1", ".jpg", 12, pictures);
        DBHelper.save(file3);

        File file4 = new File("pic2", ".png", 130, pictures);
        DBHelper.save(file4);

        List<File> files = DBHelper.getAll(File.class);

        List<File> programmingFiles = DBFolder.getFilesForFolder(programming);
    }
}
