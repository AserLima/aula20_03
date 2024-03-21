public class Musica {
    private String titulo;
    private String duracao;
    private String compositor;

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDuracao() {
        return duracao;
    }

    public String tocarMusica(){
        return "Tocando a musica: "+titulo+" Duracao: "+duracao+" "+compositor;
    }
}
