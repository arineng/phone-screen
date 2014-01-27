package net.arin.phonescreen.exercises;

import net.arin.phonescreen.doNotModify.Pair;
import net.arin.phonescreen.doNotModify.SomeBean;

public class SomeBeanFactory {
   private static SomeBeanFactory factory = new SomeBeanFactory();

   private SomeBeanFactory(){};

   public static Pair<SomeBean, SomeBean> getBeansForEqualityShenanigans(){
      //TODO: Exercise 1:
      // Throw the following line away and replace it with some code that makes the
      // tests in SomeBeanEqualityShenanigansTest pass
      return new Pair<SomeBean, SomeBean>(null, null);
   }
}
