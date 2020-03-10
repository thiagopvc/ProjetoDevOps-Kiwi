import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_FUNCIONARIO")
@SequenceGenerator(name = "cod", sequenceName = "SQ_TB_FUNCIONARIO", allocationSize = 1)
public class Funcionario{
    @Id
    @Column(name = "cd_funcionario")
    @GeneratedValue(generator = "cod", strategy = GenerationType.SEQUENCE)
    private int codigo;

    @Column(name = "nm_funcionario")
    private String nome;

    @Column(name = "nr_rg_funcionario")
    private int rg;
    
    @Column(name = "dt_nascimento")
    private Calendar nascimento;

    @Column(name = "nr_cpf_funcionamento")
    private int cpf;


    public Funcionario(int codigo, String nome, int rg, Calendar nascimento, int cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.rg = rg;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

    public Funcionario(){
        super();
    }


    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return this.rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public Calendar getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

}