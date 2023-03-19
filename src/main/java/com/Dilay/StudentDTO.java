package com.Dilay;

import lombok.*;

//Data Transfer Object = DTO
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {
    private Long studentId;
    private String studentName ;
    private String studentSurname ;
}
