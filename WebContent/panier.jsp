<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Panier</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<table>
		<tr>
			<th>Nom du produit</th>
			<th>Prix unitaire</th>
			<th>Quantité</th>
			<th>Total</th>
		</tr>
		<s:iterator value="listeLigneCommande">
			<tr>
				<td><s:property value="produit.nomProduit" /></td>
				<td><s:property value="produit.prix" /></td>
				<td><s:property value="quantite" /></td>
				<td><s:property value="prix" /></td>
			</tr>
		</s:iterator>
		<tr>
		<td colspan="3"/>
		<td><s:label value="total"></s:label>
	</table>
	
	

</body>
</html>