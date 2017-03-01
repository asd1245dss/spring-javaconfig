package com.wpg.demo.spring.javaconfig.tomcat;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.junit.Test;
import org.springframework.http.MediaType;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author ChangWei Li
 * @version 2017-03-01 10:15
 */
public class EmbeddedTomcatTest {

    @Test
    public void initTomcat() throws LifecycleException, InterruptedException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(80);

        Context ctx = tomcat.addContext("", new File(".").getAbsolutePath());

        Tomcat.addServlet(ctx, "hello", new HttpServlet() {
            @Override
            protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                resp.setHeader("Content-Type", MediaType.APPLICATION_JSON_UTF8.toString());
                resp.getWriter().print("{msg:hello}");
            }
        });
        ctx.addServletMappingDecoded("/hello", "hello");

        tomcat.start();

        TimeUnit.SECONDS.sleep(10);

        //stop tomcat server robustly without any shutdown hook
        tomcat.stop();
    }

}
