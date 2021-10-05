package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.UsuariosDAO;
import modelo.UsuariosDTO;

/**
 * Servlet implementation class Servletgestionusuarios
 */
@WebServlet("/Servletgestionusuarios")
public class Servletgestionusuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletgestionusuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean x;
		long cedulausuario;
		String emailusuario, nombreusuario,password,usuario;
		UsuariosDTO usudto;
		UsuariosDAO usudao;
		
		if(request.getParameter("btnins")!=null) {			
			cedulausuario=Long.parseLong(request.getParameter("cedu"));			
			emailusuario=request.getParameter("corre");
			nombreusuario=request.getParameter("NomUsu");
			password=request.getParameter("Pass");
			usuario=request.getParameter("Usu");
			usudto=new UsuariosDTO(cedulausuario, emailusuario, nombreusuario, password, usuario);
			usudao=new UsuariosDAO();
			x=usudao.insertarusuario(usudto);
			if(x) {
				JOptionPane.showMessageDialog(null, "El usuario se ingreso Correctamente");
				response.sendRedirect("Usuario.jsp");
			}
			else {
				JOptionPane.showMessageDialog(null, "El usuario se ingreso Incorrectamente");
				response.sendRedirect("Ingresar.jsp");
			}
			JOptionPane.showMessageDialog(null, "El usuario se ingreso ");
		}
		
	}

}
