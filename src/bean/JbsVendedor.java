package bean;
// Generated 12/09/2023 09:26:38 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JbsVendedor generated by hbm2java
 */
@Entity
@Table(name="jbs_vendedor"
    ,catalog="db_janaina_silva"
)
public class JbsVendedor  implements java.io.Serializable {


     private int jbsIdVendedor;
     private String jbsNome;
     private String jbsCpf;
     private String jbsEmail;
     private String jbsCelular;
     private Date jbsDataNasc;
     private String jbsEstado;
     private char jbsGenero;
//     private Set jbsVendas = new HashSet(0);

    public JbsVendedor() {
    }

	
    public JbsVendedor(int jbsIdVendedor, String jbsNome, String jbsCpf, String jbsEmail, String jbsCelular, Date jbsDataNasc, String jbsEstado, char jbsGenero) {
        this.jbsIdVendedor = jbsIdVendedor;
        this.jbsNome = jbsNome;
        this.jbsCpf = jbsCpf;
        this.jbsEmail = jbsEmail;
        this.jbsCelular = jbsCelular;
        this.jbsDataNasc = jbsDataNasc;
        this.jbsEstado = jbsEstado;
        this.jbsGenero = jbsGenero;
    }
//    public JbsVendedor(int jbsIdVendedor, String jbsNome, String jbsCpf, String jbsEmail, String jbsCelular, Date jbsDataNasc, String jbsEstado, char jbsGenero, Set jbsVendas) {
//       this.jbsIdVendedor = jbsIdVendedor;
//       this.jbsNome = jbsNome;
//       this.jbsCpf = jbsCpf;
//       this.jbsEmail = jbsEmail;
//       this.jbsCelular = jbsCelular;
//       this.jbsDataNasc = jbsDataNasc;
//       this.jbsEstado = jbsEstado;
//       this.jbsGenero = jbsGenero;
//       this.jbsVendas = jbsVendas;
//    }
   
     @Id 

    
    @Column(name="jbs_id_vendedor", unique=true, nullable=false)
    public int getJbsIdVendedor() {
        return this.jbsIdVendedor;
    }
    
    public void setJbsIdVendedor(int jbsIdVendedor) {
        this.jbsIdVendedor = jbsIdVendedor;
    }

    
    @Column(name="jbs_nome", nullable=false, length=100)
    public String getJbsNome() {
        return this.jbsNome;
    }
    
    public void setJbsNome(String jbsNome) {
        this.jbsNome = jbsNome;
    }

    
    @Column(name="jbs_cpf", nullable=false, length=20)
    public String getJbsCpf() {
        return this.jbsCpf;
    }
    
    public void setJbsCpf(String jbsCpf) {
        this.jbsCpf = jbsCpf;
    }

    
    @Column(name="jbs_email", nullable=false, length=100)
    public String getJbsEmail() {
        return this.jbsEmail;
    }
    
    public void setJbsEmail(String jbsEmail) {
        this.jbsEmail = jbsEmail;
    }

    
    @Column(name="jbs_celular", nullable=false, length=20)
    public String getJbsCelular() {
        return this.jbsCelular;
    }
    
    public void setJbsCelular(String jbsCelular) {
        this.jbsCelular = jbsCelular;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="jbs_data_nasc", nullable=false, length=10)
    public Date getJbsDataNasc() {
        return this.jbsDataNasc;
    }
    
    public void setJbsDataNasc(Date jbsDataNasc) {
        this.jbsDataNasc = jbsDataNasc;
    }

    
    @Column(name="jbs_estado", nullable=false, length=2)
    public String getJbsEstado() {
        return this.jbsEstado;
    }
    
    public void setJbsEstado(String jbsEstado) {
        this.jbsEstado = jbsEstado;
    }

    
    @Column(name="jbs_genero", nullable=false, length=1)
    public char getJbsGenero() {
        return this.jbsGenero;
    }
    
    public void setJbsGenero(char jbsGenero) {
        this.jbsGenero = jbsGenero;
    }

//@OneToMany(fetch=FetchType.LAZY, mappedBy="jbsVendedor")
//    public Set getJbsVendas() {
//        return this.jbsVendas;
//    }
//    
//    public void setJbsVendas(Set jbsVendas) {
//        this.jbsVendas = jbsVendas;
//    }




}

