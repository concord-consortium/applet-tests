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

One caution with this approach is to watch out for threading issues if you try to make round trip calls
from java to javascript and back again.  The
[jdk8 applet execution guide](http://download.java.net/jdk8/docs/technotes/guides/jweb/applet/applet_execution.html)
implies that can cause problems.

I've also seen issues on IE where a exception is thrown when the plugin tries to run the applet start method.
This might be related to this approach of calling JSObject.getWindow in the init method. However running this
specific test does not have that problem. But it could be related to how the applet is added to the page and
the complexity of the page. It might be safer to call back to javascript in the start method instead of the init
method.

<div>
<div id='gist-it-init-notificationjs' style='width: 34em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/init-notification/test.html?slice=17:39">
</script>
</div>
<div id='gist-it-appletjs' style='width: 24em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/init-notification/applets/InitNotification.java?slice=7:">
</script>
</div>
</div>