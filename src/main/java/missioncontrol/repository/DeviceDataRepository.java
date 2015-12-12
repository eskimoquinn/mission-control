package missioncontrol.repository;

import missioncontrol.model.DeviceData;
import missioncontrol.model.Messages;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by tgreen
 */
public interface DeviceDataRepository extends PagingAndSortingRepository<DeviceData, Long> {

}