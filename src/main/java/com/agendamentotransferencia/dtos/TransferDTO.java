package com.agendamentotransferencia.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record TransferDTO (String contaOrigem, String contaDestino, BigDecimal valorTransferencia, LocalDateTime dataAgendamento, LocalDateTime dataTransferencia) {
}
