package proyecto.crudproyecto.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Proyecto")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "fecha_aprob", nullable = false)
    private Date fechaAprob;

    @Column(name = "fecha_prop", nullable = false)
    private Date fechaProp;

    @Column(name = "antecedentes", nullable = false)
    private String antecedentes;

    @Column(name = "alcance", nullable = false)
    private String alcance;

    @Column(name = "marco_teorico", nullable = false)
    private String marcoTeorico;

    @Column(name = "metodologias", nullable = false)
    private String metodologias;

    @Column(name = "estrategia", nullable = false)
    private String estrategia;

    @Column(name = "seguimiento", nullable = false)
    private String seguimiento;

    @Column(name = "id_carrera_carrera", nullable = false)
    private Integer idCarreraCarrera;

    @Column(name = "id_estado_Estado", nullable = false)
    private Integer idEstadoEstado;

    @Column(name = "idUsuario", nullable = false)
    private Integer idUsuario;

    @Column(name = "idLineainv", nullable = false)
    private Integer idLineainv;

    @OneToMany(mappedBy = "idproyectoProyecto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Informe> informeList;

    @OneToOne(mappedBy = "idproyectoProyecto", cascade = CascadeType.ALL, orphanRemoval = true)
    private ProyectoCronograma proyectoCronograma;

    // Constructor, getters, and setters
}

