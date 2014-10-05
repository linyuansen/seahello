<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <title>My JSP 'index.jsp' starting page</title>
</head>
<body>
<center>
<h1><font color="red">Operation List</font></h1>
<s:a href="saveFItem.jsp">Save Fashion Item</s:a><br/><br/><br/>
<s:a href="fitem/listFItem.action">List Fashion Item</s:a><br/>
<s:a href="fitem/createFItem.action">Create Fashion Item</s:a>
<hr/>
<h1><font color="red">File upload</font></h1>
<s:a href="fitem/listFile.action">List file upload</s:a>

</center>
</body>
</html>