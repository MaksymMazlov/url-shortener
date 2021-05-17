<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>URL-shortener</title>
</head>

<form method="post" action="/">
    <b>Full URL:</b><br>
    <input name="fullUrl" type="text"  size="140">
    <input type="submit" value="Отправить">
</form>
<#if fullUrl??>${fullUrl}
</#if>


<#if shortUrl??>
    Сгенирировано короткую ссылку:
    <output size="100"><small>http://localhost:8080/</small><b>${shortUrl}</b></output>
    </br>
    <a href="http://localhost:8080/${shortUrl}"> Перейти </a>
</#if>

<!-- The text field -->

</html>