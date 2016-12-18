package net.board.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO 
{
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public BoardDAO()
	{
		try
		{
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			con = ds.getConnection();
		} catch (Exception ex)
		{
			System.out.println("DB 연결 실패: " + ex);
			return;
		}
	}
	
	public int getListCount()
	{
		int x = 0;
		
		try
		{
			pstmt = con.prepareStatement("select count(*) from board");
			rs = pstmt.executeQuery();
			
			if(rs.next())
			{
				x=rs.getInt(1);
			}
		} catch(Exception ex)
		{
			System.out.println("getListCount 에러:" + ex);
		} finally
		{
			if(rs!=null) try{rs.close();} catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();} catch(SQLException ex){}
		}
		return x;
	}
	//+2
	
	public List getBoardList(int page, int limit)
	{
		return null;
	}
	
	public BoardBean getDetail(int num) throws Exception
	{
		return null;
	}
	
	public boolean boardInsert(BoardBean board)
	{
		return false;
	}
	
	public int boardReply(BoardBean board)
	{
		return 0;
	}
	
	public boolean boardModify(BoardBean modifyboard) throws Exception
	{
		return false;
	}
	
	public boolean boardDelete(int num)
	{
		return false;
	}
	
	public void setReadCountUpdate(int num) throws Exception
	{
		
	}
	
	public boolean isBoardWriter(int num, String pass)
	{
		return false;
	}
	
}
