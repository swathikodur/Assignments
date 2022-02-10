<html>
<body bgcolor="wheat">
<%@ page import="java.sql.*" %>
<%
		Connection connection=null;
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url ="jdbc:mysql://localhost:3306/mondee";
		String user ="root";
		String pass = "root";
		
			connection = DriverManager.getConnection(url, user, pass);
		
	
	String name =request.getParameter("username");
	String password =request.getParameter("password");
	String email =request.getParameter("email");
	String phone =request.getParameter("phone");
	String address=request.getParameter("address");
	long mobile = Long.parseLong(phone);
	
	String sql = "insert into patient(name,password,email,phone,address) values (?,?,?,?,?)";			
	
		PreparedStatement ps =connection.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, password);
		ps.setString(3, email);
		ps.setLong(4, mobile);
		ps.setString(5, address);
		int x =ps.executeUpdate();
		if (x!=0)
			response.sendRedirect("./patient_login.html");
		
%>
<h1 align="center"> REGISTER SUCCESSFULLY</h1>
</body>
</html>