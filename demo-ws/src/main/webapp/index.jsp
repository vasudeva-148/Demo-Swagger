<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.1">
    <jsp:scriptlet>
       try ( java.io.InputStream is = getServletContext().getResourceAsStream("/META-INF/MANIFEST.MF") ) {
		if ( is != null ) {
			java.util.jar.Manifest manifest = new java.util.jar.Manifest( is );
			pageContext.setAttribute("manifestEntries", manifest.getMainAttributes().entrySet());
		}
	}
    </jsp:scriptlet>

    <html xmlns="http://www.w3.org/1999/xhtml">
    <body>
    <h2>PBD Server</h2>

    <ul>
        <li><a href="monitoring">See the monitoring</a></li>
        <li><a href="actuator">Spring Boot Actuator</a></li>
        <li><a href="services">List the services</a></li>
		<li><a href="api">JAX-RS services</a>
	    <ul>
            <li>api-docs v4:&#160;
                <a href="/pbdsrv/swagger-v4.json">json</a>&#160;
                <!--<a href="/pbdsrv/swagger-v4.yml">yaml</a>&#160; NEEDS WORK -->
                <a href="webjars/swagger-ui/index.html?url=/pbdsrv/swagger-v4.json">swagger-ui</a>
            </li>
            <li>api-docs v5:&#160;
                <a href="/pbdsrv/swagger-v5.json">json</a>&#160;
                <!--<a href="/pbdsrv/swagger-v5.yml">yaml</a>&#160; NEEDS WORK -->
                <a href="webjars/swagger-ui/index.html?url=/pbdsrv/swagger-v5.json">swagger-ui</a>
            </li>
            <li>api-docs v6:&#160;
                <a href="/pbdsrv/swagger-v6.json">json</a>&#160;
                <!--<a href="/pbdsrv/swagger-v6.yml">yaml</a>&#160; NEEDS WORK -->
                <a href="webjars/swagger-ui/index.html?url=/pbdsrv/swagger-v6.json">swagger-ui</a>
            </li>
        </ul>
    </li>
    </ul>

    <h2>MANIFEST.MF</h2>
    <c:choose>
        <c:when test="empty ${manifestEntries}">
            No manifest found
        </c:when>
        <c:otherwise>
            <c:forEach var="entry" items="${manifestEntries}">
                <c:out value="${entry.key}" />: <c:out value="${entry.value}" /><br/>
            </c:forEach>
        </c:otherwise>
    </c:choose>

    </body>
    </html>
</jsp:root>