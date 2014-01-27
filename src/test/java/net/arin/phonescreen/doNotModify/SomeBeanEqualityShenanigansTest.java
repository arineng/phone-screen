package net.arin.phonescreen.doNotModify;

import net.arin.phonescreen.exercises.SomeBeanFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SomeBeanEqualityShenanigansTest {
   private SomeBean a;
   private SomeBean b;

   @BeforeTest
   public void setup(){
      Pair<SomeBean, SomeBean> beans = SomeBeanFactory.getBeansForEqualityShenanigans();
      a = beans.getA();
      b = beans.getB();
   }

   @Test
   public void equalityShenanigansA(){
      //The things we're really testing for:
      Assert.assertFalse(a == b);
      Assert.assertTrue(a.equals(b));

      //To prevent cheating^H^H^H^H^H^H^H^H too much cleverness :-)
      Assert.assertNotNull(a.getPropertyA());
      Assert.assertNotNull(b.getPropertyA());
      Assert.assertNotNull(a.getPropertyB());
      Assert.assertNotNull(b.getPropertyB());
   }

   @Test
   public void equalityShenanigansB(){
      Assert.assertFalse(a.getPropertyA() == b.getPropertyA());
      Assert.assertTrue(a.getPropertyB() == b.getPropertyB());
   }
}
