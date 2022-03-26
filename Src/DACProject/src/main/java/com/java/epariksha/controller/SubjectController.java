package com.java.epariksha.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.SubjectDAO;
import com.java.epariksha.entity.Subject;


@Controller
@RequestMapping("/admin")
public class SubjectController {

	@Autowired
	SubjectDAO dao;

	ModelAndView mv = new ModelAndView(); 


	@GetMapping("/subject")
	public ModelAndView admin_subject() 
	{
		List<Subject> list = dao.getAll();
		mv.addObject("subjects", list); //request.setAttribute
		mv.setViewName("admin/subject");
		return mv;
	}

	
	@GetMapping("/subject_add")
	public ModelAndView admin_subject_add() 
	{
		mv.setViewName("admin/subject_add");
		return mv;
	}


	@PostMapping("/subject_add") 
	public ModelAndView subject_add(@RequestParam("subject_name") String subjectName, @RequestParam("subject_description") String subjectDescription) 
	{
		System.out.println(subjectName +" "+ subjectDescription);
		//System.out.println(subject.toString());
		Subject subject = new Subject(  );
		subject.setSubjectName(subjectName.trim());
		subject.setSubjectDescription(subjectDescription.trim());
		
		mv.addObject("subjects", dao.save(subject)); //request.setAttribute
		mv.setViewName("redirect:/admin/subject");
		return mv;
	}


	
	@GetMapping("/subject_update/{id}")
	public ModelAndView update_subject(@PathVariable int id) 
	{
		Subject subject = dao.update(id);
		mv.addObject("subject", subject); //request.setAttribute
		mv.setViewName("admin/subject_update");
		return mv;
	}
	
	@PostMapping("/subject_update/{id}")
	public ModelAndView update_subject(@PathVariable int id, @RequestParam("subject_name") String subjectName, @RequestParam("subject_description") String subjectDescription) 
	{
		Subject subject = new Subject(  );
		subject.setSubjectId(id);
		subject.setSubjectName(subjectName.trim());
		subject.setSubjectDescription(subjectDescription.trim());
		dao.update(subject);
		mv.addObject("subject", subject); //request.setAttribute
		mv.setViewName("redirect:/admin/subject");
		return mv;
	}
	
	
	
	@GetMapping("/delete/{id}")
	public ModelAndView deleteSubject(@PathVariable int id) 
	{
		System.out.println(id);
		dao.delete(id);
	
		mv.setViewName("redirect:/admin/subject");
		return mv;
	}
	
	
//	@GetMapping("/details/{id}")
//	public ModelAndView showSubjectById(@PathVariable int id)
//	{
//		ModelAndView mv = new ModelAndView();
//		System.out.println("id" + id);
//		Optional<Subject> list = dao.get(id);
//		System.out.println(list);		
//		if(list != null)
//		{
//			mv.addObject("show_details", list);  //request.setAttribute
//			mv.setViewName("show_details");  //requestdispatcher forward
//			return mv;
//		}
//		else
//		{
//			mv.setViewName("admin/subject");
//			return mv;
//		}
//	}

}
