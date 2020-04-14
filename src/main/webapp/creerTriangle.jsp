<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Création d'un Triangle</title>
        <link type="text/css" rel="stylesheet" href="style.css" />
    </head>
    <body>
    <header id="header">
    <p> Créer son triangle</p>
    </header>
    
    <div id="textpresentation">
    <p>Merci de saisir les coordonnées de trois points dans un repère orthonormé <span id="textpetit">(entrez que des nombres entiers sans virgules positifs ou négatifs)</span>.</p>
    </div>
        <div>
            <form method="get" action="creationTriangle">
                <fieldset>
                    <legend>Points du triangle</legend>
    				<legend>Point P1</legend>
                    <label for="firstPointX">X </label>
                    <input type="text" id="firstPointX" name="firstPointX" value="" size="10" maxlength="20" required pattern="^[0-9]+|^-[0-9]+" title="Un chiffre entier"/>
                    <br/>
                    <label for="firstPointY">Y </label>
                    <input type="text" id="firstPointY" name="firstPointY" value="" size="10" maxlength="20" required pattern="^[0-9]+|^-[0-9]+" title="Un chiffre entier"/>
                    <br />
                    
                    <legend>Point P2</legend>
                    <label for="secondPointX">X </label>
                    <input type="text" id="secondPointX" name="secondPointX" value="" size="10" maxlength="20" required pattern="^[0-9]+|^-[0-9]+" title="Un chiffre entier"/>
                    <br/>
                    <label for="secondPointY">Y </label>
                    <input type="text" id="secondPointY" name="secondPointY" value="" size="10" maxlength="20" required pattern="^[0-9]+|^-[0-9]+" title="Un chiffre entier"/>
                    <br />
                    
                    <legend>Point P3</legend>
                    <label for="thirdPointX">X </label>
                    <input type="text" id="thirdPointX" name="thirdPointX" value="" size="10" maxlength="20" required pattern="^[0-9]+|^-[0-9]+" title="Un chiffre entier"/>
                    <br/>
                    <label for="thirdPointY">Y </label>
                    <input type="text" id="thirdPointY" name="thirdPointY" value="" size="10" maxlength="20" required pattern="^[0-9]+|^-[0-9]+" title="Un chiffre entier"/>
                    <br />

                </fieldset>
                <input type="submit" value="Valider"  />
                <input type="reset" value="Remettre à zéro" /> <br />
            </form>
        </div>
    </body>
</html>