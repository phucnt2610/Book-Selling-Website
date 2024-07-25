package com.sql.Dao;

import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sql.Connection.SqlServerConnection;
import com.sql.Model.Author;
import com.sql.Model.Blog;
import com.sql.Model.Book;
import com.sql.Model.Cart;
import com.sql.Model.Category;
import com.sql.Model.Coment;
import com.sql.Model.Order;
import com.sql.Model.User;

public class DAO {
	Connection conn = null; // Kết nới Sql
	PreparedStatement ps = null; // Query qua SQL
	ResultSet rs = null; // Kết quả trả về
	// Show all Product
	// Hai

	public List<Book> getAllBook() {
		List<Book> list = new ArrayList<>();

		String query = "SELECT * FROM Book";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	// Show Categoory
	public List<Category> getAllCategory() {
		List<Category> list = new ArrayList<>();

		String query = "SELECT * FROM Category";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Category(rs.getInt(1), rs.getString(2)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
		// Show Authorz
		public List<Author> getAllAuthor() {
			List<Author> list = new ArrayList<>();

			String query = "SELECT * FROM Author";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					list.add(new Author(rs.getInt(1),rs.getString(2)));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

			return list;
		}
	// Hai
	// Get Book By CID
	public List<Book> getBookByCID(String cid) {
		List<Book> list = new ArrayList<>();

		String query = "SELECT * FROM Book WHERE BCate = ?";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, cid);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	// Get Book By AID
	public List<Book> getBookByAID(String cid) {
		List<Book> list = new ArrayList<>();

		String query = "SELECT * FROM Book WHERE AuID = ?";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, cid);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}
	// Hai
	// Get book 10000-50000
	public List<Book> getBookPrice1to5() {
		List<Book> list = new ArrayList<>();

		String query = "SELECT * FROM Book WHERE BPrice > 10000 and BPrice <50000 ";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	// Getbook 50000-70000
	public List<Book> getBookPrice5to7() {
		List<Book> list = new ArrayList<>();

		String query = "SELECT * FROM Book WHERE BPrice > 50000 and BPrice <70000";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	// Getbook70000-100000
	public List<Book> getBookPrice7to10() {
		List<Book> list = new ArrayList<>();

		String query = "SELECT * FROM Book WHERE BPrice > 70000 and BPrice <100000 ";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	// Getbook 100000-200000
	public List<Book> getBookPrice10to20() {
		List<Book> list = new ArrayList<>();

		String query = "SELECT * FROM Book WHERE BPrice > 100000 and BPrice <200000 ";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	// Getbook 200000-300000
	public List<Book> getBookPrice20to30() {
		List<Book> list = new ArrayList<>();

		String query = "SELECT * FROM Book WHERE BPrice > 200000 and BPrice <300000 ";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	// Getbook 3000000+
	public List<Book> getBookPrice30to40() {
		List<Book> list = new ArrayList<>();

		String query = "SELECT * FROM Book WHERE BPrice >300000 ";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	// GET Book By Id
	public Book getBookByBId(String bid) {
		String query = "SELECT * FROM Book WHERE BId = ?";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, bid);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	// Hai
	// Get Related Book By CID
	public List<Book> getRelatedBookByCID(String cid) {
		List<Book> list = new ArrayList<>();

		String query = "SELECT TOP 4 * FROM Book WHERE BCate = ?";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, cid);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	// Search Book
	public List<Book> searchBookByName(String txtSearch) {
		List<Book> list = new ArrayList<>();

		String query = "SELECT * FROM Book WHERE BName LIKE ?";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, "%" + txtSearch + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	// Login
	public User login(String user, String pass) {
		String query = "SELECT * FROM [User] WHERE UTK = ? AND UPass =?";

		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, user);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	// Hai
	// Check exits
	public User checkUserExits(String user) {
		String query = "SELECT * FROM [User] WHERE UTK = ? ";

		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, user);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	// Hai
	// Sign Up
	public void SignUp(String name, String phone, String email, String user, String pass, String username) {
		String query = "INSERT INTO [User] VALUES(?,?,0,?,?,?,'0','1','0')";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, phone);
			ps.setString(3, email);
			ps.setString(4, pass);
			ps.setString(5, username);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// Hai
	// Get Best Seller
	public List<Book> BestSeller() {
		List<Book> list = new ArrayList<>();

		String query = "SELECT TOP 4 * FROM Book WHERE BestSeller = 1";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	// Get New Arrivals
	public List<Book> getNewArrivals() {
		List<Book> list = new ArrayList<>();

		String query = "SELECT TOP 4 * FROM Book WHERE NewViral = 1";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	// Get Hot Sales
	public List<Book> getHotSales() {
		List<Book> list = new ArrayList<>();

		String query = "SELECT TOP 4 * FROM Book WHERE HotSale = 1";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	// Get Popular
	public List<Book> getPopular() {
		List<Book> list = new ArrayList<>();

		String query = "SELECT TOP 4 * FROM Book WHERE Popular = 1";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return list;
	}

	// Hai
	public void DeleteBook(String bid) {
		String query = "DELETE FROM Book WHERE BId =?";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, bid);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// Insert Book Hai
	public void InsertBook(String name, String image, String price, String PriceSale, int category , int author) {
		String query = "INSERT [dbo].[Book] ([BName], [BPrice], [BPriceSale],"
				+ " [AuID], [BCate], [BImage], [BestSeller], [NewViral], [HotSale], "
				+ "[Popular]) VALUES (?, ?, ?, ?, ?, ?, 0, 0, 0, 0);";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(6, image);
			ps.setString(2, price);
			ps.setInt(4, author);
			ps.setString(3, PriceSale);
			ps.setInt(5, category);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	// Edit Book Hai
	public void EditBook(String name, String image, String price, String PriceSale, int category , int author , String bid) {
		String query = "UPDATE Book \r\n"
				+ "SET BName = ?,\r\n"
				+ "BImage=?,\r\n"
				+ "BPrice=?,\r\n"
				+ "BPriceSale=?,\r\n"
				+ "BCate=?,\r\n"
				+ "AuID=? \r\n"
				+ "WHERE BId=?";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, image);
			ps.setString(3, price);
			ps.setInt(6, author);
			ps.setString(4, PriceSale);
			ps.setInt(5, category);
			ps.setString(7, bid);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// Lay Tong so cuon sach Hai
	public int getTotalBook() {
		String query = "SELECT COUNT(*) from Book";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}

	// Hai
	public List<Book> PagingBook(int index) {
		List<Book> list = new ArrayList<Book>();
		String query = "SELECT * FROM Book ORDER BY BId OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setInt(1, (index - 1) * 6);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	// Hai
		public List<Book> PagingManagerBook(int index) {
			List<Book> list = new ArrayList<Book>();
			String query = "SELECT * FROM Book ORDER BY BId OFFSET ? ROWS FETCH NEXT 12 ROWS ONLY";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				ps.setInt(1, (index - 1) * 12);
				rs = ps.executeQuery();
				while (rs.next()) {
					list.add(new Book(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(7)));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return list;
		}
		// Lay Tong so cuon sach Hai
		public int getTotalUser() {
			String query = "SELECT COUNT(*) from [User]";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					return rs.getInt(1);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return 0;
		}
		// Hai
		public void DeleteUser(String uid) {
			String query = "DELETE FROM [User] WHERE UName= ?";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				ps.setString(1, uid);
				ps.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		// Hai
		// GET Book By Id
		public User getUserByBId(String uid) {
			String query = "SELECT * FROM [User] WHERE UID = ?";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				ps.setString(1, uid);
				rs = ps.executeQuery();
				while (rs.next()) {
					return new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), 
							rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

			return null;
		}
		// Edit Book Hai
		public void EditUser(String name, String image, String email, String phone,String imageU, String pass , String username , int uid) {
				String query = "UPDATE [User] SET UName=?, UPhone=?,UImage=?,Email=?,UPass=?,UTK=?,isBloger=0,isUser=1,isAdmin=0 WHERE UID =?";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				ps.setString(1, name);
				ps.setString(2, phone);
				ps.setString(3, imageU);
				ps.setString(6, username);
				ps.setString(4, email);
				ps.setString(5, pass);
				ps.setInt(7, uid);
				ps.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		// Hai
				public List<User> PagingManagerUser(int index) {
					List<User> list = new ArrayList<User>();
					String query = "SELECT * FROM [User] ORDER BY UID OFFSET ? ROWS FETCH NEXT 10 ROWS ONLY";
					try {
						conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
						ps = conn.prepareStatement(query);
						ps.setInt(1, (index - 1) * 10);
						rs = ps.executeQuery();
						while (rs.next()) {
							list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), 
									rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)));
						}
					} catch (Exception e) {
						// TODO: handle exception
					}
					return list;
				}
	// Hai
	public void InsertFeedback(String name, String email, String price, String content) {
		String query = "INSERT INTO Feedback VALUES (?,?,?)";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, name);
			ps.setString(3, content);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// Hai
	// GET Book By Id
	public Blog getBlogByBId(String Blogid) {
		String query = "SELECT * FROM Blog WHERE BlogID = ?";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setString(1, Blogid);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Blog(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), 
						rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}
	// Lay Tong Blog Hai
	public int getTotalBlog() {
		String query = "SELECT COUNT(*) from Blog";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	// Hai
	public List<Blog> PagingBlog(int index) {
		List<Blog> list = new ArrayList<Blog>();
		String query = "SELECT * FROM Blog ORDER BY BlogID OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY";
		try {
			conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
			ps = conn.prepareStatement(query);
			ps.setInt(1, (index - 1) * 6);
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Blog(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), 
						rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));	
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	// Hai
		public List<Book> Selectop10() {
			List<Book> list = new ArrayList<Book>();
			String query = "SELECT top 10 * FROM OrderItem \r\n"
					+ "LEFT JOIN  Book ON OrderItem.Book_ID = Book.BId\r\n"
					+ "ORDER BY Quantity DESC ";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					list.add(new Book(rs.getInt(1), rs.getString(5), rs.getInt(2), rs.getInt(7), rs.getString(10)));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return list;
		}
		//Insert Order
		public List<Order> InsertOrder(String name,String country, String address,String zip,
									   String phone,String email,int total, String note) {
			List<Order> list = new ArrayList<Order>();
			String query = "INSERT INTO  [Order] VALUES(\r\n"
					+ "16,?,?,?,?,?,?,?,?)"; // User voi ID bang 16 la khach hang ko can dang nhap
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				ps.setString(1, name);
				ps.setString(2, country);
				ps.setString(3, address);
				ps.setString(4, zip);
				ps.setString(5, phone);
				ps.setString(6, email);
				ps.setInt(7, total);
				ps.setString(8, note);
				ps.executeUpdate();
			
			} catch (Exception e) {
				// TODO: handle exception
			}
			return list;
		}
		//Hai
		public void UpdateUser(User user , String username, String pass, String image, String email)
		{
			String query ="UPDATE [User] SET UName=? , UPhone=? , UImage=? , Email=? ,UPass = ?,  UTK = ?, isBloger= 0,isUser=1 ,isAdmin=0 WHERE UID = ?";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				ps.setString(1, user.getuName());
				ps.setString(2, user.getuPhone());
				ps.setString(3,image);
				ps.setString(4, email);
				ps.setString(5, pass);
				ps.setString(6,username);
				ps.setInt(7, user.getuID());
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		//Hai
		public void InsertCmt(int BlogId, String content, String name, String email ,String phone ,Date date) {
			String query = "INSERT INTO Review VALUES(?,?,?,?,?,?)";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				ps.setInt(1, BlogId);
				ps.setString(2, content);
				ps.setString(3, name);
				ps.setString(4, email);
				ps.setString(5, phone);
				ps.setDate(6, date);
				ps.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		public List<Coment> GetCmtbyID(int BlogId) {
			List<Coment> list = new ArrayList<>();

			String query = " SELECT * FROM Review WHERE BlogID = ?";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				ps.setInt(1, BlogId);
				rs = ps.executeQuery();
				while (rs.next()) {
					list.add(new Coment(rs.getInt(1),rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getDate(7)));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return list;
		}
		public int getTotalCmt(int blogid) {
			String query = "SELECT COUNT(*) from Review WHERE BlogID = ?";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				ps.setInt(1, blogid);
				rs = ps.executeQuery();
				while (rs.next()) {
					return rs.getInt(1);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return 0;
		}
		public String getPass(String email)
		{
			String query = "SELECT UPass FROM [User] WHERE Email=?";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				ps.setString(1, email);
				rs = ps.executeQuery();
				while (rs.next()) {
					return rs.getString(1);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
		}
		//Hai
		public List<Order> top5KhachHang( ) {
			List<Order> list = new ArrayList<>();

			String query = " SELECT top 5 * FROM [Order] ORDER BY Total DESC";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()) {
					list.add(new Order(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getString(10)));
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			return list;
		}
		// Hai
		public void InsertOrderItem(int Bookid, int Quantity, int OrderId) {
			String query = "INSERT INTO OrderItem VALUES (? , ?, ?)";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				ps.setInt(1, Bookid);
				ps.setInt(2, Quantity);
				ps.setInt(3, OrderId);
				ps.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}	// Hai
		public void InsertCart(int Uid, Date Creatday ) {
			String query = "INSERT INTO CartList VALUES(?,?)";
			try {
				conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
				ps = conn.prepareStatement(query);
				ps.setInt(1, Uid);
				ps.setDate(2, Creatday);
				ps.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		// Hai
				public void InsertCartItem(int BookID, int  BPrice, int Cid, int Quantity ) {
					String query = "INSERT INTO CartItem VALUES(?,?,?,?)";
					try {
						conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
						ps = conn.prepareStatement(query);
						ps.setInt(1, BookID);
						ps.setInt(2, BPrice);
						ps.setInt(3, Cid);
						ps.setInt(4, Quantity);
						ps.executeUpdate();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				//Hai
			public List<Blog> getAllBlog() {
					List<Blog> list = new ArrayList<>();

					String query = "SELECT * FROM Blog";
					try {
						conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
						ps = conn.prepareStatement(query);
						rs = ps.executeQuery();
						while (rs.next()) {
							list.add(new Blog(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), 
									rs.getString(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
						}
					} catch (Exception e) {
						// TODO: handle exception
					}

					return list;
				}		
			// Insert Book Hai
			public void InsertBlog(String Title , int BId, String BlogImage, String BlogCon1, String BlogCon2
					, String BlogCon3, String Quotes, String Author, String ImageDetail, String AuthorQuotes , Date date , String name) {
				String query = "INSERT [dbo].[Blog] ( [BId], [BlogImage], [BlogCon1], [BlogCon2], [BlogCon3], [DayCreate], [Quotes], [Title], [Name], [Author] [ImageDetail], [AuthorQuotes]) "
						+ "VALUES ( ?, ?, ?, ?, ?, ? , ?, ?, ?, ?, ?, ?)";
				try {
					conn = new SqlServerConnection().getConnection();// Má»Ÿ káº¿t ná»‘i sql Server
					ps = conn.prepareStatement(query);
					ps.setInt(1, BId);
					ps.setString(2, BlogImage);
					ps.setString(3, BlogCon1);
					ps.setString(4, BlogCon2);
					ps.setString(5, BlogCon3);
					ps.setDate(6, date);
					ps.setString(7, Quotes);
					ps.setString(8, Title);
					ps.setString(9, name);
					ps.setString(10, Author);
					ps.setString(11, ImageDetail);
					ps.setString(12, AuthorQuotes);
					ps.executeUpdate();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
}
