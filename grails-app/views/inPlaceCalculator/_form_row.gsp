<%--
 Emitting a single row of a form with label an input field.
 Params:
   name  : name to use for id, name, labelFor
   label : what the user sees beneath the input field
   model : the values to show and error information
 Depends on the "validate" function from outside.
--%>

<%@ page import="static rooms.FieldUtil.*" %>

<div>
  <label for='${name}'>${label}</label>
  <input type="number decimal" name="${name}" value="${model.getProperty(name)}"
         required="true" min="1.0" max="6.0" id="${name}"
         class="${hasError(model, name) ? 'error' : ''}"
         title="${g.message(error: findError(model, name)) }"

  />
</div>
