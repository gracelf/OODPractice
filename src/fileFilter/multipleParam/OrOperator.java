package fileFilter.multipleParam;

/**
 *
 */
public class OrOperator implements FilterOperator {

    @Override
    public boolean eval(boolean left, boolean right) {
        return left || right;
    }

}
