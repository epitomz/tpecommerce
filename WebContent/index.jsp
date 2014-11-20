<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!-- <jsp:include page="WEB-INF/inc/loginCheck.jsp" /> -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Site de E-Commerce</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>
<div class="entete">
	<h1>Site de E-Commerce de la bombe</h1>
	<s:url namespace="/" action="liste" var="lien1"/>
	<s:if test="#session.role==1">
		<s:a href="backCategorie.jsp" action="listC">Gérer les catégories</s:a>
		<s:a href="backProduit.jsp" action="listP">Gérer les produits</s:a>
		<s:a href="backUsers.jsp" action="listU">Gérer les utilisateurs</s:a>
	</s:if>
	<s:elseif test="#session.role==2">
		<s:a href="backProduit.jsp" action="listP">Gérer les produits</s:a>
	</s:elseif>
	<s:else/>
	<form>
		<input type="text"></input>
		<input type="submit" value="Rechercher"></input>
	</form>
	<div class="panier">
		<h2>Panier</h2>
		<p>0 article ajouté</p>
		<s:url namespace="/" action="login" var="lien2"/>
		<s:url namespace="/" action="logout" var="lien3"/>
	<s:if test="#session.logined == 'true'">
		<p>Bonjour <s:property value="#session.username" /></p>
		<s:a href="%{lien3}">Se déconnecter</s:a>
	</s:if>
	<s:else>
		<s:a href="signup.jsp">S'inscrire</s:a>
		<s:a href="%{lien2}">Se connecter</s:a>
	</s:else>
	
	</div>
</div>

<div class="sidebar">
	<ul>
		<s:iterator value="categories">
			<li><s:property value="nomCategorie" /></li>
		</s:iterator>
	</ul>
	
</div>

<div class="contenu">
	<s:iterator value="produits">
		<div class="objet">
			<td>Nom : <s:property value="designation" /></td><br />
			<td>Desc : <s:property value="description" /></td><br />
			<td>Prix : <s:property value="prix" /></td><br />
			<td>Qte : <s:property value="quantite" /></td><br />
			<td><s:textfield label="Quantite" name="quantite"></s:textfield></td><br />
			<td><s:a href="panier.jsp" action="ajoutPanier">Ajouter au panier</s:a>
		</div>
	</s:iterator>
	
	
</div>

</body>
</html>