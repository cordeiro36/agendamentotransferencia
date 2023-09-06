package com.agendamentotransferencia.domain.transfer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name="transfers")
@Table(name="transfers")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contaOrigem;
    private String contaDestino;
    private BigDecimal valorTransferencia;
    private LocalDateTime dataAgendamento;
    private LocalDateTime dataTransferencia;
}
