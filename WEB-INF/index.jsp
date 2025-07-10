
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Máy tính đơn giản</h1>
<form action="calculate" method="post">
  Số thứ nhất: <input type="number" name="firstNumber" required><br>
  Tính toán:
  <select name="operator">
    <option value="+">+</option>
    <option value="-">-</option>
    <option value="*">*</option>
    <option value="/">/</option>
  </select><br>
  Số thứ hai: <input type="number" name="secondNumber" required><br>
  <input type="submit" value="Tính toán">
</form>
</body>
</html>
