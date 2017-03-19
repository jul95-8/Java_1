<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function Browser() {
            var ua = navigator.userAgent;
            var bName = function () {
                if (ua.search(/MSIE/) > -1) return "IE";
                if (ua.search(/Firefox/) > -1) return "Firefox";
                if (ua.search(/Opera/) > -1) return "Ppera";
                if (ua.search(/Chrome/) > -1) return "Chrome";
                if (ua.search(/Safari/) > -1) return "Safari";
            }
            return bName();
        }
    </script>
</head>
<body onload="Browser()">
<h1>Hello, <%= request.getParameter("login")%>!<br/></h1>
    <h2><%= request.getAttribute("date")%>,
    <script type="text/javascript">
        document.write(Browser());
    </script>
    <br/>
    </h2><br/>
<pre>
    <p>New message: </p>
    <form name="message" method="post" action="/emailServlet">
        FROM    : <input required type="text" name="from"/><br/>
        TO      : <input required type="text" name="to"/><br/>
        Subject : <input type="text" name="subject"/><br/>
        Text    : <textarea required name="text" rows="4" cols="55"></textarea><br/>
        <input type="submit" value="Send">
    </form>
</pre>
</body>
</html>
