package net.board.db;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardDetailAction implements Action
{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("euc-kr");
		
		BoardDAO boarddao = new BoardDAO();
		BoardBean boarddata = new BoardBean();
		
		int num = Integer.parseInt(request.getParameter("num"));
		boarddao.setReadCountUpdate(num);
		boarddata = boarddao.getDetail(num);
		
		if (boarddata == null)
		{
			System.out.println("상세보기 실패");
			return null;
		}
		System.out.println("상세보기 성공");
		
		request.setAttribute("boarddata", boarddata);
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("./board/qna_board_view.jsp");
		return forward;		
	}

}
