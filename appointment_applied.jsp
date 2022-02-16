<html>
<body bgcolor="wheat" >
<br><br><br><br>

<h1 align="center" >WELCOME TO PATIENT HOME 
<br><br><br>
<a href="apply_appointment.jsp"> Apply Appointment </a>
<a href="appointment_applied.jsp">View Appointment</a>
<a href="index.html"> LOGOUT</a>
</h1>
<br><br><br><br>
<%@ page import="java.sql.*" %>
<table border="2" width="800" height="200" align="center">
<tr><td>Id</td><td> Patient Name</td><td>Date</td><td>Time</td><td>Specialist</td><td>Status</td><td>Doctor name</td></tr>
<%
		Connection connection=null;
	    Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		String url ="jdbc:mysql://localhost:3306/mondee";
		String user ="root";
		String pass = "root";
		
		connection = DriverManager.getConnection(url, user, pass);
		//String specialist=(String)session.getAttribute("specialist");
		
		
		
		PreparedStatement ps=connection.prepareStatement("select * from appointment ");
		//ps.setString(1,specialist);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){					
%>
<tr>	
<td><%=rs.getInt(1) %></td><td>  <%=rs.getString("pname") %> </td><td> <%=rs.getString("doa") %></td>
<td><%=rs.getString("toa") %></td><td> <%=rs.getString("specialist") %></td>
<td><%=rs.getString("status") %></td>
<td><%=rs.getString("dname") %></td>
</tr>	

<%} %>
</table>
</body>
</html>