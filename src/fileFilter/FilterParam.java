package fileFilter;

/**
 *
 */
public class FilterParam {

    private final String creator;
    //nullable, int cann't be null
    private final Integer size;
    private final String fileType;
    private final String fileName;

    private FilterParam(String creator, Integer size, String fileType, String fileName) {
        this.creator = creator;
        this.size = size;
        this.fileType = fileType;
        this.fileName = fileName;
    }

    public static FilterParam buildFromCreator(String creator) {
        return new FilterParam(creator, 0, null, null);
    }

    public static FilterParam buildFromSize(int size) {
        return new FilterParam(null, size, null, null);
    }

    public static FilterParam buildFromFileType(String fileType) {
        return new FilterParam(null, null, fileType, null);
    }

    public static FilterParam buildFromFileName(String fileName) {
        return new FilterParam(null, null, null, fileName);
    }

    /**
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @return the fileType
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

}
