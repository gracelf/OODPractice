package fileFilter;

/**
 *
 */
public class FileFilterByFileName extends FileFilter {

    FileFilterByFileName(FilterTypeEnum filterType, FilterParam filterParam) {
        super(filterType,filterParam);
    }

    @Override
    public boolean filter(File file) {
        if (this.getFilterType() == FilterTypeEnum.FILE_NAME) {
            if (this.getFilterParam().getFileName() != null) {
                if (file.getFileName().equalsIgnoreCase(this.getFilterParam().getFileName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
