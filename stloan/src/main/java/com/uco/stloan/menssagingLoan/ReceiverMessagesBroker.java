package com.uco.stloan.menssagingLoan;

import com.uco.stloan.Services.Loan.LoanService;
import com.uco.stloan.dto.LoanDTO;
import com.uco.stloan.model.Loan;
import com.uco.stloan.utils.gson.MapperJsonObjeto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ReceiverMessagesBroker {

    private final MapperJsonObjeto mapperJsonObjeto;

    private final LoanService loanService;

    public ReceiverMessagesBroker(MapperJsonObjeto mapperJsonObjeto, LoanService loanService) {
        this.mapperJsonObjeto = mapperJsonObjeto;
        this.loanService = loanService;
    }


    @RabbitListener ( queues = "${loan.procesar.queue-name}")
    public void receiveMessageProcessClient(String message) {
        try {
            LoanDTO loanDto = obtenerObjetoDeMensaje(message).get();
            Loan loan = new Loan(loanDto.getPersonUser(), loanDto.getPersonMonitor(), loanDto.getArticle(),
            loanDto.getQtyArticle(), loanDto.getDateStart(), loanDto.getDateEnd(), loanDto.getIsReturned());

            this.loanService.save(loan);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private Optional<LoanDTO> obtenerObjetoDeMensaje( String mensaje) {
        return mapperJsonObjeto.ejecutar(mensaje, LoanDTO.class);
    }
}
