package mc.sn.cocoa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

public interface ProjectController {
	public ModelAndView view_join(HttpServletRequest request, HttpServletResponse response);
	public ResponseEntity addNewProject(MultipartHttpServletRequest multipartRequest, HttpServletResponse response)
			throws Exception;
}
