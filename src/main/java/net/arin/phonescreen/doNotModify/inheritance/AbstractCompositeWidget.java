package net.arin.phonescreen.doNotModify.inheritance;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCompositeWidget implements CompositeWidget {
   private List<Widget> components = new ArrayList<Widget>();

   @Override
   public List<Widget> getComponents() {
      return components;
   }

   public void setComponents(List<Widget> components) {
      this.components = components;
   }

   /**
    * CompositeWidget doesn't really have a single country of origin.
    */
   @Override
   public final CountryOfOrigin getCountryOfOrigin() {
      return CountryOfOrigin.COMPOSITE;
   }

   /**
    * The composite widget is "made in" North America if at least one component is
    */
   @Override
   public final boolean isMadeInNorthAmerica() {
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
   public final boolean isMadeInEurope() {
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
   public final boolean isMadeInAsia() {
      return Collections2.filter(getComponents(), new Predicate<Widget>() {
         @Override
         public boolean apply(Widget widget) {
            return widget.isMadeInAsia();
         }
      }).size() > 0;
   }
}
