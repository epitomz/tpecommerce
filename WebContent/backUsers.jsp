<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
</head>
<body class="bodclass">
	<h1>Gestionnnaire Utilisateurs</h1>
	
	<div class="backform">
		<form action="saveU" method="post">
			<s:textfield label="Nom de l'utilisateur" name="user.userName"></s:textfield><br />
			<s:password label="Mot de passe"  name="user.password"></s:password><br />
			<s:select label="Role" name="idRole" list="roles" listKey="idRole" listValue="roleName"/>
			<s:hidden name="editMode"/>
			<s:submit type="submit" value="Enregistrer"></s:submit><br />
		</form>
	</div>
	
	<div class="backtab">
	<h1>Liste des utilisateurs présents en base</h1>
		<table>
			<tr>
				<th>ID</th>
				<th>NOM</th>
				<th>Role</th>
				<th>SUPPR</th> 
				<th>EDIT</th>
			</tr>
			<s:iterator value="users">
			<s:url namespace="/" action="updateU" var="lien1">
			<s:param name="idU">
				<s:property value = "idUser"></s:property>
			</s:param>
			</s:url>
			
			<s:url namespace="/" action="deleteU" var="lien2">
			<s:param name="idU">
				<s:property value = "idUser"></s:property>
			</s:param>
			</s:url>
			<tr>
					<td><s:property value="idUser" /></td>
					<td><s:property value="userName" /></td>
					<td><s:property value="role.roleName" /></td>
					<td><s:property value="modifier" /><s:a href="%{lien1}">Edit</s:a></td>
					<td><s:property value="supprimer" /><s:a href="%{lien2}">Delete</s:a></td>
			</tr>
			</s:iterator>
		</table>
	
	</div>
	<s:a href="index.jsp"/> <s:a href="backCategorie.jsp" action="listC"/>
 
</body>

</body>
</html>