

package fileFilter.sampleCode;

final class TypeFilter extends FileFilter {
   public TypeFilter(FilterParameter filterParam) {
       super(filterParam);
   }

   @Override
   public boolean filter(File file) {
       return file.getType().equals(this.getFilterParameter().getType());
   }
}
