package test.event;

import de.thm.iem.ylmp88.chatlib.eventsystem.Subscribe;
import de.thm.iem.ylmp88.chatlib.eventsystem.Subscriber;

/**
 * Created by yannick on 02.06.2015.
 */
public class TestListener implements Subscriber {


    @Subscribe
    public void test(NonSenseEvent event){

        event.doSomething();
    }



}
