<%@page import="ar.com.educacionit.domain.Articulos"%>
<%@page import="java.util.List"%>

<html>
	<head>
	</head>
	
	<body>
	
	<!-- Quiero capturar el listado que envio el servlet bajo el nombre
	LISTADO -->
	
	<%// SCRIPTLET > ME PERMITE ESCRIBIR CODIGO JAVA
		//DENTRO DE LA JSP TENGO UN OBJETO IMPLICITO LLAMADO REQUEST
		
		
		//PRIMERO CAPTURO
		Object listadoObject = request.getAttribute("LISTADO");
		// puedo castearlo de Object a List<Articulos>
		List<Articulos> listado = (List<Articulos>)listadoObject;
	%>
	
	
	<%
	//recorrer el listado e ir dibujando el codigo en un parrafo html
	
	for(Articulos art: listado){
		
		
	%>
		<!-- puedo escribir html puro y usar el objeto art -->
		<p><%=art.getCodigo() %></p>
	<%
		}
	%>
	
	</body>

</html>