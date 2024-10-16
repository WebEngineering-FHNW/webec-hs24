<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="form"/>
  <title>
    In-Place Calculator
  </title>
  <style>
      html {
          font-family: system-ui;
      }
      fieldset, div.padded {
          padding:    1em;
          box-shadow: 1px 1px 2px black;
          max-width:  60ch;
          margin-inline: auto;
          margin-top: 2em;
          display:    grid;
          grid-template-columns: max-content max-content;
          gap:        0.5em 1em;
      }
      fieldset > div {
          display:    grid;
          grid-column: 1 / -1;
          grid-template-columns: subgrid;
      }
  </style>
</head>

<body>

<form action="/inPlaceCalculator/calc" method="get">
  <fieldset class="form padded">

    <tmpl:form_row name="en"   label="En"   model="${calculatorInstance}" />

    <tmpl:form_row name="exam" label="Exam" model="${calculatorInstance}" />

    <div>
      <label>&nbsp;</label>
      <input type="submit" value="Calculate"/>
    </div>
  </fieldset>
</form>


<div class="padded">
  <label>Result</label>
  <rooms:decorate grade="${calculatorInstance.result}">
    <output>${calculatorInstance.result}</output>
  </rooms:decorate>
</div>


</body>
</html>

