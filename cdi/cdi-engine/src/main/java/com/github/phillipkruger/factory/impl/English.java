package com.github.phillipkruger.factory.impl;

import com.github.phillipkruger.factory.api.Greeting;
import com.github.phillipkruger.factory.api.GreetingProvider;
import javax.enterprise.context.RequestScoped;
/**
 * English implementation (Default)
 * @author Phillip Kruger (phillip.kruger@phillip-kruger.com)
 */
@GreetingProvider("English")
@RequestScoped
public class English implements Greeting {

    @Override
    public String sayHello(String to) {
        return "Good day " + to + ".";
    }

    @Override
    public String getName() {
        return "English";
    }
}
