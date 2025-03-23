package com.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.entities.Todo;

import java.util.*;

public class listner implements ServletContextListener {
	
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context created...");
		List<Todo> list = new ArrayList<Todo>();
		ServletContext servletContext = sce.getServletContext();
		servletContext.setAttribute("list", list);
	}
}
