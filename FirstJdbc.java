<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
container
</style>
</head>
<body>

<div class="container">
<h1>My Form</h1>
<form action="RegisterServlet" metod="post">
<table>
<tr>
<td>Enter your Name:</td>
<td><input type="text" name="user_name" placeholder="Enter here"> </td>
</tr>
<tr>
<td>Enter password:</td>
<td>
<input type="password" name="user_password" placeholder="Enter here">
</td>
</tr>
<tr>
<td>
Enter Enail:
</td>
<td><input type="email" name="user_email" placeholder="Enter here"></td>
</tr>
<tr>
<td>Select Gender</td>
<td><input type="radio" name="user_gender" value="male">Male &nbsp; &nbsp; <input type="radio" name="user_gender" value="female"> Female </td>
</tr>
<tr>
<td>Select Courses</td>
<td>
<select name="user_courses">
<option value="Java">Java</option>
<option value="Python">Python</option>
<option value="Android">Android</option>
<option value="Sql">Sql</option>
</select>
</td>
</tr>
<tr>
<td style="text-align: right"><input type="checkbox" value="checked" name="condition"></td>
<td>Agree The Terms And Conditions</td>
</tr>
<tr>
<td>
</td>
<td>
<button type="submit">Register</button>
<button type="reset">Reset</button>
</td>
</tr>

</table>
</form>
</div>

</body>
</html>