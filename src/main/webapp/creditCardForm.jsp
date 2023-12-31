<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Credit Card Validator</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <div class="card mx-auto" style="width: 32rem;">
        <div class="card-header">
            <h2 class="mb-0">Credit Card Validator</h2>
        </div>
        <div class="card-body">
            <form action="valider.do" method="post">
                <div class="form-group">
                    <label for="cardNumber">Enter Credit Card Number:</label>
                    <input type="text" class="form-control" id="cardNumber" name="cardNumber" required>
                </div>
                <button type="submit" class="btn btn-success btn-block">Submit</button>
            </form>

            <%-- Afficher le résultat directement ici --%>
            <% Boolean isValid = (Boolean) request.getAttribute("isValid"); %>
            <% if (isValid != null) { %>
            <div class="mt-4 alert <%= isValid ? "alert-success" : "alert-danger" %>" role="alert">
                <% if (isValid) { %>
                Votre numéro de carte est valide !
                <% } else { %>
                Numéro de carte invalide. Veuillez réessayer.
                <% } %>
            </div>
            <% } %>
        </div>
    </div>
</div>

<!-- Include Bootstrap JS and jQuery -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
