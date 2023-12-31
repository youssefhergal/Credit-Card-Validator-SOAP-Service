<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Credit Card Validator</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <h2>Credit Card Validator</h2>

    <?php
    // Check if the form has been submitted
    if ($_SERVER["REQUEST_METHOD"] === "POST") {
        // Check if the "cardNumber" parameter is set and not empty
        if (isset($_POST['cardNumber']) && !empty($_POST['cardNumber'])) {
            $cardNumber = $_POST['cardNumber'];
            $wsdlUrl = 'http://localhost:8182/?wsdl';

            try {
                // Create a SoapClient instance
                $client = new SoapClient($wsdlUrl, array('trace' => 1));

                // The parameters for the web service operation
                $params = array('cardNumber' => $cardNumber);

                // Call the web service operation
                $result = $client->isNumberCreditCardValide($params);
                var_dump($result);

                // Display the validation result
                echo '<p class="text-' . ($result === true ? 'success' : 'danger') . '">Validation Result: ' . ($result === true ? 'Valid' : 'Invalid') . '</p>';
            } catch (Exception $e) {
                // Handle other exceptions (e.g., SoapClient creation failure)
                echo '<p class="text-danger">Exception: ' . $e->getMessage() . '</p>';
            }
        } else {
            echo '<p class="text-danger">Error: Card number not provided.</p>';
        }
    }
    ?>

    <!-- Display the form -->
    <form action="" method="post">
        <label for="cardNumber">Enter Credit Card Number:</label>
        <input type="text" id="cardNumber" name="cardNumber" required>
        <button type="submit" class="btn btn-primary">Validate</button>
    </form>
</div>

<!-- Bootstrap JS and jQuery -->
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
