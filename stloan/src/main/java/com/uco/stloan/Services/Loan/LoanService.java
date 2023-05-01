package com.uco.stloan.Services.Loan;

import com.uco.stloan.exception.NotFoundEx;
import com.uco.stloan.model.Loan;

import java.util.List;

public interface LoanService {
    public List<Loan> findAll();
    public Loan findById(Long id);
    public Loan save(Loan loan);

    public void deleteById(Long id);

    public boolean partialUpdate( long id, String key, String value) throws NotFoundEx;
}
