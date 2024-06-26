package fileFilter;

import fileFilter.multipleParam.AndOperator;
import fileFilter.multipleParam.FilterTreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class FileSystem {

    private List<File> files;

    public FileSystem() {
        this.files = new ArrayList<>();
    }

    public FileSystem(List<File> files) {
        this.files = files;
    }

    /**
     * @return the files
     */
    public List<File> getFiles() {
        return files;
    }

    /**
     * @param files the files to set
     */
    public void setFiles(List<File> files) {
        this.files = files;
    }

    public boolean add(File file) {
        return this.files.add(file);
    }

    public boolean remove(File file) {
        //existing list api check if exist
        return this.files.remove(file);
    }

    //single filter
    public List<File> filter(List<File> files, FileFilter filter) throws Exception {
        List<File> res = filterOneByOne(files, filter);
        return res;
    }

    public static List<File> filterOneByOne(List<File> files, FileFilter filter) throws Exception {
        List<File> res = new ArrayList<>();
        for (File file : files) {
            if (filter.filter(file)) {
                res.add(file);
            }
        }
        return res;
    }

    public List<File> grepCMD(String cmd) {
        List<File> result = new ArrayList<>();
        // parse the cmd 
        // create filter based on type
        return result;
    }

    // test here or in FileFilterApp
    public static void main(String[] args) throws Exception {
        // file system
        FileSystem fileSystem = new FileSystem();
        fileSystem.add(new File("TestingFile 1", "Eric", "excel", 10));
        fileSystem.add(new File("TestingFile 2", "Ryan", "doc", 10));
        fileSystem.add(new File("TestingFile 3", "Eric", "doc", 10));
        //single filter, create filter
        System.out.println("======testing single filter, file sieze: " + fileSystem.getFiles().size());
        FilterParam filterParam1 = FilterParam.buildFromCreator("Eric");
        FileFilter filter1 = new FileFilterByCreatorName(FilterTypeEnum.CREATOR_NAME, filterParam1);
        //filter the file action
        List<File> res = fileSystem.filter(fileSystem.getFiles(), filter1);
        fileSystem.printFiles(res);

        //combo filter 
        System.out.println("======testing combo filter, file sieze: " + fileSystem.getFiles().size());
        FilterParam filterParam2 = FilterParam.buildFromFileName("TestingFile 1");
        FileFilter filter2 = new FileFilterByFileName(FilterTypeEnum.FILE_NAME, filterParam2);
        //left and right tree node
        FilterTreeNode filterTreeNode1 = new FilterTreeNode(filter1);
        FilterTreeNode filterTreeNode2 = new FilterTreeNode(filter2);
        FilterTreeNode treeNode = new FilterTreeNode(new AndOperator(), filterTreeNode1, filterTreeNode2);
        List<File> res2 = new ArrayList<>();
        for (File file : fileSystem.getFiles()) {
            if (treeNode.eval(file)) {
                res2.add(file);
            }
        }
        fileSystem.printFiles(res2);
    }

    private void printFiles(List<File> files) {
        for (File file : files) {
            System.out.println(file);
        }
    }

}
