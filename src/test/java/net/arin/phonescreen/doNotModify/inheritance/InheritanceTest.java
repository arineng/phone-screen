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
   public void testNorthAmericanAndEuropeanExtendsAbstractHelperClass() {
      Assert.assertTrue(
            northAmericanAndEuropean instanceof AbstractCompositeWidget,
            "You're working too hard. If you extend the right class, a lot of work will be done for you."
      );
   }

   @Test
   public void testNorthAmericanAndEuropeanComponentsExtendAbstractHelperClass(){
      for(Widget w : northAmericanAndEuropean.getComponents()){
         Assert.assertTrue(
               w instanceof AbstractWidget,
               "You're working too hard. If you extend the right class, a lot of work will be done for you."
         );
      }
   }

   @Test
   public void testNorthAmericanAndEuropeanComponentsImplementedViaIntendedClasses(){
      for(Widget w : northAmericanAndEuropean.getComponents()){
         Assert.assertTrue(w instanceof CanadianWidget || w instanceof GermanWidget);
      }
   }

   @Test
   public void testNorthAmericanAndEuropeanMadeInCorrectPlaces(){
      Assert.assertTrue(northAmericanAndEuropean.isMadeInNorthAmerica());
      Assert.assertTrue(northAmericanAndEuropean.isMadeInEurope());
   }

   @Test
   public void testNorthAmericanAndEuropeanNotMadeInOtherPlaces(){
      Assert.assertFalse(northAmericanAndEuropean.isMadeInAsia());
   }

   @Test
   public void testAsianAndNorthAmericanExtendsAbstractHelperClass() {
      Assert.assertTrue(
            asianAndNorthAmerican instanceof AbstractCompositeWidget,
            "You're working too hard. If you extend the right class, a lot of work will be done for you."
      );
   }

   @Test
   public void testAsianAndNorthAmericanComponentsExtendAbstractHelperClass(){
      for(Widget w : asianAndNorthAmerican.getComponents()){
         Assert.assertTrue(
               w instanceof AbstractWidget,
               "You're working too hard. If you extend the right class, a lot of work will be done for you."
         );
      }
   }

   @Test
   public void testAsianAndNorthAmericanComponentsImplementedViaIntendedClasses(){
      for(Widget w : asianAndNorthAmerican.getComponents()){
         Assert.assertTrue(w instanceof CanadianWidget || w instanceof JapaneseWidget);
      }
   }

   @Test
   public void testAsianAndNorthAmericanMadeInCorrectPlaces(){
      Assert.assertTrue(asianAndNorthAmerican.isMadeInNorthAmerica());
      Assert.assertTrue(asianAndNorthAmerican.isMadeInAsia());
   }

   @Test
   public void testAsianAndNorthAmericanNotMadeInOtherPlaces(){
      Assert.assertFalse(asianAndNorthAmerican.isMadeInEurope());
   }
}
