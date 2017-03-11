<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
        <html:base/>
    </head>
    <form action="/LoginForm.do">
	<table border="1">

	    <h3>Ejemplo de login</h3>
	    <tbody>
		<tr>
		    <td>nombre: <html:text property="name"/></td>
		    
		</tr>
		<tr>
		    <td>password<html:password property="password"/></td>
		    
		</tr>
		<tr>
		    <td><input type="submit" value="enviar" /></td>
		</tr>

	    </tbody>

	</table>
    </form>

</body>
</html:html>
