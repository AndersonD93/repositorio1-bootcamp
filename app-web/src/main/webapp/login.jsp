<!-- HTML5 -->
<!DOCTYPE html>
<%@page import="ar.com.educacionit.web.enums.ViewKeysEnum"%>
<html lang="es">

<head>
	<!-- CSS only -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	
	<jsp:include page="styles.jsp"/>
</head>

<body>
	
	<!-- Incluyo la seccion  nav bar -->
	
	<jsp:include page="navbar.jsp"/>
	<main >
		<section class="container">
		<div class="row">
			<div class="col-6">
			<form action="<%=request.getContextPath()%>/LoginServlet" method ="post">		
					
			  <div class="mb-3">
			    <label for="exampleInputEmail1" class="form-label">Username</label>
			    <input type="text" name="<%=ViewKeysEnum.USERNAME.getParam()%>" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
			  </div>
			  <div class="mb-3">
			    <label for="exampleInputPassword1" class="form-label">Password</label>
			    <input type="password" name="<%=ViewKeysEnum.PASSWORD.getParam()%>" class="form-control" id="exampleInputPassword1">
			  </div>
			  <div class="mb-3 form-check">
			    <input type="checkbox" class="form-check-input" id="exampleCheck1">
			    <label class="form-check-label" for="exampleCheck1">Check me out</label>
			  </div>
			  <button type="submit" class="btn btn-primary">Submit</button>
			</form>
			</div>	  
		</div>
		</section>
	</main>
	<jsp:include page="scripts.jsp"/>
</body>
</html>