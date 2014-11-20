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
	<s:a href="%{lien1}">Back</s:a>
	<form>
		<input type="text"></input>
		<input type="submit" value="Rechercher"></input>
	</form>
	<div class="panier">
		<h2>Panier</h2>
		<p>0 article ajouté</p>
		<s:url namespace="/" action="login" var="lien1"/>
		<s:url namespace="/" action="logout" var="lien2"/>
	<s:if test="#session.logined == 'true'">
		<p>Bonjour <s:property value="#session.username" /></p>
		<s:a href="%{lien2}">Se déconnecter</s:a>
	</s:if>
	<s:else>
		<s:a href="signup.jsp">S'inscrire</s:a>
		<s:a href="%{lien1}">Se connecter</s:a>
	</s:else>
	
	</div>
</div>

<div class="sidebar">
	<ul>
		<li><a href="">Ordinateurs</a></li>
		<li><a href="">Smartphones</a></li>
		<li><a href="">Tablettes</a></li>
</ul>
</div>

<div class="contenu">
	<div class="objet">
		<h2>Computer</h2>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
	</div>
	<div class="objet">
		<h2>Computer</h2>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
	</div>
	<div class="objet">
		<h2>Computer</h2>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
	</div>
	<div class="objet">
		<h2>Computer</h2>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
	</div>
	<div class="objet">
		<h2>Computer</h2>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
	</div>
	<div class="objet">
		<h2>Computer</h2>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
	</div>
	<div class="objet">
	<h2>Computer</h2>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
		<h3>Prix: 1000€</h3>
	</div>
	
	

</div>

</body>
</html>