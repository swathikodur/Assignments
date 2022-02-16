<html>
<body bgcolor="wheat" >
<br><br>

<h1 align="center" >WELCOME TO EMPLOYEE PROFILE
<br><br><br><br>
<a href="employee_profile.jsp"> EMPLOYEE PROFILE </a>
<a href="index.html"> LOGOUT</a>
</h1>
<br><br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" width="400" height="200" align="center">
<tr><td>id</td><td>Name</td><td>Email</td><td>Phone</td><td>Department</td></tr>
<%
		Connection connection=null;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url ="jdbc:mysql://localhost:3306/mondee";
		String user ="root";
		String pass = "root";
		
		connection = DriverManager.getConnection(url, user, pass);
		int mid=(Integer)session.getAttribute("id");
		PreparedStatement ps=connection.prepareStatement("select * from employee where id=?");
		ps.setInt(1,mid);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){					
%>
<tr>	
<td><%=rs.getInt(1) %></td><td>  <%=rs.getString(2) %> </td><td> <%=rs.getString(4) %></td>
<td><%=rs.getInt(5) %></td><td> <%=rs.getString(6) %></td></tr>	

<%} %>
</table>
</body>
</html>