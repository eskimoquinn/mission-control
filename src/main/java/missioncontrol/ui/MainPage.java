package missioncontrol.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created by tgreen on 12/12/15
 */
@SpringUI
@Theme("valo")
@Title("HoMES")
public class MainPage extends UI {

    DeviceGrid grid;
    MenuBar menuBar;

    @Autowired
    public MainPage(DeviceGrid grid){
        this.grid = grid;
    }

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout content = new VerticalLayout();
        setDescription("HoMES - Home Monitoring");
        grid.listDevices();
        content.addComponent(createMenuBar());
        content.addComponent(grid.getGrid());
        setContent(content);
        getPage().setTitle("HoMES");

    }

    private MenuBar createMenuBar() {
        menuBar = new MenuBar();
        menuBar.addItem("HoMES", null);
        return menuBar;
    }
}

