package missioncontrol.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Grid;
import missioncontrol.model.Device;
import missioncontrol.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created by tgreen on 12/12/15
 */
@SpringUI
public class DeviceGrid{

    DeviceRepository deviceRepository;
    Grid grid;

    @Autowired
    public DeviceGrid(DeviceRepository deviceRepository){
        this.deviceRepository = deviceRepository;
        grid = new Grid();
    }

    public void listDevices() {
        grid.setContainerDataSource( new BeanItemContainer(Device.class, (Collection) deviceRepository.findAll()));
    }


    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

}
