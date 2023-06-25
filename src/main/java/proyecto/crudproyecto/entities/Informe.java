/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.crudproyecto.entities;


import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "informe")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Informe {

    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer idInforme;

    @Column(name = "asunto", nullable = false)
    private String asunto;

    @Column(name = "fecha_elab", nullable = false)
    private Date fechaElab;

    @Column(name = "dirigido_fkusuario", nullable = false)
    private String dirigidoFkusuario;

    @Column(name = "tipo_informe", nullable = false)
    private String tipoInforme;

    @Column(name = "fecha_fin", nullable = false)
    private Date fechaFin;

    @JoinColumn(name = "id_proyecto_Proyecto", referencedColumnName = "id")
    @ManyToOne
    private Proyecto idproyectoProyecto;

   @OneToMany(mappedBy = "idInforme")
    private List<TipoInforme> tipoInformeList;


    // Constructor, getters, and setters
}

