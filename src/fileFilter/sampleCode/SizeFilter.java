

package fileFilter.sampleCode;

/**
 *
 */
final class SizeFilter extends FileFilter {
   public SizeFilter(FilterParameter filterParam) {
       super(filterParam);
   }

   @Override
   public boolean filter(File file) {
       return file.getSize()== this.getFilterParameter().getSize();
   }
}
