package com.github.base.io.webServer.webroot.servlet;

import io.webServer.connector.ConnectorUtil;
import io.webServer.connector.HttpStatus;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        PrintWriter out = servletResponse.getWriter();
        out.println(ConnectorUtil.renderStatus(HttpStatus.SC_OK));
        out.println("What time is now ?");
        out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}