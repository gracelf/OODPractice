

package fileFilter.sampleCode;

/**
 *
 */
final class CreatorFilter extends FileFilter {
   public CreatorFilter(FilterParameter filterParam) {
       super(filterParam);
   }

   @Override
   public boolean filter(File file) {
       return file.getCreator().equals(this.getFilterParameter().getCreator());
   }
}

