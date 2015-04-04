package missioncontrol.repository;

import missioncontrol.model.Device;
import missioncontrol.model.Messages;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by tgreen on 4/4/15.
 */

public interface MesssagesRepository extends PagingAndSortingRepository<Messages, Long> {

}

