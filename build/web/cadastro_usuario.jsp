<%-- 
    Document   : cadastro_usuario
    Created on : 02/04/2019, 12:58:07
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulário de cadastro</h1>
        <table>

            <form></form>
            <tbody><tr>
                </tr><tr><td>Nome:</td><td><input type="text" name="nome"></td></tr>

                <tr><td>Sobrenome:</td><td><input type="text" name="sobrenome"></td></tr>

                <tr><td>CPF: </td><td><input type="idade" maxlength="16"></td></tr>
                <tr><td>RG: </td><td><input type="idade" maxlength="8"></td></tr>
                <tr><td>Data de nascimento: </td><td><input type="date" name="datanasc"></td></tr>
                <tr><td>Email: </td><td><input type="text" name="email" maxlength="30"></td></tr>
                <tr><td>Senha: </td><td><input type="password" name="senha" maxlength="20"></td></tr>
                <tr><td>Confirme sua senha:</td><td> <input type="password" name="confirmasenha" maxlength="20"></td></tr>
                <tr><td><input type="submit" name="enviar"></td>         
                </tr>




            </tbody></table>


    </body>
</html>
