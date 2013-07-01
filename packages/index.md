---
layout: default
title: Packages Field
show_in_toc: true
---

There used to be a 'Packages' field on an applet instance that could be used to access static fields and methods
and also be used to create new objects. Here is the
[official documentation of this feature](https://jdk6.java.net/plugin2/liveconnect/#PER_APPLET_PACKAGES)

However this field has been removed in recent versions of Java. It seems it was removed in 1.7.0_21 based on the
[release notes](http://www.oracle.com/technetwork/java/javase/7u21-relnotes-1932873.html) (search for Packages).

Here is a [mozilla bug report](https://bugzilla.mozilla.org/show_bug.cgi?id=748343) about removing the java,
netscape, and Packages global variables from Firefox. However that should be independent from the Packages variable on the
applet instance itself.
Here is a [unanswered oracle forum dicussion about it](https://forums.oracle.com/message/10972687)

[Run the test](test.html)

Source code:

<div>
<div id='gist-it-packagesjs' style='width: 34em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/packages/test.html?slice=15:39">
</script>
</div>
<div id='gist-it-appletjs' style='width: 24em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/packages/applets/PackagesTest.java?slice=6:">
</script>
</div>
</div>


