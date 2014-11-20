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

<div class="connexion">
	<h2>S'enregistrer</h2>
		<s:form name="enregistrement" action="saveUser" method="post">
			<s:textfield label="Identifiant" name="user.userName"></s:textfield>
			<s:password label="Mot de passe" name="user.password"></s:password>
			<s:submit value="S'enregistrer"></s:submit>
		</s:form>
</div>

</body>
</html>