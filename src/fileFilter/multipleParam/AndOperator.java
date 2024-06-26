package fileFilter.multipleParam;

/**
 *
 */
public class AndOperator implements FilterOperator {
    @Override
    public boolean eval(boolean left, boolean right) {
        return left & right;
    }
}
