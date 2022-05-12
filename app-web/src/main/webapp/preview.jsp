<%@page import="ar.com.educacionit.domain.Articulos"%>
<%@page import="java.util.Collection"%>
<%@page isELIgnored="false" %>
<%@page import="ar.com.educacionit.web.enums.ViewKeysEnum"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<jsp:include page="styles.jsp"/>
</head>
<body>
	<jsp:include page="navbar.jsp"/>
	<main>
		<jsp:include page="mensajeria.jsp"/>
		<section class="container">
			<div class="row d-flex justify-content-center">
				<h1>Preview de Archivos a procesar</h1>
				<%
					Collection<Articulos> articulos = (Collection<Articulos>)request.getAttribute(ViewKeysEnum.UPLOAD_PREVIEW_KEY.getParam());
					out.print(articulos);
				%>
				
			<table class="table">
			  <caption>List of users</caption>
			  <thead>
			    <tr>
			      <th scope="col">#</th>
			      <th scope="col">Titulo</th>
			      <th scope="col">Codigo</th>
			      <th scope="col">Precio</th>
			      <th scope="col">Stock</th>
			      <th scope="col">Id Marca</th>
			      <th scope="col">Id categoria</th>
			    </tr>
			  </thead>
			  <tbody>
			  
			  <% for(Articulos aux:articulos){ %>
			    <tr>
			      <th scope="row"></th>
			      <td><%=aux.getTitulo()%></td>
			      <td><%=aux.getCodigo() %></td>
			      <td><%=aux.getPrecio() %></td>
			      <td><%=aux.getStock() %></td>
			      <td><%=aux.getMarcasId() %></td>
			      <td><%=aux.getCategoriasId() %></td>
			    </tr>
			    <%} %>
			   
			  </tbody>
			</table>
				<div class="row"></div>
				    <div class="col-12">
				       <a class="btn btn-primary" href="<%=request.getContextPath()%>/controllers/CargarProductosServlet"></a>
				    </div>
				
			</div>
		</section>
	</main>
	<jsp:include page="scripts.jsp"/>
</body>
</html>