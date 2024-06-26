package fileFilter;

/**
 *
 */
public abstract class FileFilter {

    private FilterTypeEnum filterType;
    private FilterParam filterParam;
    
    FileFilter(FilterTypeEnum filterType,FilterParam filterParam){
        this.filterType = filterType;
        this.filterParam = filterParam;
    }

    public abstract boolean filter(File file)  throws Exception;

    /**
     * @return the filterType
     */
    public FilterTypeEnum getFilterType() {
        return filterType;
    }

    /**
     * @param filterType the filterType to set
     */
    public void setFilterType(FilterTypeEnum filterType) {
        this.filterType = filterType;
    }

    /**
     * @return the filterParam
     */
    public FilterParam getFilterParam() {
        return filterParam;
    }

    /**
     * @param filterParam the filterParam to set
     */
    public void setFilterParam(FilterParam filterParam) {
        this.filterParam = filterParam;
    }

}
