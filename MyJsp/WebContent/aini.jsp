<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
 $



</script>

<title>Insert title here</title>
</head>

<
<body>
<form action="xusheng">
  学号 <input name="sno">
 上传照片 <input type="file"  > 
  <input type="submit" value="提交">
${requestScope["a"]}
<%=pageContext.getRequest().setAttribute("2", 6) %>
var student=""

</form>
</body>
</html>