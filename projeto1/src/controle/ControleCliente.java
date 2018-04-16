package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
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
		
		String msg = null;
		
		try {//objeto criado e os dados da tela, s�o inseridos no objeto
			Cliente cli = new Cliente(null,
					request.getParameter("nome"),
					request.getParameter("email"),
					request.getParameter("sexo"),
					request.getParameter("estcivil"));
			
			ClienteDao cd = new ClienteDao();
			cd.inserir(cli);
			
			msg = "Cliente Cadastrado com Sucesso!";
			
		} catch (Exception e) {
			msg = "Erro : "+e.getMessage();
			e.printStackTrace();
		}
		
		//criar um atributo mensagem
		request.setAttribute("mensagem", msg);
		
		//redirecionar a navega��o para index.jsp enviando o objeto
		request.getRequestDispatcher("index.jsp").forward(request, response);

	}

	
}
