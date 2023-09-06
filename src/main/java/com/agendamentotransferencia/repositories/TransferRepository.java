package com.agendamentotransferencia.repositories;

import com.agendamentotransferencia.domain.transfer.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
    Optional<Transfer> findTransferById(Long id);
}
