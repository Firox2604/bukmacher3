<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
<form method="POST" action="j_security_check">
    <table>
        <tr>
            <td colspan="2"><b>Login to the Bukmacher application:</b></td>
        </tr>
        <tr>
            <td>
                User Name:
            </td>
            <td><input type="text" name="j_username"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="j_password"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Go" /></td>
        </tr>
    </table>
</form>
</body>
</html>
