//package com.bionicuniversity.stairway.sounds;
//
//import com.bionicuniversity.stairway.sounds.entity.User;
//import com.bionicuniversity.stairway.sounds.facade.user.UserFacadeLocal;
//
//import javax.ejb.EJB;
//import javax.ejb.EJBs;
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
//* Created by happy on 11/11/2014.
//*/
//
//@EJBs({@EJB(name = "UserFacadeLoc", beanInterface = UserFacadeLocal.class)})
//@WebServlet(urlPatterns = "/test/ejb")
//public class SimpleServlet extends HttpServlet{
//
//    private UserFacadeLocal userFacadeLocal;
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        userFacadeLocal = lookupUserFacadeLocale();
//        User user = userFacadeLocal.findById(1);
//
//        System.out.println(user);
//
//        resp.setContentType("text/html");
//        resp.getWriter().append(generateResponseHTML());
//    }
//
//    private String generateResponseHTML() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("<html><body>");
//        sb.append("<h1>Success</h1>");
//        sb.append("</body></html>");
//        return sb.toString();
//    }
//
//    private UserFacadeLocal lookupUserFacadeLocale() {
//        try {
//            Context context = new InitialContext();
//            return (UserFacadeLocal)context.lookup("java:comp/env/UserFacadeLoc");
//        } catch (NamingException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
