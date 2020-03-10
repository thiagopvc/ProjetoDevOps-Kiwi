import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_FORNECEDOR")
@SequenceGenerator(name="fornecedor" , sequenceName = "SQ_TB_FORNECEDOR" , allocationSize = 1)
public class Fornecedor{
    
    @Id
    @Column(name = "nr_cnpj_empresa")
    @GeneratedValue(generator = "fornecedor", strategy = GenerationType.SEQUENCE)
    private int cnpj;

    @Column(name = "nm_empresa")
    private String nome;

    @Column(name = "ds_email")
    private String email;
    
    @Column(name = "nr_inscricao_estadual")
    private int inscricaoEstadual;

    @Column(name = "nr_telefone")
    private int telefone;

    @Column(name = "nm_contato")
    private String nomeContato;

    public Fornecedor(int cnpj , String nome , String email , int inscricaoEstadual , int telefone , String nomeContato) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
        this.inscricaoEstadual = inscricaoEstadual;
        this.telefone = telefone;
        this.nomeContato = nomeContato;
    }

    public Fornecedor() {
        super();
    }
   

    public int getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }

    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNomeContato() {
        return this.nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }
    

}