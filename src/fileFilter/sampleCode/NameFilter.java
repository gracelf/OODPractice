


package fileFilter.sampleCode;

/**
 *
 */
final class NameFilter extends FileFilter {
   public NameFilter(FilterParameter filterParam) {
       super(filterParam);
   }

   @Override
   public boolean filter(File file) {
       return file.getName().equals(this.getFilterParameter().getName());
   }
}

