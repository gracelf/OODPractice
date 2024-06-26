

package fileFilter.sampleCode;

/**
 *
 */
abstract class FileFilter {
   private FilterParameter filterParam;
   
   public FileFilter(FilterParameter filterParam) {
       this.filterParam = filterParam;
   }

   abstract boolean filter(File file);
   
   public FilterParameter getFilterParameter() {
	   return this.filterParam;
   }
}