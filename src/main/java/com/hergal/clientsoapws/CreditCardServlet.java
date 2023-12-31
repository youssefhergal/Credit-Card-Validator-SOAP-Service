package com.hergal.clientsoapws;







import proxy.CreditCardController;
import proxy.CreditCardWS;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreditCardServlet", urlPatterns = { "*.do", "/valider.do" })
public class CreditCardServlet extends HttpServlet {

    private final CreditCardController creditCardService = new CreditCardWS().getCreditCardControllerPort();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = request.getServletPath() ;
        if(path.equals("/index.do")){
            request.getRequestDispatcher("creditCardForm.jsp").forward(request, response);
        }
        else if (path.equals("/valider.do") ) {
            request.getRequestDispatcher("creditCardForm.jsp").forward(request, response);
        }

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/valider.do")) {
            String cardNumber = request.getParameter("cardNumber");
            Boolean isValid = false;

            if (cardNumber != null) {
                // Call the SOAP service method if the cardNumber is provided
                isValid = creditCardService.isNumberCreditCardValide(cardNumber);
            }

            // Set the result in request attribute to be used in JSP
            request.setAttribute("isValid", isValid);

            // Forward the request to the creditCardForm.jsp
            request.getRequestDispatcher("creditCardForm.jsp").forward(request, response);
        } else {
            // Handle other POST requests or provide an appropriate response
            response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Invalid POST request");
        }
    }



}
