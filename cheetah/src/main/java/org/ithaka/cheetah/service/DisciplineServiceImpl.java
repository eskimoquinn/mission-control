package org.ithaka.cheetah.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("disciplineService")
public class DisciplineServiceImpl implements DisciplineService {
	private static List<String> disciplineList = new ArrayList<String>();
	
	@Override
	public List<String> getAllDisciplines() {
		disciplineList.add("Tom");
		return disciplineList;
	}

}
