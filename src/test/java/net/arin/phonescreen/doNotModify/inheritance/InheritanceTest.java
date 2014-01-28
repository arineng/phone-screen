package net.arin.phonescreen.doNotModify.inheritance;

import net.arin.phonescreen.exercises.inheritance.CanadianWidget;
import net.arin.phonescreen.exercises.inheritance.GermanWidget;
import net.arin.phonescreen.exercises.inheritance.JapaneseWidget;
import net.arin.phonescreen.exercises.inheritance.WidgetFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InheritanceTest {
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

      for(Widget w : asianAndNorthAmerican.getComponents()){
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
