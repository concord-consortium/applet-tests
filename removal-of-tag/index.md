---
layout: default
title: Test Removal of Applet Tag
show_in_toc: true
---
#### On some browsers removing Applets appears to reload them

[Run Applet Removal](test.html)

This points out a problem that I've only found on IE. I've verified it on IE 10 and I suspect it happens on earlier versions as well. 	If an applet tag is removed in the normal way, then the initial applet instance is destroyed, and then immediately after a new instance is created with the same params.

If instead the applet is inside of an element and `element.innerHTML = ""` is used, then the applet is destroyed and a new instance is not created.

<div>
<div id='gist-it-init-notificationjs' style='width: 34em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/removal-of-tag/test.html?slice=21:43">
</script>
</div>
<div id='gist-it-appletjs' style='width: 24em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/removal-of-tag/applets/InitNotification.java?slice=7:">
</script>
</div>
</div>