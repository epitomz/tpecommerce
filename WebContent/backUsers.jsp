<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gérer les utilisateurs</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
</head>
<body class="bodclass">
	<h1>Gestionnnaire Utilisateurs</h1>
	
	<div class="backform formUser">
		<form action="saveU" method="post">
			<s:hidden name="user.idUser"/>
			<s:textfield label="Nom de l'utilisateur" name="user.userName"></s:textfield><br />
			<s:password label="Mot de passe"  name="user.password"></s:password><br />
			<s:select label="Role" name="idRole" list="roles" listKey="idRole" listValue="roleName"/><br />
			<s:checkbox label ="Activé" name="user.actived"></s:checkbox>
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
				<th>ACTIVED</th>
				<th>EDIT</th>
				<th>SUPPR</th> 
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
					<td><s:property value="actived" /></td>
					<td><s:property value="modifier" /><s:a href="%{lien1}">Modifier</s:a></td>
					<td><s:property value="supprimer" /><s:a href="%{lien2}">Supp</s:a></td>
			</tr>
			</s:iterator>
		</table>
	<div class="menuRetour">
		<s:a href="index">Accueil</s:a> <s:a href="backCategorie" action="listC">Gestionnaire des catégories</s:a>
	</div>
	</div>
	
 
</body>

</body>
</html>