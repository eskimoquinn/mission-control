package missioncontrol.repository;

import missioncontrol.model.Device;
import missioncontrol.model.Messages;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by tgreen
 */

public interface MesssagesRepository extends PagingAndSortingRepository<Messages, Long> {

}

