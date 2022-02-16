<html>
<body bgcolor="wheat" >
<br><br><br><br>

<h1 align="center" >WELCOME TO PATIENT HOME 
<br><br><br><br>
<a href="apply_appointment.jsp"> APPLY FOR APPOINTMENT </a>
<a href="index.html"> LOGOUT</a>
</h1>
<br><br><br>
<form action="./patient_appointment.jsp" align="center">
<input type="text" name="pname" placeholder="Enter patient name">
<input type="date" name="doa" placeholder="Select date">
<input type="text" name="toa" placeholder="Enter time">
<input type="number" name="phone" placeholder="Enter phone number">

<select name="specialist">
<option value="ENT">ENT</option>
<option value="Dentist">Dentist</option>
<option value="Orthopedic">Orthopedic</option>
</select>

<input type="submit" value="Apply">
</form>
</body>
</html>