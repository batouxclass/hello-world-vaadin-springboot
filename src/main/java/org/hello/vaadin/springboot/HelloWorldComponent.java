package org.hello.vaadin.springboot;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class HelloWorldComponent extends Div
{
    public HelloWorldComponent()
    {
        setText("Hello world! I'm using Vaadin and Spring boot");
    }
}
