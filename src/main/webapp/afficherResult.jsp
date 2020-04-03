<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Affichage d'un client</title>
        <link type="text/css" rel="stylesheet" href="style.css" />
    </head>
    <body>
		<%-- Affichage de la chaîne "message" transmise par la servlet --%>
        <p class="info">${ message1 }</p>
        <p class="info">${ message2 }</p>
        <p class="info">${ message3 }</p>
        
        <p class="info">${ triangle }</p>
    </body>
</html>