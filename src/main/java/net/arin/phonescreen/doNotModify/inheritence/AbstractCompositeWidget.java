package net.arin.phonescreen.doNotModify.inheritence;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

public abstract class AbstractCompositeWidget implements CompositeWidget {
   /**
    * The composite widget is "made in" North America if at least one component is
    */
   @Override
   public boolean isMadeInNorthAmerica() {
      return Collections2.filter(getComponents(), new Predicate<Widget>() {
         @Override
         public boolean apply(Widget widget) {
            return widget.isMadeInNorthAmerica();
         }
      }).size() > 0;
   }

   /**
    * The composite widget is "made in" Europe if at least one component is
    */
   @Override
   public boolean isMadeInEurope() {
      return Collections2.filter(getComponents(), new Predicate<Widget>() {
         @Override
         public boolean apply(Widget widget) {
            return widget.isMadeInEurope();
         }
      }).size() > 0;
   }

   /**
    * The composite widget is "made in" Asia if at least one component is
    */
   @Override
   public boolean isMadeInAsia() {
      return Collections2.filter(getComponents(), new Predicate<Widget>() {
         @Override
         public boolean apply(Widget widget) {
            return widget.isMadeInAsia();
         }
      }).size() > 0;
   }
}
