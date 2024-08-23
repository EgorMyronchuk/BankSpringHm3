package app.facade;

import app.dto.AccountRequest;
import app.dto.AccountResponse;
import app.dto.EmployerRequest;
import app.dto.EmployerResponse;
import app.model.Account;
import app.model.Employer;
import org.springframework.stereotype.Component;

@Component
public class AccountFacade {
    public Account convertToEntity(AccountRequest employerRequest) {
        Account account = new Account();
        account.setBalance(employerRequest.getBalance());
        account.setNumber(employerRequest.getNumber());
        account.setCurrency(employerRequest.getCurrency());

        return account;
    }
    public AccountResponse convertToResponse(Account employer) {
        AccountResponse accountResponse = new AccountResponse();
        accountResponse.setBalance(employer.getBalance());
        accountResponse.setNumber(employer.getNumber());
        accountResponse.setCurrency(employer.getCurrency());
        accountResponse.setId(employer.getId());
        accountResponse.setCustomer(employer.getCustomer());

        return accountResponse;
    }


}
