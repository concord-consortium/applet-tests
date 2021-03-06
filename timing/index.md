---
layout: default
title: Test Applet Load Timing
show_in_toc: true
---
#### If an applet is referenced too soon, then sometimes calling methods on the applet fail.

[Run Timing Test](test.html)

This test points out a failure in OS X 10.7 or 10.8, Firefox 21, 22, and 23, Java 1.7.0_25-b15
The test injects an applet on the page, saves a reference to the applet dom object, then calls a method on the applet.
If the reference to the dom object is saved too soon then sometimes the method call fails.
There is a [Firefox bug report](https://bugzilla.mozilla.org/show_bug.cgi?id=872969) for this.
And there has also been a private Java bug filed for it. The owner of that private bug is adding
comments to the Firefox bug about its status. As of Sept. 16, 2013 he things the Java fix
will be included in 7u45 which is due in October.

To run this test, reload the test page multiple times. You should see 'fail' in the method call column. If you you increase
the initialDelay and reload the page the failures should decrease.
If the initialDelay is 0 then setTimeout is not used. A setTimeout(...,0) reduces the number of failures compaired to no
setTimeout. My testing has shown that a 50ms initialDelay works without failures.

This issues does not appear present in Safari with the same OS and Java. It also doesn't appear with the same
version of Firefox on OS X 10.6 with Java 1.6. It also doesn't appear in Windows 7 with the same Firefox and Java
versions. When the method call suceeds applet.toString() is the Java class name, when the method call fails it is
\[object HTMLAppletElement\].
This issue can also be seen without injecting the applet on the page. However the page needs to be
stripped down. If there is content before the applet tag then the issue rarely occurs. If there is no content before
the applet tag, then the test will fail often, and it can take up to a 200ms initialDelay before the failures completely
go away.

### Relevant Bugs
- [Firefox bug report 872969](https://bugzilla.mozilla.org/show_bug.cgi?id=872969) - this is currently closed because it
isn't clear how Firefox can fix this problem.
- there should be a Java bug filed for this issue

<div>
<div id='gist-it-timingjs' style='width: 34em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/timing/timing.js">
</script>
</div>
<div id='gist-it-appletjs' style='width: 24em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/timing/applets/DetectionApplet.java?slice=5:">
</script>
</div>
</div>
