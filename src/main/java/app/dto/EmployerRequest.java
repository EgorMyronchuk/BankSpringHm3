package app.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployerRequest {
    @Size(min = 3, message = "company name should have at least 2 characters")
    private String name;
    @Size(min = 3, message = "address should have at least 2 characters")
    private String address;
}
