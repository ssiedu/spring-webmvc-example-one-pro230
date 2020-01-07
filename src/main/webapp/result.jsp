<%@page import="com.ssi.InterestModel"%>
<%
	InterestModel model=(InterestModel)request.getAttribute("info");
%>
<html>
<body>
	<h3>Interest-Details</h3>
		<hr>
			<pre>
				Amount	:	<%=model.getAmount()%>
				Time	:	<%=model.getTime()%>
				Rate	:	<%=model.getRate()%>
				Int-Amt	:	<%=model.getInterest()%>
				Net-Amt	:	<%=model.getNet()%>
			</pre>
		<hr>
</body>
</html>