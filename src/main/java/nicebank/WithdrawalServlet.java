
package nicebank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class WithdrawalServlet extends HttpServlet
{


	private static final long serialVersionUID = -257598521010755099L;
	private CashSlot cashSlot;
    private Account account;
    
    public WithdrawalServlet(CashSlot cashSlot, Account account) {
        this.cashSlot = cashSlot;
        this.account = account;
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                                                throws ServletException, IOException
    {
        Teller teller = new AutomatedTeller(cashSlot);
        int amount = Integer.parseInt(request.getParameter("amount"));
        teller.withdrawFrom(account, amount);

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(
             "<html><head><title>ATM</title></head>" +
                      "<body>Pleeeeease take your $" + amount + " El cashlot es:" + cashSlot.toString()+ " </body></html>");
        
        try 
        {
			Thread.sleep(10000);
		} catch (InterruptedException e) 
        {
		}
    }
}