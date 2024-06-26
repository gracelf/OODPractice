package fileFilter.multipleParam;

/**
 *
 */
public enum FilterOperatorEnum {
    AND("and"),
    OR("or");

    private final String description;

    FilterOperatorEnum(String description) {
        this.description = description;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

}
