<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/Styile.css">

<title>STUDENT_REGISTRATION FORM</title>
	<style >
	
		.container{
		width:30%;
		height:70%;
		border:1px solid black;
		margin:auto;
		padding:auto;
		font-size: 20px;		
		
		}
		
		#myform table tr td input{
		font-size: 20px;
		}
		
	
	</style>

</head>
<body>


	<!-- <form> -->
	<!-- 
				<label> Firstname </label> <input type="text"
					placeholder="Enter First_name" name="firstname" size="15" /> <br>
				<br> <label> Middlename:</label> <input type="text"
					placeholder="Enter middle_name" name="middlename" size="15" /> <br>
				<br> <label>Lastname: </label> <input type="text"
					placeholder="Enter Last_name" name="lastname" size="15" /> <br>
				<br> <label> Course : </label> <select>
					<option value="Course">Course</option>
					<option value="BCA">BCA</option>
					<option value="BBA">BBA</option>
					<option value="B.Tech">B.Tech</option>
					<option value="MBA">MBA</option>
					<option value="MCA">MCA</option>
					<option value="M.Tech">M.Tech</option>
				</select> <br> <br> <label> Gender : </label><br> <input
					type="radio" name="male" /> Male <br> <input type="radio"
					name="female" /> Female <br> <input type="radio" name="other" />
				Other <br> <br> <label> Phone : </label> <input
					type="text" name="country code" value="+91" size="2" /> <input
					type="text" name="phone" size="10" /> <br> <br> Address
				<br>
				<textarea cols="80" rows="5" value="address">  
				</textarea>
				<br> <br> Email: <input type="email" placeholder="Enter Email" id="email"
					name="email" /> <br> <br> <br> Password: <input
					type="Password" placeholder="Enter Password"  id="pass" name="pass"> <br> <br>
				<br> Re-type password: <input type="Password" id="repass"
					name="repass"> <br> <br> <input type="button"
					value="Submit" />
			</form>
 -->


	<!-- <form action="">
 				
 				
 					<label>student id </label>
 					<input type="text" placeholder="enter-student-id" name="studentId" >
 				
 				
 				
 				
 				
 				</form> -->
	<!-- </div><!--  -->






	<!-- <!-- 	</div>
 -->



	<div class="container">

		<h1>REGISTRATION FORM</h1>

		<form id="myform" action="Registerservlet" method="post">

			<table>

				<tr>
					<td>Enter your name :-</td>
					<td><input type="text" placeholder="Enter here.."
						name="user_name" /></td>

				</tr>
				<tr>
					<td>Enter your password :-</td>
					<td><input type="password" placeholder="Enter here.."
						name="user_Password" /></td>

				</tr>


				<tr>
					<td>Enter your email :-</td>
					<td><input type="email" placeholder="Enter here.."
						name="user_email" /></td>

				</tr>


				<tr>
					<td>Select Gender</td>
					<td><input type="radio" name="user_gender" value="male" />
						Male &nbsp; &nbsp;<input type="radio" name="user_gender"
						value="female" /> Female &nbsp; &nbsp;</td>


				</tr>




				<tr>
					<td>select your course</td>


					<td><select name="user_course">
							<option value="Java">Java</option>

							<option value="Sql">Sql</option>

							<option value="python">python</option>

							<option value="JavaScript">JavaScript</option>

							<option value="Android">Android</option>

							<option value="C++">C++</option>

							<option value="DataStructure">DataStructure</option>


					</select></td>




				</tr>



				<tr>

					<td style="text-align: right;"><input type="checkbox"
						value="checked" name="condition" /></td>
					<td>Agree terms and conditions</td>
				</tr>
				
				<tr>
				<td></td>
				<td>
				<button type="submit">Register</button>
				<button type="rest">Rest</button>
				
				
				</td>
				
				</tr>
			
			</table>






		</form>




	</div>





</body>
</html>