<!DOCTYPE html>
<html>
<head>
  <#include "header.ftl">
</head>

<body>

  <#include "znav.ftl">

<div class="container">

  <h1>Database Output</h1>
    <ul>
    <#list countries as x>
      <li> ${x} </li>
    </#list>
    </ul>

</div>

</body>
</html>
