package net.arin.phonescreen.doNotModify.inheritence;

import java.util.Arrays;

public abstract class AbstractWidget implements Widget{
   @Override
   public final boolean isMadeInNorthAmerica(){
      return Arrays.asList(CountryOfOrigin.CANADA, CountryOfOrigin.MEXICO, CountryOfOrigin.USA).contains(getCountryOfOrigin());
   }

   @Override
   public final boolean isMadeInEurope() {
      return Arrays.asList(CountryOfOrigin.GERMANY, CountryOfOrigin.FRANCE).contains(getCountryOfOrigin());
   }

   @Override
   public final boolean isMadeInAsia() {
      return Arrays.asList(CountryOfOrigin.CHINA, CountryOfOrigin.JAPAN).contains(getCountryOfOrigin());
   }
}
