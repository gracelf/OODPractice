package fileFilter.multipleParam;

import fileFilter.File;
import fileFilter.FileFilter;

/**
 *
 */
public class FilterTreeNode {

    private final FileFilter ff;
    private final FilterOperator operator;
    private final FilterTreeNode left, right;

    public FilterTreeNode(FileFilter ff) {
        this.ff = ff;
        this.operator = null;
        this.left = null;
        this.right = null;
    }

    public FilterTreeNode(FilterOperator operator, FilterTreeNode left, FilterTreeNode right) {
        this.ff = null;
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    /**
     * @return the ff
     */
    public FileFilter getFf() {
        return ff;
    }

    /**
     * @return the operator
     */
    public FilterOperator getOperator() {
        return operator;
    }

    /**
     * @return the left
     */
    public FilterTreeNode getLeft() {
        return left;
    }

    /**
     * @return the right
     */
    public FilterTreeNode getRight() {
        return right;
    }
    
    public boolean eval(File file) throws Exception{
        if (this.ff != null){ //this is leaf
            return this.ff.filter(file);
        } else {
            boolean left = this.left.eval(file);
            boolean right = this.right.eval(file);
            return this.operator.eval(left, right);
        } 
    }
}