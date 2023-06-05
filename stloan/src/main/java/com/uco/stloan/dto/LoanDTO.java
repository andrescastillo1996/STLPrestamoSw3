package com.uco.stloan.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private String dateStart;

    //@NotBlank
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private String dateEnd;

    //@NotBlank
    @NotNull
    private Boolean isReturned;

}
