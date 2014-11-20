<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Site de E-Commerce</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body class="bodclass">
	<h1>Ajouter un produit en base</h1>
	
	<div class="backform">
		<form action="saveP" method="post">
			<s:select label="Categorie" name="idCat" list="categories" listKey="idCategorie" listValue="nomCategorie"/><br />
			<s:textfield label="Nom du produit" name="produit.designation"></s:textfield><br />
			<s:textarea label="Description" cols="40" rows="5" name="produit.description"></s:textarea><br />
			<s:textfield label="Prix" name="produit.prix"></s:textfield><br />
			<s:textfield label="Quantite" name="produit.quantite"></s:textfield><br />
			<s:checkbox label="Selectionne" name="produit.selectionne<"></s:checkbox><br />
			<s:file name="fileToUpload" label="Sélectionner une photo" id="fileToUpload"></s:file><br />
			<s:submit type="submit" value="Enregistrer"></s:submit><br />
		</form>
	</div>
	
	<div class="backtab">
	<h1>Liste des produits présents en base</h1>
		<table>
			<tr>
				<th>ID</th>
				<th>NOM CAT</th>
				<th>Description</th>
				<th>Prix</th>
				<th>Quantite</th>
				<th>Selectionne</th>
				<th>Photo</th>
				<th>SUPPR</th>
				<th>EDIT</th>
			</tr>
			<s:iterator value="produits">
			
			<s:url namespace="/" action="updateP" var="lien1">
			<s:param name="ref">
				<s:property value = "idProduit"></s:property>
			</s:param>
			</s:url>
			
			<s:url namespace="/" action="deleteP" var="lien2">
			<s:param name="ref">
				<s:property value = "idProduit"></s:property>
			</s:param>
			</s:url>
			
			<tr>
					<td><s:property value="idProduit" /></td>
					<td><s:property value="designation" /></td>
					<td><s:property value="description" /></td>
					<td><s:property value="prix" /></td>
					<td><s:property value="quantite" /></td>
					<td><s:property value="selectionne" /></td>
					<td>PHOTO</td>
					<td><s:property value="modifier" /><s:a href="%{lien1}">Edit</s:a></td>
					<td><s:property value="supprimer" /><s:a href="%{lien2}">Delete</s:a></td>
			</tr>
			</s:iterator>
		</table>
	
	</div>

</body>
</html>