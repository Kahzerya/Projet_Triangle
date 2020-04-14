<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Résultats</title>
        <link type="text/css" rel="stylesheet" href="style.css" />
    </head>
    <body>
		<%-- Affichage de la chaîne "message" transmise par la servlet --%>
        <p class="info" id="firstpoint">${ message1 }</p>
        <p class="info" id="secondpoint">${ message2 }</p>
        <p class="info" id="thirdpoint">${ message3 }</p>
        
        <p class="info" id="triangle">${ triangle }</p>
        <p class="info" id="distance">${ distance1 }<br>${distance2 }<br>${distance3 }</p>
        
    </body>
</html>