package com.uco.stloan.menssagingLoan;

import com.uco.stloan.config.LoanQueueConfig;
import com.uco.stloan.domain.client.Client;
import com.uco.stloan.util.MessageSender;
import com.uco.stloan.util.gson.MapperJsonObjeto;   
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.MessagePropertiesBuilder;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderBroker implements MessageSender <Loan>{

    private final RabbitTemplate rabbitTemplate;
    private final MapperJsonObjeto mapperJsonObjeto;
    private final LoanQueueConfig loanQueueConfig;

    public MessageSenderBroker(LoanQueueConfig loanQueueConfig) {
        this.loanQueueConfig = loanQueueConfig;
    }

}
