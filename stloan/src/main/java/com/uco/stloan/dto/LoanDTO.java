package com.uco.stloan.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoanDTO {

    @NotNull
    @PositiveOrZero
    private int personUser;
    //@NotBlank
    @NotNull
    @PositiveOrZero
    private int personMonitor;

    //@NotBlank
    @NotNull
    @PositiveOrZero
    private int article;

    //@NotBlank
    @NotNull
    @PositiveOrZero
    private int qtyArticle;

    //@NotBlank
    @DateTimeFormat
    @NotNull
    private Date dateStart;

    //@NotBlank
    @DateTimeFormat
    @NotNull
    private Date dateEnd;

    //@NotBlank
    @NotNull
    private Boolean isReturned;

}
