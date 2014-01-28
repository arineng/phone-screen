package net.arin.phonescreen.doNotModify.equality;

import net.arin.phonescreen.exercises.equality.SomeBeanFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Testing knowledge of equality in Java
 */
public class SomeBeanEqualityTest {
   private SomeBean firstBean;
   private SomeBean secondBean;

   @BeforeTest
   public void setup(){
      Pair<SomeBean, SomeBean> beans = SomeBeanFactory.getBeansForEqualityShenanigans();
      firstBean = beans.getA();
      secondBean = beans.getB();
   }

   @Test
   public void testNotIdentical(){
      Assert.assertFalse(firstBean == secondBean);
   }

   @Test
   public void testEquals(){
      Assert.assertTrue(firstBean.equals(secondBean));
   }

   @Test
   public void testAPropertiesAreNotIdentical(){
      Assert.assertFalse(firstBean.getPropertyA() == secondBean.getPropertyA());
   }

   @Test
   public void testBPropertiesAreIdentical(){
      Assert.assertTrue(firstBean.getPropertyB() == secondBean.getPropertyB());
   }
}
