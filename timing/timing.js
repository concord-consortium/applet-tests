testTiming = function(initialDelay, testDelay) {
  testAppletReady = function() {
    try {
      return document.getElementById('testApplet').areYouLoaded();
    } catch(e) {
      return false;
    }
  };

  runTest = function() {
    refToApplet = document.getElementById('testApplet');
    setTimeout(function() {
      appletReady = testAppletReady();
      log(initialDelay, testDelay, appletReady?"pass":"fail",
          document.getElementById('testApplet').toString());
    }, testDelay);
  };

  document.getElementById('appletContainer').innerHTML =
    '<applet id="testApplet" code="applets.DetectionApplet" ' +
    '         width="150px" height="150px" MAYSCRIPT="true">' +
    '  <param name="MAYSCRIPT" value="true" />' +
    '  <param name="classloader_cache" value="false">' +
    '</applet>';

  if (initialDelay === 0) {
    runTest();
  } else {
    setTimeout(runTest, initialDelay);
  }
}