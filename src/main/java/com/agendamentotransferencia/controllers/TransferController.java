package com.agendamentotransferencia.controllers;

import com.agendamentotransferencia.domain.transfer.Transfer;
import com.agendamentotransferencia.dtos.TransferDTO;
import com.agendamentotransferencia.services.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/transfer")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @PostMapping
    public ResponseEntity<Transfer> createTransfer(TransferDTO transfer){
        Transfer newTransfer = transferService.createTransfer(transfer);
        return new ResponseEntity<>(newTransfer, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List>
}
