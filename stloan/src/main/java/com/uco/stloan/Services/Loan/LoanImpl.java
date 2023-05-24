package com.uco.stloan.Services.Loan;

import com.uco.stloan.Repository.LoanRepository;
import com.uco.stloan.model.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@Service
public class LoanImpl implements LoanService{

    @Autowired
    private LoanRepository loanRepository;

    @Override
    public Loan save(Loan loan) {
        return loanRepository.save(loan);
    }
}
