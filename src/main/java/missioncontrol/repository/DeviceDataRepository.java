package missioncontrol.repository;

import missioncontrol.model.DeviceData;
import missioncontrol.model.Messages;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by tgreen on 4/4/15.
 */
public interface DeviceDataRepository extends PagingAndSortingRepository<DeviceData, Long> {

}