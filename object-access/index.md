---
layout: default
title: Rich java object access
show_in_toc: true
---

Safari 6.1 has introduced some limitations to javascript access to Java objects returned when calling methods on an applet. This test
calls and interacts with various return types from an applet and gives information about what return types work and what do not.

[Run Test](test.html)

### Source Code

<div>
<div id='gist-it-xdomainjs' style='width: 34em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/object-access/test.html?slice=28:50">
</script>
</div>
<div id='gist-it-appletjs' style='width: 24em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/object-access/applets/ObjectAccessTest.java?slice=7:">
</script>
</div>
</div>
