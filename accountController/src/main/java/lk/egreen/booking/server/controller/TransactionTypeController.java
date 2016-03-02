package lk.egreen.booking.server.controller;

import lk.egreen.booking.server.entity.TransactionType;
import lk.egreen.booking.server.service.TransactionDAOService;
import lk.egreen.booking.server.utils.KeyGenrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dew on 2/28/16.
 */
@Controller
@RequestMapping("booking/v1/transactiontype")
@CrossOrigin(origins = "*")
public class TransactionTypeController {


    @Autowired
    private TransactionDAOService transactionDAOService;


    @RequestMapping(value = "save", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public String createAccount(@RequestBody TransactionType transactionType) {
        System.out.println(transactionType);
        return transactionDAOService.createType(transactionType);
    }


    @RequestMapping(value = "getAllTypies", method = RequestMethod.GET)
    @ResponseBody
    public List<TransactionType> getAllTypies(@RequestParam("limit") int limit, @RequestParam("offset") int offeset) {
        return transactionDAOService.getAllByPagination(limit, offeset);
    }


    @RequestMapping(value = "ob", method = RequestMethod.GET)
    @ResponseBody
    public TransactionType getOb() {
        return new TransactionType();
    }

}
