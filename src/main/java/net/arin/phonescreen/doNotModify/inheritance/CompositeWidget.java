package net.arin.phonescreen.doNotModify.inheritance;

import java.util.List;

public interface CompositeWidget extends Widget {
   public List<Widget> getComponents();
}
