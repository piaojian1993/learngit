<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>

    <link href="/css/index.css" rel="stylesheet" />

</head>
<body>
首页
<center>
    <img src="/images/logo.png" />
    <h1 id="title">${title.name}</h1>
</center>

<script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js"></script>

<script>
    $(function(){
        $('#title').click(function(){
            alert('点击了');
        });
    })
</script>
</body>
</html>