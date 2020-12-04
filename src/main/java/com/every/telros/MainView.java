package com.every.telros;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "")
public class MainView extends VerticalLayout {

    public MainView() {
        H2 subTitle = new H2("Welcome, User");
        createHeader();
        add(subTitle);
        setAlignItems(Alignment.CENTER);
    }

    private void createHeader() {
        H1 logo = new H1("TELROS");
        logo.getStyle().set("color", "darkblue");
        logo.addClassName("logo");

        Anchor logout = new Anchor("logout", "Log out");

        HorizontalLayout header = new HorizontalLayout(logo, logout);
        header.expand(logo);
        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.setWidth("100%");
        header.addClassName("header");

        add(header);
    }
}
