package missioncontrol.repository;

import missioncontrol.model.Device;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by tgreen on 4/4/15.
 */
public interface DeviceRepository extends PagingAndSortingRepository<Device, Long>{
    List<Device> findByDeviceName(@Param("deviceName") String deviceName);
}
