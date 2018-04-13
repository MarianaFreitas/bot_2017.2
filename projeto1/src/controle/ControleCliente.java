package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Cliente;
import persistencia.ClienteDao;


@WebServlet("/ControleCliente")
public class ControleCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Cliente cli;
       
    
    public ControleCliente() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {//objeto criado e os dados da tela, são inseridos no objeto
			Cliente cli = new Cliente(null,
					request.getParameter("nome"),
					request.getParameter("email"),
					request.getParameter("sexo"),
					request.getParameter("estcivil"));
			
			ClienteDao cd = new ClienteDao();
			cd.inserir(cli);
			
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
