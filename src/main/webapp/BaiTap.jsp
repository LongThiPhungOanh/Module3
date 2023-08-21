<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/21/2023
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/product" method="post">
    <div class="product">
        <h4>Product Description</h4>
        <textarea style="height: 30px; width: 500px" name="description" placeholder="Product Description" ></textarea>
        <h4>Price List</h4>
        <input type="number" name="price" size="30" placeholder="Price List"/>
        <h4>Discount Percent</h4>
        <input type="number" name="Discount" size="30" placeholder="Discount Percent"><br><br>
        <input type="submit" name="submit" placeholder="Calculate Discount">
    </div>
</form>
</body>
</html>
