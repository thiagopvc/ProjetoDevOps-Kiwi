import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MOVIMENTO")
@SequenceGenerator(name = "cod", sequenceName = "SQ_TB_MOVIMENTO", allocationSize = 1)
public class Movimento{

    @Id
    @Column(name = "cd_movimento")
    @GeneratedValue(generator = "cod", strategy = GenerationType.SEQUENCE)
    private int cod;

    @Column(name = "cd_funcionario")
    private int cd_funcionario;

    @Column(name = "cd_produto")
    private int cd_produto;

    @Column(name = "qt_movimentos")
    private int quantidade;

    @Enumerated
    @Column(name = tp_movimentos)
    private Tipos tipo;


    public Movimento(int cod, int cd_funcionario, int cd_produto, int quantidade, Tipos tipo) {
        this.cod = cod;
        this.cd_funcionario = cd_funcionario;
        this.cd_produto = cd_produto;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public Movimento(){
        super();
    }


    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCd_funcionario() {
        return this.cd_funcionario;
    }

    public void setCd_funcionario(int cd_funcionario) {
        this.cd_funcionario = cd_funcionario;
    }

    public int getCd_produto() {
        return this.cd_produto;
    }

    public void setCd_produto(int cd_produto) {
        this.cd_produto = cd_produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Tipos getTipo() {
        return this.tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

}