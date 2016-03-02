package lk.egreen.booking.server.service;

import lk.egreen.booking.server.dao.UserDAOController;
import lk.egreen.booking.server.entity.User;
import lk.egreen.booking.server.models.AllDetailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ruwan on 2/15/16.
 */
@Service
public class AllDetailService {


    @Autowired
    private UserDAOController userDAOController;


    /**
     * getAll User count ,loan rate, center count & individual count
     *
     * @return
     */
    public AllDetailModel getAllDetails() {
//        List<User> userList = userDAOController.getAll();
//        int userCount = userList.size();
//        List<ApprovedLoan> unpaidLoanList =approvedLoanDAOService.getUnpaidLoans();
//        int unpaidLoanCount = unpaidLoanList.size();
//        List<Center> centerList = centerDAOService.getAll();
//        int centerCount = centerList.size();
//        List<Individual> individualList = individualDAOService.getAll();
//        int individualCount = individualList.size();
//
        AllDetailModel allDetailModel=new AllDetailModel();
//        allDetailModel.setUsersCount(userCount);
//        allDetailModel.setDueLoanCount(unpaidLoanCount);
//        allDetailModel.setCenterCount(centerCount);
//        allDetailModel.setIndividualCount(individualCount);

        return allDetailModel;

    }
}
