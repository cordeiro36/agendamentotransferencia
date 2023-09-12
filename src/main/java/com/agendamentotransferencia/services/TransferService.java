package com.agendamentotransferencia.services;

import com.agendamentotransferencia.domain.transfer.Transfer;
import com.agendamentotransferencia.dtos.TransferDTO;
import com.agendamentotransferencia.repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferService {
    @Autowired
    private TransferRepository repository;

    public Transfer findTransferById(Long id) throws Exception {
        return this.repository.findTransferById(id).orElseThrow(() -> new Exception("Transação não encontrada"));
    }

    public void saveTransfer(Transfer transfer){
        this.repository.save(transfer);
    }

    public Transfer createTransfer(TransferDTO data) {
        Transfer newTransfer = new Transfer(data);
        this.saveTransfer(newTransfer);
        return newTransfer;
    }
//    public void createTransfer() {
//        Transfer newTransfer = new Transfer();
//        newTransfer.setContaDestino(newTransfer.getContaDestino());
//        newTransfer.setContaOrigem(newTransfer.getContaOrigem());
//        newTransfer.setDataAgendamento(newTransfer.getDataAgendamento());
//        newTransfer.setDataTransferencia(newTransfer.getDataTransferencia());
//        newTransfer.set
//
//    }
}
