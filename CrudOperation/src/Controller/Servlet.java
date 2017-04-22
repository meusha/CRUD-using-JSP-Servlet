package Controller;

import Database.StudentDao;
import Module.Student;
import org.omg.CORBA.Request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

/**
 * Created by user on 4/10/2017.
 */
//@javax.servlet.annotation.WebServlet(name = "Servlet")
public class Servlet extends javax.servlet.http.HttpServlet {
//    private static final long serialVersionUID= 1L;
    private static String INSERT_OR_EDIT = "/student.jsp";
    private static String LIST_STUDENT = "/index.jsp";
    private static String ADD_STUDENT = "/addStudent.jsp";
    private StudentDao dao;

    public Servlet(){
        super();
        dao = new StudentDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        Student st = new Student();
        st.setName(request.getParameter("name"));
        st.setAddress(request.getParameter("address"));
        st.setEmail(request.getParameter("email"));
        st.setStudentId(Integer.parseInt(request.getParameter("studentId")));
        if ("Submit".equals(request.getParameter("button"))){
            dao.addStudent(st);
        pw.print("Record added successfully.");

    } else if ("Update".equals(request.getParameter("button"))){
            int id =Integer.parseInt(request.getParameter("studentId"));
            st.setStudentId(id);
            System.out.println(id);
            st.setName(request.getParameter("name"));
            st.setAddress(request.getParameter("address"));
            st.setEmail(request.getParameter("email"));
            System.out.println("Sorry! Unable to add");
            try {
                dao.updateStd(st);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_STUDENT);
        request.setAttribute("students", dao.getAllStudent());
        view.forward(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        String forward="";
        if (request.getParameter("action")!=null){
            String action = request.getParameter("action");

            if (action.equalsIgnoreCase("delete")){
                int studentId = Integer.parseInt(request.getParameter("studentId"));
                dao.deleteStd(studentId);
                forward = LIST_STUDENT;
                request.setAttribute("students", dao.getAllStudent());

            }else if (action.equalsIgnoreCase("edit")){
                forward = INSERT_OR_EDIT;
                int studentId = Integer.parseInt(request.getParameter("studentId"));

//                Student student = dao.getStudentById(studentId);
                request.setAttribute("id", studentId);


            }else if (action.equalsIgnoreCase("index")){
                forward = LIST_STUDENT;
                request.setAttribute("students", dao.getAllStudent());
            }else {
                forward = ADD_STUDENT;
            }
        } else {
            forward =LIST_STUDENT;
            request.setAttribute("students", dao.getAllStudent());
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
}
