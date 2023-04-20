package com.uco.stloan.util;

public interface MessageSender <Loan> {
    void execute(Loan message, String idMessage);
}
