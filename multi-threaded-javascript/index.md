---
layout: default
title: Multi Threaded Javascript
show_in_toc: true
---
#### On some browsers applets can cause unexpected multi threaded javascript

[Run Multi Threaded](test.html)

On at least IE 10, when a javascript call to the applet blocks then the browser starts executing other scheduled javascript code. This seems to be a violation of the Javascript single threaded constraint.
The test code below demonstrates this problem. You can run this code with the link above.
When this code is run on IE 10 the following output is logged

    starting first bit of code
    running second bit of code
    ending first bit of code

In normal Javascript execution the second block of code should never run while the first block is still executing. Based on some testing on a single IE 10 machine, I found that this only happens if the applet sleeps for more than 250 milliseconds. That isn't a precise number, sometimes it is a bit more sometimes a bit less.

<div>
<div id='gist-it-init-notificationjs' style='width: 34em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/multi-threaded-javascript/test.html?slice=30:40">
</script>
</div>
<div id='gist-it-appletjs' style='width: 24em; float: left; margin-left: 10px'>
<script src="http://gist-it.appspot.com/github/{{ site.github_repo }}/blob/gh-pages/multi-threaded-javascript/applets/BlockingCall.java?slice=7:">
</script>
</div>
</div>
