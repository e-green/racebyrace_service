package lk.egreen.booking.server.controller;

import lk.egreen.booking.server.entity.Account;
import lk.egreen.booking.server.entity.Transaction;
import lk.egreen.booking.server.service.TransactionDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dew on 2/28/16.
 */
@Controller
@RequestMapping("booking/v1/transaction")
@CrossOrigin
public class TransactionController {

    @Autowired
    private TransactionDAOService transactionDAOService;


    /**
     *
     * Create Transaction
     *
     * @param transaction
     * @return
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    @ResponseBody
    public String createAccount(@RequestBody Transaction transaction) {
        return transactionDAOService.createTransaction(transaction);
    }





    @RequestMapping(value = "ob", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public Transaction getob() {
        return new Transaction();
    }

}
