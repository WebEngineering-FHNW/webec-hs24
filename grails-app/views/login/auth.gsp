<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main"/>
  <title>
    Anmelden
  </title>

  <style media="screen">
  #login {
    margin: 15px 0;
    padding: 0;
    text-align: center;
  }
  #login .inner {
    width: 340px;
    padding-bottom: 6px;
    margin: 60px auto;
    text-align: left;
    border: 1px solid #aab;
    background-color: #d9d9e3;
    box-shadow: 2px 2px 2px #eee;
  }
  #login .inner .fheader {
    padding: 18px 26px 14px 26px;
    background-color: #f7f7ff;
    margin: 0 0 14px 0;
    color: #2e3741;
    font-size: 18px;
    font-weight: bold;
  }
  #login .inner .cssform p {
    clear: left;
      padding: 4px 0 3px 105px;
      margin: 0 0 20px;
      height: 1%;
  }
  #login .inner .cssform input[type="text"] {
    width: 120px;
  }
  #login .inner .cssform label {
    font-weight: bold;
    float: left;
    text-align: right;
    margin-left: -105px;
    width: 110px;
    padding-top: 3px;
    padding-right: 10px;
    padding-left: 1em;
  }
  #login #remember_me_holder {
    padding-left: 114px;
  }
  #login #submit {
    margin-left: 15px;
  }
  #login #remember_me_holder label {
    float: right;
    margin-left: 0;
    text-align: left;
    width: 200px;
    padding-left: 4px;
    padding-top: 0;
  }
  #login .inner .login_message {
    padding: 6px 25px 20px 25px;
    color: #c33;
  }
  #login .inner .text_ {
    width: 120px;
  }
  #login .inner .chk {
    /*height: 12px;*/
  }
  </style>
</head>

<body>

<div id="login">
  <div class="inner">
    <div class="fheader">Bitte anmelden</div>


    <form action="/login/authenticate" method="POST" id="loginForm" class="cssform" autocomplete="off">
      <p>
        <label for="username">Benutzer</label>
        <input type="text" class="text_" name="username" id="username" placeholder="guest"/>
      </p>

      <p>
        <label for="password">Passwort</label>
        <input type="password" class="text_" name="password" id="password" placeholder="guest"/>
      </p>

      <p id="remember_me_holder">
        <input type="checkbox" class="chk" name="remember-me" id="remember_me"/>
        <label for="remember_me">Angemeldet bleiben</label>
      </p>

      <p>
        <input type="submit" id="submit" value="Anmelden"/>
      </p>
    </form>
  </div>
</div>

</body>
</html>
