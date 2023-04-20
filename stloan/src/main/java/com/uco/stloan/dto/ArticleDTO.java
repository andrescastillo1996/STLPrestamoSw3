package com.uco.stloan.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToMany;
import javax.validation.constraints.*;


@Getter
@Setter
public class ArticleDTO {

    @NotNull
    @NotBlank
    @OneToMany(name ="Ref")
    private String ref;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @PositiveOrZero
    private Integer quantity;


    @NotNull
    @NotBlank
    private  String status;

}
