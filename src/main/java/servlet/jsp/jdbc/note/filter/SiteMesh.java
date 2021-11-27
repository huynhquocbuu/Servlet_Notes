package servlet.jsp.jdbc.note.filter;

import javax.servlet.annotation.WebFilter;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;

import servlet.jsp.jdbc.note.util.UrlConstants;

@WebFilter(filterName = "sitemesh", urlPatterns = UrlConstants.ALL)
public class SiteMesh extends SiteMeshFilter{

}
