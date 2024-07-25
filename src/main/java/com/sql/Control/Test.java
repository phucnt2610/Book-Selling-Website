package com.sql.Control;
//Hai
import java.util.List;

import com.sql.Dao.DAO;
import com.sql.Model.Blog;
import com.sql.Model.Coment;
import com.sql.Model.Order;

public class Test {
	private static java.sql.Date getCurrentDate() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Date(today.getTime());
	}

	public static void main(String[] args) {
		try {
			DAO dao = new DAO();
			int count  = dao.getTotalBlog();
			System.out.println(count);
			List<Blog> list = dao.PagingBlog(5);
			for(Blog c : list)
			{
				System.out.println(c.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	}
