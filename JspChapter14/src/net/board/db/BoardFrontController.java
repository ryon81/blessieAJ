package net.board.db;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

public class BoardFrontController extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet 
{ 
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String RequestURL=request.getRequestURI();
		String contextPath=request.getContextPath();
		String command = RequestURL.substring(contextPath.length());
		ActionForward forward = null;
		Action action = null;
		
		if(command.equals("/BoardWrite.bo"))
		{
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./board/qna_board_write.jsp");
		} else if (command.equals("/BoardReplyAction.bo"))
		{
			action = new BoardReplyAction();
			try
			{
				forward = action.execute(request, response);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		} else if(command.equals("/BoardDelete.bo"))
		{
			forward = new ActionFoward();
			forward.setRedirect(false);
			forward.setPath("./board/qna_board_delete.jsp");			
		} else if(command.equals("/BoardModify.bo"))
		{
			action = new BoardModifyView();
			try
			{
				forward = action.execute(request, response);
			} catch (Exception e)
			{
				e.printStackTrace();
			}			
		} else if(command.equals("/BoardAddAction.bo"))
		{
			action = new BoardAddAction();
			try
			{
				forward = action.execute(request, response);
			} catch (Exception e)
			{
				e.printStackTrace();
			}			
		} else if(command.equals("/BoardReplyView.bo"))
		{
			action = new BoardReplyView();
			try
			{
				forward = action.execute(request, response);
			} catch (Exception e)
			{
				e.printStackTrace();
			}			
		} else if(command.equals("/BoardModifyAction.bo"))
		{
			action = new BoardModifyAction();
			try
			{
				forward = action.execute(request, response);
			} catch (Exception e)
			{
				e.printStackTrace();
			}			
		} else if(command.equals("/BoardDeleteAction.bo"))
		{
			action = new BoardDeleteAction();
			try
			{
				forward = action.execute(request, response);
			} catch (Exception e)
			{
				e.printStackTrace();
			}			
		} else if(command.equals("/BoardList.bo"))
		{
			action = new BoardListAction();
			try
			{
				forward = action.execute(request, response);
			} catch (Exception e)
			{
				e.printStackTrace();
			}			
		} else if(command.equals("/BoardDetailList.bo"))
		{
			action = new BoardDetailAction();
			try
			{
				forward = action.execute(request, response);
			} catch (Exception e)
			{
				e.printStackTrace();
			}			
		}
		
		if(forward != null)
		{	
			if(forward.isRedirect())
			{
				response.sendRedirect(forward.getPath());
			} else 
			{
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}			
		}
			
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doProcess(request, response);
	}
}
