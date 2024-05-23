package br.unipar.programacaointernet.clinica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
public class Atendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Timestamp data_hora;

    private String anamnese;

    private Integer fk_medico_id;

    private Integer fk_paciente_id ;
}
