public class Conteudo {
  private String titulo;
  private int duracao;
  private boolean concluido;

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setduracao(int duracao) {
    this.duracao = duracao;
  }

  public int getDuracao() {
    return this.duracao;
  }

  public void setConcluido(Boolean concluido) {
    this.concluido = concluido;
  }

  public boolean getConcluido() {
    return this.concluido;
  }
}
