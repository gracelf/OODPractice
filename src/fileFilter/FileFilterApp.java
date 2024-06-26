package fileFilter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public final class FileFilterApp {

    public static void main(String[] args) throws Exception {
        List<File> files = new ArrayList<>();
        //add some files
        files.add(new File("TestingFile 1", "Eric", "excel", 10));
        files.add(new File("TestingFile 2", "Ryan", "doc", 10));
        FileSystem fileSystem = new FileSystem(files);
        fileSystem.add(new File("TestingFile 3", "Eric", "excel", 10));
        //create filter
        FilterParam filterParam = FilterParam.buildFromCreator("Eric");
        FileFilter filter = new FileFilterByCreatorName(FilterTypeEnum.CREATOR_NAME, filterParam);

        FilterParam filterParam2 = FilterParam.buildFromFileName("TestingFile 1");
        FileFilter filter2 = new FileFilterByFileName(FilterTypeEnum.FILE_NAME, filterParam2);
        //filter the file action
        fileSystem.filter(files, filter);
        try {
            fileSystem.filter(files, filter2);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
    }

}
