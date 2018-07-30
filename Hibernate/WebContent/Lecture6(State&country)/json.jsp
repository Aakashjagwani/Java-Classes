<%@taglib prefix="x" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<x:set value="${sessionScope.list5}" var="d">
</x:set>
<x:set value="${f:length(d) }" var = "q">
</x:set>
[
<x:forEach items="${sessionScope.list5 }" var="r" varStatus="j">
<x:if test="${q ne j.count }">
{
"sid":"${r.id }",
"sname":"${r.state}"
},
</x:if>

<x:if test="${q eq j.count }">
{
"sid":"${r.id }",
"sname":"${r.state}"
}
</x:if>

</x:forEach>
]