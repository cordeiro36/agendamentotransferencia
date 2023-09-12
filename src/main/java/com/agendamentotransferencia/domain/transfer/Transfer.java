package com.agendamentotransferencia.domain.transfer;

import com.agendamentotransferencia.dtos.TransferDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name="transfers")
@Table(name="transfers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    public Transfer(TransferDTO data) {
        this.contaDestino = data.contaDestino();
        this.contaOrigem = data.contaOrigem();
        this.valorTransferencia = data.valorTransferencia();
        this.dataAgendamento = data.dataAgendamento();
        this.dataTransferencia = data.dataTransferencia();
    }
}
