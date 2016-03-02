package lk.egreen.booking.server.controller;

import lk.egreen.booking.server.entity.Account;
import lk.egreen.booking.server.model.AccountSummery;
import lk.egreen.booking.server.model.AccountSummeryRequestModel;
import lk.egreen.booking.server.service.AccountDAOService;
import lk.egreen.booking.server.service.AccountSummeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dew on 2/28/16.
 */
@Controller
@RequestMapping("booking/v1/account")
@CrossOrigin(origins = "*")
public class AccountController {

    @Autowired
    private AccountDAOService accountDAOService;

    @Autowired
    private AccountSummeryService accountSummeryService;


    @RequestMapping(value = "getAccountList", method = RequestMethod.GET)
    @ResponseBody
    public List<Account> getAccountList(@RequestParam("limit") int limit, @RequestParam("offset") int offset) {
        return accountDAOService.getAccountListByLimitOffeset(limit, offset);
    }


    @RequestMapping(value = "save", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public String createAccount(@RequestBody Account account) {
        System.out.println(account);
        return accountDAOService.save(account);
    }


    @RequestMapping(value = "summery", method = RequestMethod.POST)
    @ResponseBody
    public AccountSummery getAccountSummery(@RequestBody AccountSummeryRequestModel accountSummeryRequestModel) {
        return accountSummeryService.getAccountSummery(accountSummeryRequestModel);
    }


    @RequestMapping(value = "ob2", method = RequestMethod.GET)
    @ResponseBody
    public Account getOb() {
        return new Account();
    }

}
