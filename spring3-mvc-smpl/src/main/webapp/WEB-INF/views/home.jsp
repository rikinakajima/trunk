<html>
<head>
  <title>Home</title>
</head>
<body>
  <h1>ようこそHomeページへ !</h1>
  <p>現在時刻は「 ${date}」です。</p>
  <spring:url value="/sample/menu" var="action" />
  <form:form modelAttribute="homeForm" action="${action}">
    <form:label path="name">あなたの名前は？</form:label>
    <form:input path="name" />
    <form:errors path="name" cssStyle="color:red" />
    <input type="submit" value="送信" />
  </form:form>
</body>
</html>