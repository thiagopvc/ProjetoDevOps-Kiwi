import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTO")
@SequenceGenerator(name="prod", sequenceName = "SQ_TB_PRODUTO", allocationSize = 1)

public class Produto{

    @Id
	@Column(name="cd_produto")
	@GeneratedValue(generator = "prod", strategy = GenerationType.SEQUENCE)
    private int cd_produto;

    @Collum(name = "cd_cnpj",nullable = false)
    private int cnpj_empresa;

    @Collum(name = "nm_produto")
    private String nm_produto;


    @Collum(name = "qt_produto")
    private int qt_produto;

    
    public Produto(){
    super( );
    }


    public int getCd_produto() {
        return this.cd_produto;
    }

    public void setCd_produto(int cd_produto) {
        this.cd_produto = cd_produto;
    }

    public int getCnpj_empresa() {
        return this.cnpj_empresa;
    }

    public void setCnpj_empresa(int cnpj_empresa) {
        this.cnpj_empresa = cnpj_empresa;
    }

    public String getNm_produto() {
        return this.nm_produto;
    }

    public void setNm_produto(String nm_produto) {
        this.nm_produto = nm_produto;
    }

    public int getQt_produto() {
        return this.qt_produto;
    }

    public void setQt_produto(int qt_produto) {
        this.qt_produto = qt_produto;
    }

    public Produto(int cd_produto, int cnpj_empresa, String nm_produto, int qt_produto) {
        this.cd_produto = cd_produto;
        this.cnpj_empresa = cnpj_empresa;
        this.nm_produto = nm_produto;
        this.qt_produto = qt_produto;
    }

   
}