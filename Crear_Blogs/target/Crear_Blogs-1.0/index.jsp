<!doctype html>
<html>
    <head>
        <link rel="stylesheet" href="style.css" type="text/css"/>

        <meta charset="utf-8">
        <title>Documento sin título</title>
        <style>

            body{
                background-color:#FFC;
            }

            table{
                background:#FF6;
                padding:10px;
                border:solid 2px #FF0000;
            }

            td{
                padding:5px 0;
            }




        </style>
    </head>

    <body>
        <h1 style="text-align:center">Crea tu Blog</h1>
        <form action="Guardar" method="post">

            <table width="35%" border="0">
                
                 <tr>
                    <td><label for="nombreB">Nombre del Blog: </label></td>
                    <td><input type="text" name="nombreB" id="nombreB"></td>
                </tr>
                <tr>
                    <td><label for="nombre">Nombre: </label></td>
                    <td><input type="text" name="nombre" id="nombre"></td>
                </tr>
                <tr>
                    <td><label for="apellido">Apellido: </label></td>
                    <td><input type="text" name="apellido" id="apellido"></td>
                </tr>
                <tr>
                    <td><label for="correo">Correo: </label></td>
                    <td><input type="text" name="correo" id="correo"></td>
                </tr>
                <tr>
                    <td><label for="contenido">Contenido del Blog: </label></td>
                    <td><P><textarea name="contenido" id="contenido" cols="30" rows="20" align="center"></textarea></p><br></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" name="button" id="button" value="Guardar"></td>

                    <td colspan="2" align="center"><a href="Mostrar">Mostrar</a></td>

                </tr>
            </table>
            <p><br>
            </p>
        </form>
    </body>
</html>
