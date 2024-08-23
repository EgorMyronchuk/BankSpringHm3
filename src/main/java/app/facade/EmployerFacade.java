package app.facade;

import app.dto.EmployerRequest;
import app.dto.EmployerResponse;
import app.model.Employer;
import org.springframework.stereotype.Component;

@Component
public class EmployerFacade {

    public Employer convertToEntity(EmployerRequest employerRequest) {
        Employer employer = new Employer();
        employer.setName(employerRequest.getName());
        employer.setAddress(employerRequest.getAddress());

        return employer;
    }

    public EmployerResponse convertToResponse(Employer employer) {
        EmployerResponse employerResponse = new EmployerResponse();
        employerResponse.setId(employer.getId());
        employerResponse.setName(employer.getName());
        employerResponse.setAddress(employer.getAddress());

        return employerResponse;
    }
}
