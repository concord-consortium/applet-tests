---
layout: default
title: Rich java object access
show_in_toc: true
---

This set of tests is to display the limitations of using javascript to interact with various types of
Java primitives and Objects that can be returned from a Java applet. It will be useful for tracking changes to
the various browser's support over time.

In particular, Safari 6.1 no longer is able to access member objects of an array using bracket notation (eg `arr[3]`).

[Run Test](test.html)

### Source Code

<div>
<div id='gist-it-xdomainjs' style='width: 34em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/object-access/test.html?slice=13:">
</script>
</div>
<div id='gist-it-appletjs' style='width: 24em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/object-access/applets/ObjectAccessTest.java?slice=6:">
</script>
</div>
</div>
