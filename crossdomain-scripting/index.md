---
layout: default
title: Cross domain scripting
show_in_toc: true
---

There were limitations on where an applet can come from and whether scripts can access it from the page. This used to be a problem in Safari but so far
I haven't been able to reproduce it. Currently this test loads 2 signed applets one from the same host and one from a different host.
It then calls methods on each one and also has each one call javascript.
[A discussion about scripting cross domain on safari](http://jogamp.org/applet-launcher/www/#SCRIPTING)

The jar of the applets is also marked as a trusted-library. Otherwise a message is shown to the user when javascript tries to access
a signed applet. [Offical docs about Trusted-Library and Javascript](http://docs.oracle.com/javase/7/docs/technotes/guides/jweb/mixed_code.html)

[Run Test](test.html)

### Source Code

<div>
<div id='gist-it-xdomainjs' style='width: 34em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/crossdomain-scripting/test.html?slice=28:50">
</script>
</div>
<div id='gist-it-appletjs' style='width: 24em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/crossdomain-scripting/applets/CrossDomainTest.java?slice=7:">
</script>
</div>
</div>
