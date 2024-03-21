public class Album {
    private String genero, ano, nome;
    Musica musica = new Musica();
    Pessoa pessoa = new Pessoa();
    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
   }

    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setMusica(Musica musica){
        this.musica = musica;
    }

    public Musica getMusica() {
        return musica;
    }

    public String getGenero() {
        return genero;
    }

    public String getAno() {
        return ano;
    }

    public String getNome() {
        return nome;
    }
    public String retornaDados(){
        return "";
    }
}
