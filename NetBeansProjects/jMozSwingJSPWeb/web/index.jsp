<%-- 
    Document   : index
    Created on : 27-abr-2011, 0:29:22
    Author     : mike
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
  <script type="text/javascript" src="lib/corejs/Core.js"></script>
  <script type="text/javascript" src="lib/corejs/Core.Web.js"></script>
  
  <script type="text/javascript" src="lib/echo/Application.js"></script>
  <script type="text/javascript" src="lib/echo/Render.js"></script>
  <script type="text/javascript" src="lib/echo/Sync.js"></script>
  <script type="text/javascript" src="lib/echo/Serial.js"></script>
  <script type="text/javascript" src="lib/echo/Client.js"></script>
  <script type="text/javascript" src="lib/echo/FreeClient.js"></script>
  <script type="text/javascript" src="lib/echo/DebugConsole.js"></script>
  <script type="text/javascript" src="lib/echo/Sync.Button.js"></script>
  <script type="text/javascript" src="lib/echo/Sync.ArrayContainer.js"></script>
  <script type="text/javascript" src="lib/echo/Sync.ContentPane.js"></script>
  <script type="text/javascript" src="lib/echo/Sync.Label.js"></script>
  <script type="text/javascript" src="lib/echo/Sync.SplitPane.js"></script>
  <script type="text/javascript" src="lib/echo/Sync.WindowPane.js"></script>
  <script type="text/javascript" src="lib/extras/Extras.js"></script>
  <script type="text/javascript" src="lib/extras/Application.AccordionPane.js"></script>
  <script type="text/javascript" src="lib/extras/Sync.AccordionPane.js"></script>
  <script type="text/javascript" src="lib/extras/Application.Menu.js"></script>
  <script type="text/javascript" src="lib/extras/Sync.Menu.js"></script>
  <script type="text/javascript" src="lib/extras/Application.TransitionPane.js"></script>
  <script type="text/javascript" src="lib/extras/Sync.TransitionPane.js"></script>
  
  
  <script type="text/javascript" src="app/Main.js"></script>
  <script type="text/javascript" src="app/Util.js"></script>
  <script type="text/javascript" src="app/Default.StyleSheet.js"></script>
  <script type="text/javascript" src="app/Messages.js"></script>
  <script type="text/javascript" src="app/WelcomeScreen.js"></script>
    
  <title>Echo3 Client-Side JavaScript Application Demo</title>
 </head>
 <body onload="DemoApp.init();" style="height:100%;width:100%;margin:0px;padding: 0px;overflow:auto;font-family:verdana, arial, helvetica, sans-serif;font-size:10pt">
  <div id="rootArea" style="position:absolute;width:100%;height:100%;"></div>
 </body>
</html>
