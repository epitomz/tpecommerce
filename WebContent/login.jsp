<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Connexion</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>

<div class="connexion">
	<h2>Connexion au site</h2>
		<s:form name="connexion" action="connexion" method="post">
			<s:textfield label="Utilisateur" name="user.userName"></s:textfield>
			<s:password label="Mot de passe" type="password" name="user.password"></s:password>
			<s:submit value="Se connecter"></s:submit>
		</s:form>
</div>

</body>
</html>