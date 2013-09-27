---
layout: default
title: Test Applet Init Notification (jQuery)
show_in_toc: true
---
#### Applets are not ready right away, this demonstrates two approaches to handle that, one which works and one which does not

[Run Failing Init Notification](test-append.html)

[Run Working Init Notification](test-html.html)

Methods on applets cannot be called right away from Javascript.
Additionally currently in some browsers the Javascript object
for the applet cannot even be accessed too soon. The [Timing Test](../timing/) shows problems with a naive
approach to working applets.

This code demonstrates a way to deal with this by having the applet notify javascript when it is ready. However, one caveat with
doing this, is how you insert the applet html into the page. When using jQuery, you can use the .append() method or the .html() method
to insert html into the page. In the case of an applet, .append() actually creates a reference to the applet element _too early_
and will therefore cause problems in some cases later trying to access the applet's methods. .html() seems to not create this reference,
and therefore things work later on.

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
  <div id='gist-it-init-notificationjs-append' style='width: 34em; float: left; margin-left: 10px'>
    <script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/init-notification-jquery/test-append.html?slice=17:39">
    </script>
  </div>
  <div id='gist-it-init-notificationjs-html' style='width: 34em; float: left; margin-left: 10px'>
    <script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/init-notification-jquery/test-html.html?slice=17:39">
    </script>
  </div>
  <div id='gist-it-appletjs' style='width: 24em; float: left; margin-left: 10px'>
    <script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/init-notification-jquery/applets/InitNotification.java?slice=7:">
    </script>
  </div>
</div>