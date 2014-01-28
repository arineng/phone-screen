package net.arin.phonescreen.doNotModify.inheritence;

import net.arin.phonescreen.exercises.inheritence.CanadianWidget;
import net.arin.phonescreen.exercises.inheritence.GermanWidget;
import net.arin.phonescreen.exercises.inheritence.JapaneseWidget;
import net.arin.phonescreen.exercises.inheritence.WidgetFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InheritenceTest {
   private CompositeWidget northAmericanAndEuropean;
   private CompositeWidget asianAndNorthAmerican;

   @BeforeTest
   public void setup(){
      northAmericanAndEuropean = WidgetFactory.getNorthAmericanAndEuropeanWidget();
      asianAndNorthAmerican = WidgetFactory.getAsianAndNorthAmericanWidget();
   }

   @Test
   public void testFirstWidget() {
      //Making sure you followed directions
      Assert.assertTrue(
            northAmericanAndEuropean instanceof AbstractCompositeWidget,
            "You're working too hard. If you extend the right class, a lot of work will be done for you."
      );

      for(Widget w : northAmericanAndEuropean.getComponents()){
         Assert.assertTrue(
               w instanceof AbstractWidget,
               "You're working too hard. If you extend the right class, a lot of work will be done for you."
         );
         Assert.assertTrue(w instanceof CanadianWidget || w instanceof GermanWidget);
      }

      //Testing your class
      Assert.assertTrue(northAmericanAndEuropean.isMadeInNorthAmerica());
      Assert.assertTrue(northAmericanAndEuropean.isMadeInEurope());
      Assert.assertFalse(northAmericanAndEuropean.isMadeInAsia());
   }

   @Test
   public void testSecondWidget() {
      //Making sure you followed directions
      Assert.assertTrue(
            asianAndNorthAmerican instanceof AbstractCompositeWidget,
            "You're working too hard. If you extend the right class, a lot of work will be done for you."
      );

      for(Widget w : northAmericanAndEuropean.getComponents()){
         Assert.assertTrue(
               w instanceof AbstractWidget,
               "You're working too hard. If you extend the right class, a lot of work will be done for you."
         );
         Assert.assertTrue(w instanceof CanadianWidget || w instanceof JapaneseWidget);
      }

      //Testing your class
      Assert.assertTrue(asianAndNorthAmerican.isMadeInNorthAmerica());
      Assert.assertTrue(asianAndNorthAmerican.isMadeInAsia());
      Assert.assertFalse(asianAndNorthAmerican.isMadeInEurope());
   }
}
