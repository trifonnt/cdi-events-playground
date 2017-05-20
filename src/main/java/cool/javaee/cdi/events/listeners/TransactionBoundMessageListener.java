/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cool.javaee.cdi.events.listeners;

import cool.javaee.cdi.events.listeners.qualifiers.Transaction;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.TransactionPhase;
import javax.inject.Named;

/**
 *
 * @author Pavel Pscheidl <pavel.junior@pscheidl.cz>
 */
@Named
@ApplicationScoped
public class TransactionBoundMessageListener {

    public void listenToTransactionEvent(@Observes(during = TransactionPhase.AFTER_COMPLETION) @Transaction String message) {
        System.out.println("Message within transaction: " + message);
    }

}