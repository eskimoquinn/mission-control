package org.ithaka.cheetah.controller;

import java.util.List;

import org.ithaka.cheetah.service.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/disciplines")
public class DisciplineController {
	
	@Autowired
	private DisciplineService disciplineService;
	
	@RequestMapping("disciplineslist.json")
	public @ResponseBody List<String> getDisciplinesList(){
		return disciplineService.getAllDisciplines();
	}
	
    @RequestMapping("/layout")
    public String getDisciplinePage(ModelMap modelMap) {
        return "disciplines/layout";
    }

}
