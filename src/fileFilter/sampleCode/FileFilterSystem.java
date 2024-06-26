package fileFilter.sampleCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public final class FileFilterSystem {

    // Single filter condition
    public List<File> filter(List<File> files, FileFilter fileFilter) {
        List<File> res = new ArrayList<>(); //LinkedList
        if (files == null || files.size() == 0) {
            return res;
        }

        for (File f : files) {
            if (fileFilter.filter(f)) {
                res.add(f);
            }
        }

        return res;
    }

    // Combo filter conditions
    public List<File> filter(List<File> files, FilterTreeNode root) {
        List<File> res = new ArrayList<>();
        if (files == null || files.size() == 0) {
            return res;
        }

        for (File f : files) {
            if (root.eval(f)) {
                res.add(f);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        FileFilterSystem fileFilterSystem = new FileFilterSystem();

        File a = new File(500, "Andyjpg16", "jpg", "Andy");
        File b = new File(200, "Britsjpg17", "jpg", "Brits");
        File c = new File(500, "Collintxt15", "txt", "Collin");
        File d = new File(300, "Divapdf20", "pdf", "Diva");

        List<File> files = Arrays.asList(a, b, c, d);

        // test single file filter
        System.out.println("--------------test single file filter------------------");

        FilterParameter fileParam = FilterParameter.createFromSize(500);
        SizeFilter sizeFilter = new SizeFilter(fileParam);
        // or FileFilter sizeFilter2 = new SizeFilter(fileParam);

        List<File> res1 = fileFilterSystem.filter(files, sizeFilter);
        fileFilterSystem.printFiles(res1);

        // test file filter combo
        System.out.println("\n--------------test file filter combo------------------");

        AndFilterTreeOperator andOptr = new AndFilterTreeOperator();
        OrFilterTreeOperator orOptr = new OrFilterTreeOperator();

        //size500 filter
        FilterParameter fileParamSize500 = FilterParameter.createFromSize(500);
        SizeFilter sizeFilter500 = new SizeFilter(fileParamSize500);
        //creatorByAndy filter
        FileFilter creatorFilterAndy = new CreatorFilter(FilterParameter.createFromCreator("Andy"));

        FilterTreeNode node3 = new FilterTreeNode(sizeFilter500);
        FilterTreeNode node4 = new FilterTreeNode(creatorFilterAndy);
        //left node 3, and right node 4
        FilterTreeNode node1 = new FilterTreeNode(andOptr, node3, node4);

        TypeFilter typeFilter = new TypeFilter(FilterParameter.createFromType("pdf"));

        FilterTreeNode node2 = new FilterTreeNode(typeFilter);
        FilterTreeNode root = new FilterTreeNode(orOptr, node1, node2);

        List<File> res2 = fileFilterSystem.filter(files, root);
        fileFilterSystem.printFiles(res2);
    }

    private void printFiles(List<File> files) {
        for (File file : files) {
            System.out.println(file);
        }
    }
}
