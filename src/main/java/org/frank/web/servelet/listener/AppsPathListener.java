package org.frank.web.servelet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppsPathListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent event) {
		
		event.getServletContext().setAttribute("appsPath", event.getServletContext().getContextPath());

	}

	public void contextInitialized(ServletContextEvent event) {
		
		event.getServletContext().removeAttribute("appsPath");

	}

}
