package net.arin.phonescreen.exercises.equality;

import net.arin.phonescreen.doNotModify.equality.Pair;
import net.arin.phonescreen.doNotModify.equality.SomeBean;

public class SomeBeanFactory {
   private SomeBeanFactory(){}

   public static Pair<SomeBean, SomeBean> getBeansForEqualityShenanigans(){
      //TODO: Exercise 1:
      // Throw the following line away and replace it with some code that makes the
      // tests in SomeBeanEqualityShenanigansTest pass
      return new Pair<SomeBean, SomeBean>(null, null);
   }
}
