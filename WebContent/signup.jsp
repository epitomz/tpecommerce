<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscription</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>

<div class="connexion">
	<h2>S'enregistrer</h2>
		<s:form name="enregistrement" action="saveUser" method="post">
			<tr><td colspan="2"><h3>Identifiants de connexion</h3></td></tr>
			<s:textfield label="Identifiant" name="user.userName"></s:textfield>
			<s:password label="Mot de passe" name="user.password"></s:password>
			<tr><td colspan="2"><h3>Informations personnelles</h3></td></tr>
			<s:textfield label="Nom" name="client.nomClient"></s:textfield>
			<s:textfield label="Adresse" name="client.adresse"></s:textfield>
			<s:textfield label="Email" name="client.email"></s:textfield>
			<s:textfield label="Telephone" name="client.tel"></s:textfield>
			<s:submit value="S'enregistrer"></s:submit>
		</s:form>
</div>

</body>
</html>