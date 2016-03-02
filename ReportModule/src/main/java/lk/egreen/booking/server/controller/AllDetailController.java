package lk.egreen.booking.server.controller;

import lk.egreen.booking.server.models.AllDetailModel;
import lk.egreen.booking.server.service.AllDetailService;
import lk.egreen.booking.server.service.UserDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ruwan on 2/15/16.
 */
@Controller
@RequestMapping(value = "booking/v1/allDetail")
public class AllDetailController {

    @Autowired
    private AllDetailService allDetailService;

//    @Autowired
//    private LoanRequestDAOService loanRequestDAOService;
//
//    @Autowired
//    private IndividualDAOService individualDAOService;

    @Autowired
    private UserDAOService userDAOService;


    /**
     * getAll User count ,loan rate, center count & individual count
     *
     * @return
     */
    @RequestMapping(value = "getAllDetails", method = RequestMethod.GET, headers = "Accept=application/json")
    @ResponseBody
    public AllDetailModel getAllDetails() {

        return allDetailService.getAllDetails();
    }

    /**
     * Get All LoanRequesters By Pagination
     *
     * @param limit
     * @param offset
     * @return
     */
//    @RequestMapping(value = "getAllLoanRequestersByPagination", method = RequestMethod.GET, headers = "Accept=application/json")
//    @ResponseBody
//    public List<LoanRequestModel> getAllLoanRequestByPagination(@RequestParam("type") Integer type,
//                                                                @RequestParam("limit") Integer limit,
//                                                                @RequestParam("offset") Integer offset) {
//        List<LoanRequest> loanRequestList = loanRequestDAOService.getAllLoanRequestByPagination(type, limit, offset);
//        List<LoanRequestModel> requestModelList=new ArrayList<LoanRequestModel>();
//        for (LoanRequest loanRequest:loanRequestList) {
//            String individualId = loanRequest.getIndividualId();
//            Individual individual=individualDAOService.getBranchById(individualId);
//            LoanRequestModel loanRequestModel=new LoanRequestModel();
//            loanRequestModel.setLoanRequestId(loanRequest.getLoanRequestId());
//            loanRequestModel.setCenterid(loanRequest.getCenterid());
//            if(individual != null){
//                loanRequestModel.setIndividualId(loanRequest.getIndividualId());
//            }
//            loanRequestModel.setIndividualName(individual.getName());
//            loanRequestModel.setAmount(loanRequest.getAmount());
//            loanRequestModel.setUser(loanRequest.getUser());
//            loanRequestModel.setRequestDate(loanRequest.getRequestDate());
//            loanRequestModel.setStatus(loanRequest.getStatus());
//            requestModelList.add(loanRequestModel);
//
//        }
//        return requestModelList;
//    }
}
