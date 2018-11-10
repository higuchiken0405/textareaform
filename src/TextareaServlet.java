

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/textarea")
public class TextareaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TextareaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    //文字コードをUTF-8に指定
	    request.setCharacterEncoding("UTF-8");
	    //パラメータからbodyを取得
	    String body = request.getParameter("body");
	    //改行で文字列を分けて、配列に格納
	    String[] strs = body.split("\n");
	    //リクエストオブジェクトに配列を格納
	    request.setAttribute("strs", strs);
	    //result.jspに遷移
	    RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
	    rd.forward(request, response);


	}

}
