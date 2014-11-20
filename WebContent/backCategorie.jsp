<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="bodclass">
	<h1>Ajouter une categorie en base</h1>
	
	<div class="backform">
		<form action="saveC" method="post">
			<s:textfield label="Nom de la cat�gorie" name="categorie.nomCategorie"></s:textfield><br />
			<s:textarea label="Description" cols="40" rows="5" name="categorie.description"></s:textarea><br />
			<s:submit type="submit" value="Enregistrer"></s:submit><br />
		</form>
	</div>
	
	<div class="backtab">
	<h1>Liste des cat�gories pr�sents en base</h1>
		<table>
			<tr>
				<th>ID</th>
				<th>NOM CAT</th>
				<th>Description</th>
				<th>Photo</th>
				<th>SUPPR</th>
				<th>EDIT</th>
			</tr>
			<s:iterator value="cat�gories">
			<s:url namespace="/" action="updateC" var="lien1">
			<s:param name="ref">
				<s:property value = "idProduit"></s:property>
			</s:param>
			</s:url>
			
			<s:url namespace="/" action="deleteC" var="lien2">
			<s:param name="ref">
				<s:property value = "idProduit"></s:property>
			</s:param>
			</s:url>
			
			<tr>
					<td><s:property value="idCategorie" /></td>
					<td><s:property value="description" /></td>
					<td/>
					<td><s:property value="modifier" /><s:a href="%{lien1}">Edit</s:a></td>
					<td><s:property value="supprimer" /><s:a href="%{lien2}">Delete</s:a></td>
				<td>1</td>
				<td>Ordinateurs</td>
				<td>Ordinateurs</td>
				<td>Photo</td>
				<td><a>Supprimer</a></td>
				<td><a>Edit</a></td>
			</tr>
			</s:iterator>
		</table>
	
	</div>

</body>
</html>