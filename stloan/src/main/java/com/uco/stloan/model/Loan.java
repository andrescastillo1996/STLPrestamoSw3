package com.uco.stloan.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="LOAN")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="personUser_id")
    private int personUser;

    @Column(name="personMonitor_id")
    private int personMonitor;

    @Column(name="article_id")
    private int article;

    @Column(name="qtyArticle")
    private int qtyArticle;

    @Column(name="dateStart")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private String dateStart;

    @Column(name="dateEnd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private String dateEnd;

    @Column(name="IsReturned")
    private Boolean isReturned;

    public Loan(int personUser, int personMonitor, int article, int qtyArticle, String dateStart, String dateEnd, Boolean isReturned) {
        this.personUser = personUser;
        this.personMonitor = personMonitor;
        this.article = article;
        this.qtyArticle = qtyArticle;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.isReturned = isReturned;
    }

    public Loan(){

    }
}
