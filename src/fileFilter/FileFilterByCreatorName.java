package fileFilter;

import java.io.IOException;

/**
 *
 */
public class FileFilterByCreatorName extends FileFilter {

    FileFilterByCreatorName(FilterTypeEnum filterType, FilterParam filterParam) {
        super(filterType,filterParam);
    }

    @Override
    public boolean filter( File file) throws IOException{
        if(file == null){
            throw new IOException("file is null");  
        }
        if (this.getFilterType() == FilterTypeEnum.CREATOR_NAME) {
            if (this.getFilterParam().getCreator()!= null) {
                if (file.getCreatorName().equalsIgnoreCase(this.getFilterParam().getCreator())) {
                    return true;
                }
            }
        }
        return false;
    }
}
