package fileFilter;

/**
 *
 */
public class File {

    private String fileName;
    private String creatorName;
    private String fileType;
    private int fileSize;
    
    public File(String fileName, String creatorName, String fileType, int fileSize) {
        this.fileName = fileName;
        this.creatorName = creatorName;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }
    
    public String toString(){
        return this.fileName + this.creatorName + this.fileType + this.fileSize;
    }
    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * @param creatorName the creatorName to set
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    /**
     * @return the fileType
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * @param fileType the fileType to set
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * @return the fileSize
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * @param fileSize the fileSize to set
     */
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

}
