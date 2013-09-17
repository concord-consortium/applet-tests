---
layout: default
title: Multi Threaded Javascript
show_in_toc: true
---
#### On some browsers applets can cause unexpected multi threaded javascript

[Run Multi Threaded](test.html)

On at least IE 10, when a javascript call to the applet blocks then the browser starts executing other scheduled javascript code. This seems to be a violation of the Javascript single threaded constraint.

The test link above demonstrates this problem.
