
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title></title>
    <style>
        body {
            width: 100vw;
            height: 100vh;
        }
    </style>
</head>
<body id="body">
<script>
    const style = getComputedStyle(document.getElementById("body"));
    let result = "";
    result += "height=" + style.height;
    result += "&width=" + style.width;
    window.location.href = "/spoof/show?" + result;
</script>
</body>
</html>
