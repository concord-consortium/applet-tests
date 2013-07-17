---
layout: default
title: Test Applet Init Notification
show_in_toc: true
---
#### Applets are not ready right away, this demonstrates one approach to handle that

[Run Init Notification](test.html)

Methods on applets cannot be called right away from Javascript. 
Additionally currently in some browsers the Javascript object
for the applet cannot even be accessed too soon. The [Timing Test](../timing/) shows problems with a naive
approach to working applets.

This code demonstrates a way to deal with this by having the applet notify javascript when it is ready.

<div>
<div id='gist-it-init-notificationjs' style='width: 34em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/init-notification/test.html?slice=14:42">
</script>
</div>
<div id='gist-it-appletjs' style='width: 24em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/init-notification/applets/InitNotification.java?slice=7:">
</script>
</div>
</div>