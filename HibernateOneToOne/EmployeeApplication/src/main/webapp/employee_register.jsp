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
		
	String id =request.getParameter("id");
	int eid = Integer.parseInt(id);
	String name =request.getParameter("username");
	String password =request.getParameter("password");
	String email =request.getParameter("email");
	String phone =request.getParameter("phone");
	String department=request.getParameter("department");
	long mobile = Long.parseLong(phone);
	
	String sql = "insert into employee(id,name,password,email,phone,department) values (?,?,?,?,?,?)";			
	
		PreparedStatement ps =connection.prepareStatement(sql);
		ps.setInt(1, eid);
		ps.setString(2, name);
		ps.setString(3, password);
		ps.setString(4, email);
		ps.setLong(5, mobile);
		ps.setString(6, department);
		int x =ps.executeUpdate();
		if (x!=0)
			response.sendRedirect("./employee_login.html");
		
%>
<h1 align="center"> REGISTER SUCCESSFULLY</h1>
</body>
</html>