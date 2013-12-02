---
layout: default
title: Pack GZ without Servlet
show_in_toc: true
---

Previously applets and jnlps required special handling of http headers inorder to serve pack.gz
files. These files are much more compressed than normal jar files, however handling the http headers
meant that basic http services like gh-pages or Amazon S3 could not be used. But with Java version 6
there is an option for applets and jnlps to add support for pack.gz without the header handling.

Here is the [documentation in jdk8](http://download.java.net/jdk8/docs/technotes/guides/jweb/networking/pack200.html)

[Run the test](test.html)


